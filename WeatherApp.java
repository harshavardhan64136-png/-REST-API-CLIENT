import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherApp {
    // Replace with your OpenWeatherMap API Key
    private static final String API_KEY = "227611b664c4f4414bbf4c52d3c2abb0";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String city = "mumbai";  // You can change this
        getWeatherData(city);
    }

    public static void getWeatherData(String city) {
        try {
            // Build URL for API request
            String urlString = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);

            // Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            // Parse JSON response
            JSONObject json = new JSONObject(response.toString());

            String cityName = json.getString("name");
            JSONObject main = json.getJSONObject("main");
            double temperature = main.getDouble("temp");
            int humidity = main.getInt("humidity");

            JSONObject weather = json.getJSONArray("weather").getJSONObject(0);
            String description = weather.getString("description");

            // Display structured weather data
            System.out.println("=== Weather Report ===");
            System.out.println("City: " + cityName);
            System.out.println("Temperature: " + temperature + " °C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Condition: " + description);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
