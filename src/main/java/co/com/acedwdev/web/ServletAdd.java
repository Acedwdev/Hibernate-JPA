
package co.com.acedwdev.web;

import co.com.acedwdev.domain.Address;
import co.com.acedwdev.domain.Contact;
import co.com.acedwdev.domain.Student;
import co.com.acedwdev.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/ServletAdd")
public class ServletAdd extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String street = request.getParameter("street");
        String streetNumber = request.getParameter("streetnumber");
        String country = request.getParameter("country");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        
        Address address = new Address();
        address.setStreet(street);
        address.setStreetnumber(streetNumber);
        address.setCountry(country);
        
        Contact contact = new Contact();
        contact.setEmail(email);
        contact.setPhone(phone);
        
        Student student = new Student();
        student.setName(name);
        student.setLastName(lastName);
        student.setAddress(address);
        student.setContact(contact);
        
        StudentService studentService = new StudentService();
        studentService.saveStudent(student);
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
