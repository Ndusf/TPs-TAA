package istic.TableauKanban.Metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Kanban implements Serializable {

	private long id;
	private String nom;
	private List<Section> sections;
	/**
	 * constructor
	 */
	public Kanban() {
		super();
		//this.sections = new ArrayList<>();
   
	}
	
	
	/**
	 * @param nom
	 */
	public Kanban(String nom) {
		super();
		this.nom = nom;
		
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the sections
	 */
	@OneToMany(mappedBy = "kanban")
	public List<Section> getSections() {
		return sections;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param sections the sections to set
	 */
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}


	public void add(Kanban kanban) {
		this.add(kanban);
		
	}


	public void remove(Kanban kanban) {
		this.remove(kanban);
		
	}


	
	
}
