package istic.TableauKanban.DAO;


import istic.TableauKanban.Metier.Section;

public class SectionDao extends AbstractJpaDao<String, Section> {

	public SectionDao() {
		super(Section.class);
		
	}
	
	private void listSection() {
		int  resultList = EntityManagerHelper.getEntityManager().createQuery("Select * From Section a", Section.class).getResultList().size();
        System.out.println("num of Section:" + resultList);
        
    }
	
	
}