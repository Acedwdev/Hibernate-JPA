<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/459ac70d11.js" crossorigin="anonymous"></script>
        <title>Add Student</title>
    </head>
    <body>
        <div class="container mt-4">
            <h3>Add Student</h3>
            <form name="form1" action="${pageContext.request.contextPath}/ModifyServlet" method="post">
                <input type="hidden" name="idStudent" value="${student.idStudent}" />

                <label for="name">Name</label><br/>
                <input type="text" name="name" value="${student.name}"><br/>
                <label for="lastName">Last Name</label><br/>
                <input type="text" name="lastName" value="${student.lastName}"><br>                 
                <h4>Address Info</h4>
                <label for="street">Street</label><br/>
                <input type="text" name="street" value="${student.address.street}"><br>                               
                <label for="streetnumber">Street Number</label><br/>
                <input type="text" name="streetnumber" value="${student.address.streetnumber}"><br>                                
                <label for="country">Country</label><br/>
                <input type="text" name="country" value="${student.address.country}"><br>
                <h4>Contact Info</h4>
                <label for="email">Email</label><br/>
                <input type="email" name="email" value="${student.contact.email}"><br>
                <label for="phone">Phone</label><br/>
                <input type="tel" name="phone" value="${student.contact.phone}"><br><br>                    
                <button class="btn btn-success" type="submit" name="Modify" value="Modify">Modify</button>
                <button class="btn btn-danger" type="submit" name="Delete" value="Delete">Delete</button>


<!--Name: <input type="text" name="name" value="${student.name}"/>
<br/>
lastName: <input type="text" name="lastName" value="${student.lastName}"/>
<br/>
<br/>
Addess Info:
<br/>
Street: <input type="text" name="street" value="${student.address.street}">
<br/>
Street Number: <input type="text" name="streetnumber" value="${student.address.streetnumber}"/>
<br/>
Country: <input type="text" name="country" value="${student.address.country}"/>
<br/>
<br/>
Contact Info:
<br/>
Email: <input type="email" name="email" value="${student.contact.email}">
<br/>
Phone: <input type="tel" name="phone" value="${student.contact.phone}">
<br/>
<input type="submit" name="Modify" value="Modify">
<input type="submit" name="Delete" value="Delete">-->
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
    </body>
</html>
