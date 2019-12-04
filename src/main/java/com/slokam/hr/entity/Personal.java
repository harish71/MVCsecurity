package com.slokam.hr.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Personal implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  lastName;
  private String  firstName;
  private String  middleName;
   @ManyToOne() 
@JoinColumn(name="fkid11") 
   private Gender  gender;
   @ManyToOne() 
@JoinColumn(name="fkid12") 
   private MaritalStatus  maritalStatus;
   
  private Date  marriageDate;
  
   @ManyToOne() 
@JoinColumn(name="fkid13") 
   private State  state;
   @ManyToOne() 
@JoinColumn(name="fkid14") 
   private Religion  religion;
   @ManyToOne() 
@JoinColumn(name="fkid15") 
   private Country  nationality;
   
   
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getLastName() {
		return lastName;
	}
public void setLastName(String lastName) {
		this.lastName = lastName;
	}
public String getFirstName() {
		return firstName;
	}
public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
public String getMiddleName() {
		return middleName;
	}
public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
public Gender getGender() {
		return gender;
	}
public void setGender(Gender gender) {
		this.gender = gender;
	}
public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
public Date getMarriageDate() {
		return marriageDate;
	}
public void setMarriageDate(Date marriageDate) {
		this.marriageDate = marriageDate;
	}
public State getState() {
		return state;
	}
public void setState(State state) {
		this.state = state;
	}
public Religion getReligion() {
		return religion;
	}
public void setReligion(Religion religion) {
		this.religion = religion;
	}
public Country getNationality() {
		return nationality;
	}
public void setNationality(Country nationality) {
		this.nationality = nationality;
	}
}