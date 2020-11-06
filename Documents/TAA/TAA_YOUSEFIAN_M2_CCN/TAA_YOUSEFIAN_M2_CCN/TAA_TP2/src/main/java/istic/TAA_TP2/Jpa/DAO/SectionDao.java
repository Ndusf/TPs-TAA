package istic.TAA_TP2.Jpa.DAO;

import istic.TAA_TP2.Jpa.Metier.Section;

public class SectionDao extends AbstractJpaDao<String, Section> {

	public SectionDao() {
		super(Section.class);
		
	}
	
	private void listSection() {
		int  resultList = EntityManagerHelper.getEntityManager().createQuery("Select a From Section a", Section.class).getResultList().size();
        System.out.println("num of Section:" + resultList);
        
    }
	
	
}