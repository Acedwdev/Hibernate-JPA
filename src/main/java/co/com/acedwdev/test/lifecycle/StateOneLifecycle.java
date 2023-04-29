
package co.com.acedwdev.test.lifecycle;

import co.com.acedwdev.domain.Contact;
import jakarta.persistence.*;


public class StateOneLifecycle {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        
        Contact contact = new Contact();
        contact.setEmail("bmurray");
        contact.setPhone("1502-3501");        
       
        em.getTransaction().begin();
        
        em.persist(contact);
        
        em.getTransaction().commit();        
       
        System.out.println("contact = " + contact);
    }
}
