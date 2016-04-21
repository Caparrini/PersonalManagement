package model.users;

import java.sql.Date;

public class User {

	/**
	 * 
	 */
	protected String DNI;
	/**
	 * 
	 */
	protected String Password;
	/**
	 * 
	 */
	protected String Mail;
	/**
	 * 
	 */
	protected String Name;
	/**
	 * 
	 */
	private String Prename;
	/**
	 * 
	 */
	private Boolean Down;
	/**
	 * 
	 */
	private Boolean Holidays;
	/**
	 * 
	 */
	private Date BirthDate;
	/**
	 * 
	 */
	private Date CreatDate;
	/**
	 * 
	 */
	private Boolean IsAdmin;
	
	public User(String dNI, String password, String mail, String name,
			String prename, Boolean down, Boolean holidays, Date birthDate,
			Date creatDate, Boolean isAdmin) {
		super();
		DNI = dNI;
		Password = password;
		Mail = mail;
		Name = name;
		Prename = prename;
		Down = down;
		Holidays = holidays;
		BirthDate = birthDate;
		CreatDate = creatDate;
		IsAdmin = isAdmin;
	}
	
	/**
	 * Getter of DNI
	 */
	public String getDNI() {
	 	 return DNI; 
	}
	/**
	 * Setter of DNI
	 */
	public void setDNI(String DNI) { 
		 this.DNI = DNI; 
	}
	/**
	 * Getter of Password
	 */
	public String getPassword() {
	 	 return Password; 
	}
	/**
	 * Setter of Password
	 */
	public void setPassword(String Password) { 
		 this.Password = Password; 
	}
	/**
	 * Getter of Mail
	 */
	public String getMail() {
	 	 return Mail; 
	}
	/**
	 * Setter of Mail
	 */
	public void setMail(String Mail) { 
		 this.Mail = Mail; 
	}
	/**
	 * Getter of Name
	 */
	public String getName() {
	 	 return Name; 
	}
	/**
	 * Setter of Name
	 */
	public void setName(String Name) { 
		 this.Name = Name; 
	}
	/**
	 * Getter of Prename
	 */
	public String getPrename() {
	 	 return Prename; 
	}
	/**
	 * Setter of Prename
	 */
	public void setPrename(String Prename) { 
		 this.Prename = Prename; 
	}
	/**
	 * Getter of Down
	 */
	public Boolean getDown() {
	 	 return Down; 
	}
	/**
	 * Setter of Down
	 */
	public void setDown(Boolean Down) { 
		 this.Down = Down; 
	}
	/**
	 * Getter of Holidays
	 */
	public Boolean getHolidays() {
	 	 return Holidays; 
	}
	/**
	 * Setter of Holidays
	 */
	public void setHolidays(Boolean Holidays) { 
		 this.Holidays = Holidays; 
	}
	/**
	 * Getter of BirthDate
	 */
	public Date getBirthDate() {
	 	 return BirthDate; 
	}
	/**
	 * Setter of BirthDate
	 */
	public void setBirthDate(Date BirthDate) { 
		 this.BirthDate = BirthDate; 
	}
	/**
	 * Getter of CreatDate
	 */
	public Date getCreatDate() {
	 	 return CreatDate; 
	}
	/**
	 * Setter of CreatDate
	 */
	public void setCreatDate(Date CreatDate) { 
		 this.CreatDate = CreatDate; 
	}
	/**
	 * Getter of IsAdmin
	 */
	public Boolean getIsAdmin() {
	 	 return IsAdmin; 
	}
	/**
	 * Setter of IsAdmin
	 */
	public void setIsAdmin(Boolean IsAdmin) { 
		 this.IsAdmin = IsAdmin; 
	} 

}