<%--
  Created by IntelliJ IDEA.
  User: Stefaniak
  Date: 10.12.2020
  Time: 14:41
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>

<body>
    <div id="content" role="main" style="padding: 30px">
        <section class="row colset-2-its">
            <h5>${currentDate}</h5>

            <h1>Welcome ${name}!</h1>

            <h4>${flash.message}</h4>

            <p>There are ${vehicleTotal} vehicles in the database.</p>

            <form action="/home/updateName" method="post" style="margin: 0 auto; width:320px">
                <input type="text" name="name" value="" placeholder="give your name" id="name">
                <input type="submit" name="Update name" value="Update name" id="Update name">
            </form>

        </section>
    </div>

    <div style="text-align: center">
        <ul>
            <g:each in="${allVehicle}" var="vehicle">
                <li>
                    <g:link controller="vehicle" action="show" id="${vehicle.id}">
                        ${vehicle.type} - ${vehicle.year} ${vehicle.make.name} ${vehicle.model.name}
                    </g:link>
                </li>
            </g:each>
        </ul>
    </div>

</body>
</html>