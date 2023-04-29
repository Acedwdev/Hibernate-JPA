
package co.com.acedwdev.dao;

import co.com.acedwdev.domain.Student;
import jakarta.persistence.Query;
import java.util.List;


public class StudentDAO extends GenericDAO{
    
    public List<Student> list() {
        String queryC = "SELECT a FROM Student a";
        em = getEntityManager();
        Query query = em.createQuery(queryC);
        return query.getResultList();
    }

    public void insert(Student student) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void update(Student student) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void delete(Student student) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(student));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public Student findById(Student student){
        em = getEntityManager();
        return em.find(Student.class, student.getIdStudent());
    }
}

