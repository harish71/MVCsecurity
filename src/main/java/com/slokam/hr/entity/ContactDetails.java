package com.slokam.hr.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class ContactDetails implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private Long  number;
  private String  email;
  private String  landline;
  private String  fax;
@OneToOne 
@JoinColumn(name="fkid20") 
  private Personal  person;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Long getNumber() {
		return number;
	}
public void setNumber(Long number) {
		this.number = number;
	}
public String getEmail() {
		return email;
	}
public void setEmail(String email) {
		this.email = email;
	}
public String getLandline() {
		return landline;
	}
public void setLandline(String landline) {
		this.landline = landline;
	}
public String getFax() {
		return fax;
	}
public void setFax(String fax) {
		this.fax = fax;
	}
public Personal getPerson() {
		return person;
	}
public void setPerson(Personal person) {
		this.person = person;
	}
}