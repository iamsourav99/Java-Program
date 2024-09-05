<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Weather Information</title>
    <link rel="stylesheet" href="style2.css">
</head>
<body>
    <div class="container">
        <div class="weather-box">
            <h2 class="date">Date: ${date}</h2>
            <h2 class="city">Weather in ${city}</h2>
            <h2 class="condition">Condition: ${weathercondition}</h2>
            <div class="weather-details">
                <p>Temperature: ${temp} °C</p>
                <p>Humidity: ${humidity} %</p>
                <p>Wind Speed: ${windspeed} km/h</p>
            </div>
            <button class="btn" onclick="window.location.href='index.html'">Check Another Location</button>
        </div>
    </div>
</body>
</html>
