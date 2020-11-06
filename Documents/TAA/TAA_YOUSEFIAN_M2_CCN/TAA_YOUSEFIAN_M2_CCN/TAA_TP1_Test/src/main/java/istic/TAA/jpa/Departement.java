package istic.TAA.jpa;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	
	private long id;
	private String name;
	Collection<Employee> empolyees;
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the empolyees
	 */
	@OneToMany(mappedBy = "d", cascade = {CascadeType.PERSIST, CascadeType.PERSIST}, fetch = FetchType.EAGER)
	public Collection<Employee> getEmpolyees() {
		return empolyees;
	}
	/**
	 * @param empolyees the empolyees to set
	 */
	public void setEmpolyees(Collection<Employee> empolyees) {
		this.empolyees = empolyees;
	}

}
