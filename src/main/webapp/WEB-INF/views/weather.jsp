<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Weather</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
        <div class="box">
            <div id="container">
                <div id="window_main">
                    <div id="window_title">Weather</div>
                    <div id="window_text">
                        <h3>Weather Forecast</h3>
                        <p>The weather in ${weather.getLocation()} currently ${weather.getCurrentWeather()} with a temperature of ${weather.getTemperature()}&#8457;.</p>
                        <table>
                            <thead align="center">
                                <tr>
                                    <c:forEach items="${weather.getForecastTimes()}" var="time" >
                                        <td>${time}</td>
                                    </c:forEach>
                               </tr>
                            </thead>
                            <tbody align="center">
                                <tr>
                                    <c:forEach items="${weather.getIcons()}" var="forecast" varStatus="status" >
                                        <td>
                                            <img src="${forecast}"></img>
                                            <br/>
                                            <center><c:out value="${weather.getForecastWeather()[status.index]}"/></center>
                                            <br/>
                                            <center><c:out value="${weather.getFormattedForecast()[status.index]}"/></center>
                                        </td>
                                    </c:forEach>
                               </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>