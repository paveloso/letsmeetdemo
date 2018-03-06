<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Save Customer</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-event-style.css">

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <h3>Save Customer</h3>

    <form:form action="saveEvent" modelAttribute="event" method="POST">


        <table>
            <tbody>
            <tr>
                <td><label>Date</label></td>
                <td><form:input path="date" /></td>
            </tr>

            <tr>
                <td><label>Name</label></td>
                <td><form:input path="name" /></td>
            </tr>

            <tr>
                <td><label>Short Info</label></td>
                <td><form:input path="info" /></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save" /></td>
            </tr>


            </tbody>
        </table>

    </form:form>

    <div style="clear: both"></div>

    <p>
        <a href="${pageContext.request.contextPath}/event/list">Back to List</a>
    </p>

</div>

</body>

</html>