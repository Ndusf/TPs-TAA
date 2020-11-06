package istic.TableauKanban.Metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User implements Serializable {
	private long id;
	private String nom;
	private List<Fiche> fiches;
	
	/**
	 * 
	 */
	public User(String nom) {
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
	 * @return the fiches
	 */
	@ManyToMany(mappedBy = "users")
	public List<Fiche> getFiches() {
		return fiches;
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
	 * @param fiches the fiches to set
	 */
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
	
	
	

}
