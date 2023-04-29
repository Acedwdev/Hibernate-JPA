
package co.com.acedwdev.dao;

import static co.com.acedwdev.dao.GenericDAO.em;
import co.com.acedwdev.domain.Contact;
import jakarta.persistence.Query;
import java.util.List;


public class ContactDAO extends GenericDAO{
    
    public List<Contact> list() {
        String queryC = "SELECT c FROM Contact c";
        em = getEntityManager();
        Query query = em.createQuery(queryC);
        return query.getResultList();
    }

    public void insert(Contact contact) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contact);
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

    public void update(Contact contact) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contact);
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

    public void delete(Contact contact) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contact));
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
    
    public Contact findById(Contact contact){
        em = getEntityManager();
        return em.find(Contact.class, contact.getIdContact());
    }
}
