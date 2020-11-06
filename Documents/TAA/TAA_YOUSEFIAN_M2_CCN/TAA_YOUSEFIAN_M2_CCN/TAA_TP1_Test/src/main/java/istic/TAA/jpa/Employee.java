package istic.TAA.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="Employees")
@NamedQueries(
		{@NamedQuery(name = "touslesemployee ", query= "select e from Employee e "),
		 @NamedQuery(name = "touslesemployeePARNOM ", query= "select e from Employee as e where e.lastName=:name")
		})
public class Employee { 
	
	private long id;
	private String fristName;
	private String lastName; 
	private String email;
	Departement d;

	/**
	 * @return the d
	 */
	@ManyToOne
	public Departement getD() {
		return d;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(Departement d) {
		this.d = d;
	}

	/**
	 * @param id
	 * @param fristName
	 * @param lastName
	 * @param email
	 */
	public Employee(long id, String fristName, String lastName, String email) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
	}

	public Employee() {
		super();
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
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fristName
	 */
	@Column(length = 30)
	public String getFristName() {
		return fristName;
	}

	/**
	 * @param fristName the fristName to set
	 */
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	
}
