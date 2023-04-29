<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/459ac70d11.js" crossorigin="anonymous"></script>
        <title>Student List</title>
    </head>
    <body>
        <div class="container mt-4">
            <h2>Student List</h2>
            <a href="${pageContext.request.contextPath}/RedirectServlet"
               class="btn btn-primary">
                <i class="fa-solid fa-list"></i> Add</a>
        </div>
        <section id="students">
            <div class="container">
                <div class="row">
                    <div class="col-md-9">
                        <div class="card">   
                            <table class="table table-striped">
                                <thead class="thead thead-dark">   
                                    <tr>
                                        <th>ID Student</th>
                                        <th>Name</th>
                                        <th>Address</th>
                                        <th>Email</th>
                                        <th>Phone</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="student" items="${students}">
                                        <tr>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/ModifyServlet?idStudent=${student.idStudent}">
                                                    ${student.idStudent}
                                                </a>
                                            </td>                          
                                            <td>${student.name} ${student.lastName}</td>
                                            <td>${student.address.street} ${student.address.streetnumber} ${student.address.country}</td>
                                            <td>${student.contact.email}</td>
                                            <td>${student.contact.phone}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
    </body>
</html>
