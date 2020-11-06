package istic.TAA_TP2.Jpa.DAO;

import java.util.List;

import istic.TAA_TP2.Jpa.Metier.User;



public class UserDao extends AbstractJpaDao<String, User>{

	public UserDao() {
		super(User.class);
	}
	public List<User> getUserOwen(){
		
		//String query = "select distinc  k.user from Kanban as k";
		String query = "select * from Kanban ";
		return this.entityManager.createQuery(query).getResultList();
		
	}

}
