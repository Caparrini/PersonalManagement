package model;

import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import model.users.User;

public class CoreModel {
	private User userSession;
	private DefaultListModel<User> users;
	private DefaultListModel<Faculty> facultys;
	private DefaultListModel<Department> departments;
	private static CoreModel cm;
	
	public static CoreModel getCoreModel(){
		if(cm==null){
			cm = new CoreModel();
		}
		return cm;
	}

	private CoreModel(){
		users = new DefaultListModel<User>();
		facultys = new DefaultListModel<Faculty>();
		departments = new DefaultListModel<Department>();
	}

	public DefaultListModel<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> usersIn) {
		users = new DefaultListModel<User>();
		Iterator<User> it = usersIn.iterator();
		while(it.hasNext()){
			users.addElement(it.next());
		}
	}

	public void setUserSession(User newSession){
		this.userSession = newSession;
	}

	public boolean valDNI(String text) {
		return User.validateDNI(text);
	}

	public String getSessionName() {
		return userSession.getName();
	}

	public String getSessionPrename() {
		return userSession.getPrename();
	}

	public boolean getSessionIsAdmin() {
		return userSession.getIsAdmin();
	}

	public ListModel<Faculty> getFacultys() {
		return facultys;
	}

	public ListModel<Department> getDepartments() {
		return departments;
	}

	public void setFacultys(List<Faculty> facIn) {
		facultys = new DefaultListModel<Faculty>();
		Iterator<Faculty> it = facIn.iterator();
		while(it.hasNext()){
			facultys.addElement(it.next());
		}
	}

	public void setDepartments(List<Department> depIn) {
		departments = new DefaultListModel<Department>();
		Iterator<Department> it = depIn.iterator();
		while(it.hasNext()){
			departments.addElement(it.next());
		}
	}

	public Faculty getFacultyAt(int index) {
		return facultys.getElementAt(index);
	}

	public void removeFacultyAt(int index) {
		facultys.remove(index);
	}

	public void removeDepartment(int dindex) {
		departments.remove(dindex);
	}

	public void removeFacultyDepartment(int index, int dindex) {
		Faculty a = facultys.getElementAt(index);
		a.removeDepartment(dindex);
		facultys.setElementAt(a, index);
	}

	public void addFacultyDepartment(int index, Department aux) {
		Faculty a = facultys.getElementAt(index);
		a.addDepartment(aux);
		facultys.setElementAt(a, index);
	}

	public void removeAllDepartments() {
		departments = new DefaultListModel<Department>();
	}

	public void addFaculty(Faculty aux) {
		facultys.addElement(aux);
	}


}
