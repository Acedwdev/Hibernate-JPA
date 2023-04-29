
package co.com.acedwdev.test;

import co.com.acedwdev.dao.AddressDAO;
import co.com.acedwdev.dao.AssignmentDAO;
import co.com.acedwdev.dao.ContactDAO;
import co.com.acedwdev.dao.CourseDAO;
import co.com.acedwdev.dao.StudentDAO;
import java.util.List;


public class TestDAO {
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDAO();
        System.out.println("Student:");
        print(studentDao.list());
        
        System.out.println("Address:");
        AddressDAO addressDao = new AddressDAO();
        print(addressDao.list());
        
        System.out.println("Contact:");
        ContactDAO contactDao = new ContactDAO();
        print(contactDao.list());
        
        System.out.println("Course:");
        CourseDAO courseDao = new CourseDAO();
        print(courseDao.list());
        
        System.out.println("Assignment:");
        AssignmentDAO assignmentDao = new AssignmentDAO();
        print(assignmentDao.list());
    }
    
    private static void print(List colection){
        for(Object o: colection){
            System.out.println("valor = " + o);
        }
    }
   
}
