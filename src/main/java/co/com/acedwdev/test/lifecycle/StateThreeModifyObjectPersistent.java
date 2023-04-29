
package co.com.acedwdev.test.lifecycle;

import co.com.acedwdev.domain.Contact;
import jakarta.persistence.*;


public class StateThreeModifyObjectPersistent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Contact contact = null;
       
        contact = em.find(Contact.class, 3);        
        
        contact.setEmail("bmurray@mail.com");        
        
        em.getTransaction().begin();
        
        em.persist(contact);//        
        
        em.getTransaction().commit();
        
        System.out.println("contact = " + contact);
    }
}
