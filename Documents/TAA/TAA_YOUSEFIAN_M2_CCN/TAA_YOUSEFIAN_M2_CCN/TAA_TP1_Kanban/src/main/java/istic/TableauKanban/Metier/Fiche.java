package istic.TableauKanban.Metier;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Fiche {
	private long id;
	private String libelle;
	private String lieu;
	private List<String> tag;
	private Date dateButoir;
	private String dateMax;
	private User users;
	private String notes;
	private Section sections;



	/**
	 * 
	 */
	public Fiche() {
		super();
		
	}
	
	
	/**
	 * @param id
	 * @param libelle
	 * @param lieu
	 * @param string
	 * @param dateButoir
	 * @param dateMax
	 * @param user
	 * @param notes
	 */
	//Fiche fiche1 = new Fiche( "fiche1", "IRMAR", "TP1", new Date(), "12h" , new User("Neda"), "TAA");
	public Fiche(String libelle, String lieu, Date dateButoir, String dateMax, User users,
			String notes) {
		super();
		this.libelle = libelle;
		this.lieu = lieu;
		this.dateButoir = dateButoir;
		this.dateMax = dateMax;
		this.users = users;
		this.notes = notes;
	}


	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * @return the tag
	 */
	@ElementCollection
	//@JoinColumn(name = "KanbanId")
	public List<String> getTag() {
		return tag;
	}
	/**
	 * @return the dateButoir
	 */
	public Date getDateButoir() {
		return dateButoir;
	}
	/**
	 * @return the dateMax
	 */
	public String getDateMax() {
		return dateMax;
	}
	/**
	 * @return the users
	 */
	@ManyToOne(cascade = CascadeType.PERSIST)
	public User getUsers() {
		return users;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	/**
	 * @param tag the tag to set
	 */
	@ElementCollection
	public void setTag(List<String> tag) {
		this.tag = tag;
	}
	/**
	 * @param dateButoir the dateButoir to set
	 */
	public void setDateButoir(Date dateButoir) {
		this.dateButoir = dateButoir;
	}
	/**
	 * @param dateMax the dateMax to set
	 */
	public void setDateMax(String dateMax) {
		this.dateMax = dateMax;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(User users) {
		this.users = users;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	/**
	 * @return the sections
	 */
	@ManyToOne
	public Section getSections() {
		return sections;
	}


	/**
	 * @param sections the sections to set
	 */
	public void setSections(Section sections) {
		this.sections = sections;
	}
	
	public void addTag(String sec) {
		tag.add(sec);
	}
	
	public void removeTag(String sec) {
		tag.remove(sec);
	}

}
