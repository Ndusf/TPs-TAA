package istic.TAA_TP2.Jpa.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.DELETE;

import istic.TAA_TP2.Jpa.Metier.Kanban;
import istic.TAA_TP2.Jpa.Metier.Section;



public class KanbanDao extends AbstractJpaDao<Long, Kanban>{
	private static EntityManager manager;
	/**
	 * @param clazz
	 */
	public KanbanDao() {
		super(Kanban.class);
		// TODO Auto-generated constructor stub
	}

    public void createKanbans()
    {
        int numOfKanban = EntityManagerHelper.getEntityManager().createQuery("Select a From Kanban as a", Kanban.class).getResultList().size();

        if (numOfKanban == 0)
        {
            Kanban kanbans = new Kanban();
            
            kanbans.add(new Kanban("TAA"));
            kanbans.add(new Kanban("GLI"));
            
            save(kanbans);
            
        }
    }
    
    public List<Kanban> findAllByName(String nom){
        return entityManager.createQuery("select e from Kanban as e where e.nom = :nom", Kanban.class).setParameter("nom", nom).getResultList();
    }
    
    public void deleteByName(String nom){
        for (Kanban kanban : findAllByName(nom))
        {
            delete(kanban);
        }
    }

	public void save(Section sec1) {
		// TODO Auto-generated method stub
		
	}
	/*
public static void saveKanban(Kanban kanban) {
	 EntityTransaction tx = manager.getTransaction();
	tx.begin();
	manager.persist(kanban);
	tx.commit();
}*/



}
