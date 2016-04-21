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
	protected String password;
	/**
	 * 
	 */
	protected String mail;
	/**
	 * 
	 */
	protected String name;
	/**
	 * 
	 */
	private String prename;
	/**
	 * 
	 */
	private Boolean down;
	/**
	 * 
	 */
	private Boolean holidays;
	/**
	 * 
	 */
	private Date birthDate;
	/**
	 * 
	 */
	private Date creatDate;
	/**
	 * 
	 */
	private Boolean isAdmin;
	
	public User(String dNI, String password, String mail, String name,
			String prename, Boolean down, Boolean holidays, Date birthDate,
			Date creatDate, Boolean isAdmin) {
		super();
		DNI = dNI;
		this.password = password;
		this.mail = mail;
		this.name = name;
		this.prename = prename;
		this.down = down;
		this.holidays = holidays;
		this.birthDate = birthDate;
		this.creatDate = creatDate;
		this.isAdmin = isAdmin;
	}
	
	/**
	 * Getter of DNI
	 */
	public String getDNI(){
		return DNI;
	}
	/**
	 * Setter of DNI
	 */
	public void setDNI(String DNI){
		this.DNI = DNI;
	}
	/**
	 * Getter of Password
	 */
	public String getPassword(){
		return password;
	}
	/**
	 * Setter of Password
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * Getter of Mail
	 */
	public String getMail(){
		return mail;
	}
	/**
	 * Setter of Mail
	 */
	public void setMail(String mail){
		this.mail = mail;
	}
	/**
	 * Getter of Name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Setter of Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter of Prename
	 */
	public String getPrename(){
		return prename;
	}
	/**
	 * Setter of Prename
	 */
	public void setPrename(String prename){
		this.prename = prename;
	}
	/**
	 * Getter of Down
	 */
	public Boolean getDown(){
		return down;
	}
	/**
	 * Setter of Down
	 */
	public void setDown(Boolean down){
		this.down = down;
	}
	/**
	 * Getter of Holidays
	 */
	public Boolean getHolidays(){
		return holidays;
	}
	/**
	 * Setter of Holidays
	 */
	public void setHolidays(Boolean holidays){
		this.holidays = holidays;
	}
	/**
	 * Getter of BirthDate
	 */
	public Date getBirthDate(){
		return birthDate;
	}
	/**
	 * Setter of BirthDate
	 */
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	/**
	 * Getter of CreatDate
	 */
	public Date getCreatDate(){
		return creatDate;
	}
	/**
	 * Setter of CreatDate
	 */
	public void setCreatDate(Date creatDate){
		this.creatDate = creatDate;
	}
	/**
	 * Getter of IsAdmin
	 */
	public Boolean getIsAdmin(){
		return isAdmin;
	}
	/**
	 * Setter of IsAdmin
	 */
	public void setIsAdmin(Boolean isAdmin){
		this.isAdmin = isAdmin;
	} 

}