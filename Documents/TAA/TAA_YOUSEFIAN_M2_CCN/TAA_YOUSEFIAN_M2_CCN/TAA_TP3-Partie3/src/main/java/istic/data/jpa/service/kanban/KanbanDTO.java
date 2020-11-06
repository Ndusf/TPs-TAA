package istic.data.jpa.service.kanban;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import istic.data.jpa.service.section.SectionDTO;

@ApiModel(value ="Kanban Model")
public class KanbanDTO implements Comparable<KanbanDTO> {
	
	@ApiModelProperty(value = "kanban nom")
	private String nom;
	
	@ApiModelProperty(value = "kanban id")
	private long id;

	@ApiModelProperty(value = "kanban section")
	private SectionDTO sectionDTO;
	
	
	/**
	 * 
	 */
	public KanbanDTO() {
		super();
	}

	/**
	 * @param nom
	 * @param id
	 * @param sectionDTO
	 */
	public KanbanDTO(String nom, long id, SectionDTO sectionDTO) {
		super();
		this.nom = nom;
		this.id = id;
		this.sectionDTO = sectionDTO;
	}

	@Override
	public int compareTo(KanbanDTO arg0) {
		return nom.compareToIgnoreCase(arg0.getNom());
	}

	public String getNom() {
		return nom;
	}

	/**
	 * @return the id
	 */

	public long getId() {
		return id;
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

	public SectionDTO getSection() {
		return sectionDTO;
	}

	public void setSection(SectionDTO section) {
		this.sectionDTO = section;
		
	}
	

}
