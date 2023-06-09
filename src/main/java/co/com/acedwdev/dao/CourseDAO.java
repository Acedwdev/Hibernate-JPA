
package co.com.acedwdev.dao;

import co.com.acedwdev.domain.Course;
import jakarta.persistence.Query;
import java.util.List;


public class CourseDAO extends GenericDAO{
    
    public List<Course> list() {
        String queryC = "SELECT c FROM Course c";
        em = getEntityManager();
        Query query = em.createQuery(queryC);
        return query.getResultList();
    }

    public void insert(Course course) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(course);
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

    public void update(Course course) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(course);
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

    public void delete(Course course) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(course));
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
    
    public Course findById(Course course){
        em = getEntityManager();
        return em.find(Course.class, course.getIdCourse());
    }
}
