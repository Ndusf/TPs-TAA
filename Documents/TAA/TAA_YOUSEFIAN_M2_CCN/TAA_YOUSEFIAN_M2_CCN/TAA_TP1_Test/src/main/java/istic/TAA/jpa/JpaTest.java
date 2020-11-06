package istic.TAA.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

public class JpaTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            Employee p = new Employee();
            Employee p1 = new Employee();
            p.setFristName("Neda");
            p.setEmail("nd@yahoo.fr");
            p.setLastName("YOUSEFIAN");
            
            
           
            manager.persist(p);
   
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
       
        String query = "Select e from Employee as e where e.lastName=:name";
        List<Employee> res = manager.createQuery(query, Employee.class).setParameter("name", "YOUSEFIAN").getResultList();
        System.out.println("num of employess:" + res.size());
        for (Employee next : res) {
            System.out.println("next employee: " + next);
        }

        
       /* String query = "Select e from Employee as e";
        List<Employee> res = manager.createQuery(query, Employee.class).getResultList();
        System.out.println("num of employess:" + res.size());
        for (Employee next : res) {
            System.out.println("next employee: " + next);
        }*/
        manager.close();
        factory.close();
    }

}
