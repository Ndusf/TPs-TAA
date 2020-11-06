package istic.TAA_TP2.Jpa.Metier;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Section implements Serializable{

	private long id;
	private String nom;
	private List<Fiche> fiches;
	private Kanban kanban;
	
	/**
	 * @param nom
	 * @param fiches
	 */
	public Section(String nom) {
		super();
		this.nom = "nom1";
	
	}

	/**
	 * @param nom
	 * @param kanban
	 * @param fiches 
	 */
	public Section(String nom, Kanban kanban) {
		super();
		this.nom = "nom1";
		this.kanban = kanban;
		this.fiches = fiches;
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
	@OneToMany
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
	
	
	/**
	 * @return the kanban
	 */
	@ManyToOne(cascade = CascadeType.PERSIST)
	public Kanban getKanban() {
		return kanban;
	}

	/**
	 * @param kanban the kanban to set
	 */
	public void setKanban(Kanban kanban) {
		this.kanban = kanban;
	}
	
	public void addFiche(Fiche fiches) {
		/*for (Fiche fiche: fiches) {
		this.fiches.add(fiche);
		}*/
		
	}
	
	public void removeFiche(Fiche fiches) {
	/*	for (Fiche fiche: fiches) {
		this.fiches.remove(fiche);
		}*/
	}
	
}
