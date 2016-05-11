package model;
import model.users.User;

public class Contract {

	/**
	 * 
	 */
	private User worker;
	/**
	 * 
	 */
	private Department department;
	/**
	 * 
	 */
	private int IdContract;
	/**
	 * 
	 */
	private String convenio;
	/**
	 * 
	 */
	private int duration;
	/**
	 * 
	 */
	private String type;
	/**
	 * 
	 */
	private String jobLevel;
	/**
	 * 
	 */
	private double incomeMoney;
	/**
	 * 
	 */
	private int holidays;
	/**
	 * Getter of worker
	 */
	public User getWorker(){
		return worker;
	}
	/**
	 * Setter of worker
	 */
	public void setWorker(User worker){
		this.worker = worker;
	}
	/**
	 * Getter of department
	 */
	public Department getDepartment(){
		return department;
	}
	/**
	 * Setter of department
	 */
	public void setDepartment(Department department){
		this.department = department;
	}
	/**
	 * Getter of IdContract
	 */
	public int getIdContract(){
		return IdContract;
	}
	/**
	 * Setter of IdContract
	 */
	public void setIdContract(int IdContract){
		this.IdContract = IdContract;
	}
	/**
	 * Getter of convenio
	 */
	public String getConvenio(){
		return convenio;
	}
	/**
	 * Setter of convenio
	 */
	public void setConvenio(String convenio){
		this.convenio = convenio;
	}
	/**
	 * Getter of duration
	 */
	public int getDuration(){
		return duration;
	}
	/**
	 * Setter of duration
	 */
	public void setDuration(int duration){
		this.duration = duration;
	}
	/**
	 * Getter of type
	 */
	public String getType(){
		return type;
	}
	/**
	 * Setter of type
	 */
	public void setType(String type){
		this.type = type;
	}
	/**
	 * Getter of jobLevel
	 */
	public String getJobLevel(){
		return jobLevel;
	}
	/**
	 * Setter of jobLevel
	 */
	public void setJobLevel(String jobLevel){
		this.jobLevel = jobLevel;
	}
	/**
	 * Getter of incomeMoney
	 */
	public double getIncomeMoney(){
		return incomeMoney;
	}
	/**
	 * Setter of incomeMoney
	 */
	public void setIncomeMoney(double incomeMoney){
		this.incomeMoney = incomeMoney;
	}
	/**
	 * Getter of holidays
	 */
	public int getHolidays(){
		return holidays;
	}
	/**
	 * Setter of holidays
	 */
	public void setHolidays(int holidays){
		this.holidays = holidays;
	}

}
