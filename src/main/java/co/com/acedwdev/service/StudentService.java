
package co.com.acedwdev.service;

import co.com.acedwdev.dao.StudentDAO;
import co.com.acedwdev.domain.Student;
import java.util.List;


public class StudentService {
    private StudentDAO studentDao = new StudentDAO();
    
    public List<Student> studentList(){
        return studentDao.list();
    }
    
    public void saveStudent(Student student){
        if( student != null && student.getIdStudent() == null){
            studentDao.insert(student);
        }
        else{
            studentDao.update(student);
        }
    }
    
    public void deleteStudent(Student student){
        studentDao.delete(student);
    }
    
    public Student findStudent(Student student){
        return studentDao.findById(student);
    }
}
