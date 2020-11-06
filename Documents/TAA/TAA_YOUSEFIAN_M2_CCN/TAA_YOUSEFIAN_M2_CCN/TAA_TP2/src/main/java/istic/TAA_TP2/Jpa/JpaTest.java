package istic.TAA_TP2.Jpa;
import java.util.Date;
/*
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
*/

import istic.TAA_TP2.Jpa.DAO.KanbanDao;
import istic.TAA_TP2.Jpa.Metier.Kanban;


public class JpaTest {
	//private EntityManager manager;
	

/**
	 * @param manager
	 */
	/*public JpaTest(EntityManager manager) {
		super();
		this.manager = manager;
	}
*/

public static void main(String[] args) {
      /* EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();
        JpaTest test = new JpaTest(manager);
        EntityTransaction tx = manager.getTransaction();
        tx.begin();*/
        KanbanDao dao = new KanbanDao();
    	Kanban kanban = new Kanban();
    	kanban.setNom("Neda");
    	dao.save(kanban);
    	/*
    	Section sec1 = new Section("A faire", kanban);
    	Section sec2 = new Section("En cours", kanban);
    	Section sec3 = new Section("Terminer", kanban);
    	
    	dao.save(sec1);*/
        try {
        	/*Kanban kanban = new Kanban();
        	
        	Section sec1 = new Section("A faire", kanban);
        	Section sec2 = new Section("En cours", kanban);
        	Section sec3 = new Section("Terminer", kanban);
       	    
        	/*kanban.getSections().add(sec1);
        	kanban.getSections().add(sec2);
        	kanban.getSections().add(sec3);
        	*/
        	/*manager.persist(sec1);
        	manager.persist(sec2);
        	manager.persist(sec3);
        
        	Fiche fiche1 = new Fiche( "fiche1", "IRMAR", new Date(), "12h" , new User("Neda"), "TAA");
        	Fiche fiche2 = new Fiche( "fiche2", "ISTIC", new Date(), "12h" , new User("Pierre"), "GLI");
        	Fiche fiche3 = new Fiche( "fiche3", "IPR", new Date(), "12h" , new User("Yann"), "GUI");
        	
        	//sec2.addFiche(fiche1, fiche3);
        	sec3.addFiche(fiche1);
        	manager.persist(fiche3);
        	*/
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
       /* tx.commit();
       
        manager.close();
        factory.close();*/
    }


   
}
