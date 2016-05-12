package model;

public class Department{

	/**
	 * 
	 */
	private Faculty faculty;

	private String nameDepartment;

	private int idDepartment;

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	/**
	 * Getter of faculty
	 */
	public Faculty getFaculty(){
		return faculty;
	}

	/**
	 * Setter of faculty
	 */
	public void setFaculty(Faculty faculty){
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Department [faculty=" + faculty + ", nameDepartment="
				+ nameDepartment + ", idDepartment=" + idDepartment + "]";
	}

}
