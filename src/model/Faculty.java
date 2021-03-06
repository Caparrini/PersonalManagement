package model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

	private String name;
	private List<Department> departments;
	private String address;

	public Faculty(){
		departments = new ArrayList<Department>();
	}
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
	@Override
	public String toString() {
		return "Facultad de " + name;
	}
	public void addDepartment(Department opt) {
        departments.add(opt);
	}
	public void removeDepartment(int index) {
        departments.remove(index);
	}

}