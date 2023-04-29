
package co.com.acedwdev.test.cascade;

import co.com.acedwdev.domain.Address;
import co.com.acedwdev.domain.Contact;
import co.com.acedwdev.domain.Student;
import jakarta.persistence.*;


public class TestPersistenceCascade {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Address address = new Address();
        address.setStreet("Everest");
        address.setStreetnumber("10");
        address.setCountry("Colombia");
        
        Contact contact = new Contact();
        contact.setEmail("bmurray@mail.com");
        contact.setPhone("2030-0201");

        Student student = new Student();
        student.setName("Bill");
        student.setLastName("Murray");
        student.setAddress(address);
        student.setContact(contact);
        
        em.getTransaction().begin();
        
        em.persist(student);
        
        em.getTransaction().commit(); 
        
        System.out.println("student = " + student);
    }
}
