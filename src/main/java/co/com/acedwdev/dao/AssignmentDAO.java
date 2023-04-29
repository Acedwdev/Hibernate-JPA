
package co.com.acedwdev.dao;


import co.com.acedwdev.domain.Assignment;
import jakarta.persistence.Query;
import java.util.List;

public class AssignmentDAO extends GenericDAO{
    
    public List<Assignment> list() {
        String queryC = "SELECT a FROM Assignment a";
        em = getEntityManager();
        Query query = em.createQuery(queryC);
        return query.getResultList();
    }

    public void insert(Assignment assignment) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(assignment);
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

    public void update(Assignment assignment) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(assignment);
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

    public void delete(Assignment assignment) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(assignment));
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
    
    public Assignment findById(Assignment assignment){
        em = getEntityManager();
        return em.find(Assignment.class, assignment.getIdAssignment());
    }
}


