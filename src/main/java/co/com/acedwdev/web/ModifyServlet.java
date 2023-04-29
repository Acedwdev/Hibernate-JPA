package co.com.acedwdev.web;

import co.com.acedwdev.domain.Student;
import co.com.acedwdev.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStudentS = request.getParameter("idStudent");
        Integer idStudent = Integer.parseInt(idStudentS);

        Student student = new Student();
        student.setIdStudent(idStudent);

        StudentService studentService = new StudentService();
        student = studentService.findStudent(student);

        HttpSession session = request.getSession();
        session.setAttribute("student", student);

        request.getRequestDispatcher("/WEB-INF/modifyStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        StudentService studentService = new StudentService();

        String modify = request.getParameter("Modify");

        if (modify != null) {

            String name = request.getParameter("name");
            String lastName = request.getParameter("lastName");
            String street = request.getParameter("street");
            String streetNumber = request.getParameter("streetnumber");
            String country = request.getParameter("country");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            HttpSession session = request.getSession();
            Student student = (Student) session.getAttribute("student");

            student.setName(name);
            student.setLastName(lastName);
            student.getAddress().setStreet(street);
            student.getAddress().setStreetnumber(streetNumber);
            student.getAddress().setCountry(country);
            student.getContact().setEmail(email);
            student.getContact().setPhone(phone);

            studentService.saveStudent(student);

            session.removeAttribute("student");
        } else {
            String idStudentS = request.getParameter("idStudent");
            Integer idStudent = Integer.parseInt(idStudentS);
            Student student = new Student(idStudent);
            studentService.deleteStudent(student);
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
