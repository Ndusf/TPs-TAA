package istic.data.jpa.service.section;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import istic.data.jpa.domain.Fiche;
import istic.data.jpa.domain.Kanban;
import istic.data.jpa.domain.Section;

@ApiModel(value = "Section Model")
public class SectionDTO implements Comparable<SectionDTO>{

	@ApiModelProperty(value = "Section id")
	private long id;
	
	@ApiModelProperty(value = "Section nom")
	private String nom;
	
	@ApiModelProperty(value = "Section fiches")
	private List<Fiche> fiches;
	
	@ApiModelProperty(value = "Section kanban")
	private Kanban kanban;
	
	public  SectionDTO(List<Section> list) {
		
	}
	
	/**
	 * @param id
	 * @param nom
	 * @param kanban
	 */
	public SectionDTO(long id, String nom, Kanban kanban, List<Fiche> fiches) {
		super();
		this.id = id;
		this.nom = nom;
		this.kanban = kanban;
		this.fiches = fiches;

	}

	

		/**
	 * 
	 */
	public SectionDTO() {
		super();
	}

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
		public Kanban getKanban() {
			return kanban;
		}

		/**
		 * @param kanban the kanban to set
		 */
		public void setKanban(Kanban kanban) {
			this.kanban = kanban;
		}
		

	@Override
	public int compareTo(SectionDTO arg0) {
		return nom.compareToIgnoreCase(arg0.getNom());
	}

}
