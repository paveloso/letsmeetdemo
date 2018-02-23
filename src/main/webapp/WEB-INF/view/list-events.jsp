<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
    <title>List of Events</title>

    <!-- reference our style sheet -->

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>Upcoming Events:</h2>
    </div>
</div>

<div id="container">

    <div id="content">

        <!-- add our html table here -->
        <table>
            <tr>
                <th>Date</th>
                <th>Name</th>
                <th>Info</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempEvent" items="${events}">

                <tr>
                    <td> ${tempEvent.date} </td>
                    <td> ${tempEvent.name} </td>
                    <td> ${tempEvent.info} </td>
                </tr>

            </c:forEach>

        </table>

        <p>
        <a href="/">Back to index</a>

    </div>

</div>

</body>

</html>