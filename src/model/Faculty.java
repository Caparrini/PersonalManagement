package model;

import java.util.List;

public class Faculty {

	/**
	 *
	 */
	private String name;
	/**
	 * 
	 */
	private String adress;
	/**
	 * 
	 */
	private List<Department> departments;
	/**
	 * 
	 */
	private String address;
	/**
	 * Getter of name
	 */
	public String getName(){
		return name;
	}
	/**
	 * Setter of name
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * Getter of adress
	 */
	public String getAdress(){
		return adress;
	}
	/**
	 * Setter of adress
	 */
	public void setAdress(String adress){
		this.adress = adress;
	}
	/**
	 * Getter of departments
	 */
	public List<Department> getDepartments(){
		return departments;
	}
	/**
	 * Setter of departments
	 */
	public void setDepartments(List<Department> departments){
		this.departments = departments;
	}
	/**
	 * Getter of address
	 */
	public String getAddress(){
		return address;
	}
	/**
	 * Setter of address
	 */
	public void setAddress(String address){
		this.address = address;
	}

}