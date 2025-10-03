# -REST-API-CLIENT

*COMPANY* : CODTECH IT SOLUTIONS

*NAME* : ALLURI HARSHA VARDHAN

*INTERN ID*: CT06DY2897

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTHOSH

*DESCRIPTION*:

The WeatherApp.java program is a simple Java application designed to fetch and display current weather information for a specified city using the OpenWeatherMap API. It demonstrates key Java concepts such as networking, JSON parsing, and user-defined methods, providing a practical example of consuming RESTful web services in Java.The program begins by importing necessary Java classes for network communication and data reading. It uses java.net.URL and java.net.HttpURLConnection to establish a connection with the OpenWeatherMap API. BufferedReader and InputStreamReader are employed to read the response from the API efficiently, converting the input stream into a readable string format. Additionally, the program imports org.json.JSONObject to parse JSON-formatted responses from the API. The use of this library enables structured access to data fields in the JSON response.At the start of the program, two constants are defined: API_KEY and BASE_URL. API_KEY holds the user’s unique OpenWeatherMap API key, which is required to authenticate requests. BASE_URL stores the endpoint URL for fetching current weather data. By combining the base URL with city names and API keys, the program dynamically constructs a valid API request URL.The main method specifies a default city, in this case “Mumbai,” and calls the getWeatherData method. This method is the core of the application. It accepts a city name as input, builds the API request URL, and establishes an HTTP GET connection to the OpenWeatherMap server. Upon sending the request, the method reads the response line by line using a BufferedReader and concatenates it into a single string representing the JSON response.Once the response is obtained, the program uses the JSONObject class to parse the JSON string. It first extracts the city name from the JSON object to confirm the requested location. Then, it retrieves the "main" object, which contains key weather parameters such as "temp" for temperature and "humidity" for relative humidity. The program converts the temperature and humidity values into appropriate data types (double and int) and stores them in local variables for display.Next, the program accesses the "weather" array within the JSON response, which holds descriptive information about the current weather condition. By selecting the first element of this array, it retrieves the "description" field, which provides a human-readable summary such as “clear sky” or “light rain.” These values are then printed to the console in a structured format.The program also implements error handling using a try-catch block. Any exceptions arising from network issues, invalid API responses, or JSON parsing errors are caught, and a descriptive error message is printed to ensure the program does not crash unexpectedly.Overall, the WeatherApp.java program efficiently demonstrates how to consume a public REST API in Java, handle HTTP requests, parse JSON responses, and display structured information. Its modular design, clear separation of networking and parsing logic, and use of standard Java libraries make it an excellent example for beginners learning about APIs, JSON parsing, and practical Java programming techniques. It provides a foundation that can be extended with additional features such as user input, multiple city queries, or graphical interfaces for weather display.

*OUTPUT* :

<img width="252" height="110" alt="Image" src="https://github.com/user-attachments/assets/4e33cf61-09e8-42fd-9833-da1c1989f416" />

<img width="267" height="111" alt="Image" src="https://github.com/user-attachments/assets/976c1f37-96fc-4177-adac-65465d591084" />

<img width="224" height="116" alt="Image" src="https://github.com/user-attachments/assets/10726086-a291-4ff4-9fe9-3f8bdbc2ece7" />

<img width="259" height="111" alt="Image" src="https://github.com/user-attachments/assets/1c0553e7-6e02-41e0-9011-cec5f131a47e" />

<img width="259" height="117" alt="Image" src="https://github.com/user-attachments/assets/4003c7ee-a25d-4f69-b628-72d70ba7e404" />

