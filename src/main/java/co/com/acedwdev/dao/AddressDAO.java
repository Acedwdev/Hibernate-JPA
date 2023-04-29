
package co.com.acedwdev.dao;


import co.com.acedwdev.domain.Address;
import jakarta.persistence.Query;
import java.util.List;

public class AddressDAO extends GenericDAO{
    
    public List<Address> list() {
        String queryA = "SELECT a FROM Address a";
        em = getEntityManager();
        Query query = em.createQuery(queryA);
        return query.getResultList();
    }

    public void insert(Address address) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(address);
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

    public void update(Address address) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(address);
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

    public void delete(Address address) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(address));
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
    
    public Address findById(Address address){
        em = getEntityManager();
        return em.find(Address.class, address.getIdAddress());
    }
}
