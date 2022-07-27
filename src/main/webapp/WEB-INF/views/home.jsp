<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
        <div class="box">
            <div id="container">
                <div id="window_main">
                    <div id="window_title">Weather</div>
                    <div id="window_text">
                        <h3>Enter your latitude/longitude:</h3>
                        <form action="/weather" method="POST">
                          <label for="latitude">latitude:</label>
                          <input type="number" step="0.01" value="42.38" name="latitude"/><br><br>
                          <label for="longitude">longitude:</label>
                          <input type="number" step="0.01" value="-83.10" name="longitude"/><br><br>
                          <input type="submit" value="Submit">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>