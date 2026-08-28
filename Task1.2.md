## Task 1.2
# Question 1
I chose –	https://openweathermap.org/api for this task.
Which three endpoints did you find, and what does each one return? 
Endpoint 1: Current Weather Data
Page: https://openweathermap.org/current
This endpoint returns the current weather for one city or one location. It returns data like temperature, humidity, wind, and weather description.

Endpoint 2: 5 Day / 3 Hour Forecast
Page: https://openweathermap.org/forecast5
This endpoint returns weather forecasts. It gives one forecast for every 3 hours, for the next 5 days.

Endpoint 3: Geocoding API
Page: https://openweathermap.org/api/geocoding-api
This endpoint returns the latitude and longitude of a city name.
# Quesion 2
Which HTTP method does each endpoint use, and why does that choice make sense?
All three endpoints use the GET method. This makes sense. GET is the correct method when you only ask for data.
# Question 3
What happens, according to the documentation, when you ask for something that does not exist?
API calls return an error 404- You can get this error when you specified the wrong city name, ZIP-code or city ID. For your reference, this list contains City name, City ID, Geographical coordinates of the city (lon, lat), Zoom, etc.
API calls return an error 401
You can get the error 401 in the following cases:
You did not specify your API key in API request.
Your API key is not activated yet. Within the next couple of hours, it will be activated and ready to use.
You are using wrong API key in API request. Please, check your right API key in personal account.