
package co.com.acedwdev.web;

import co.com.acedwdev.domain.Student;
import co.com.acedwdev.service.StudentService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.List;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        StudentService studentService = new StudentService();
        
        List<Student> students = studentService.studentList();
        
        request.setAttribute("students", students);
        
        try {
            request.getRequestDispatcher("/WEB-INF/studentList.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
