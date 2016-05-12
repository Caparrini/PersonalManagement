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

	public CoreModel(){
		users = new DefaultListModel<User>();
		facultys = new DefaultListModel<Faculty>();
		departments = new DefaultListModel<Department>();
	}

	public DefaultListModel<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> usersIn) {
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
		Iterator<Faculty> it = facIn.iterator();
		while(it.hasNext()){
			facultys.addElement(it.next());
		}
	}

	public void setDepartments(List<Department> depIn) {
		Iterator<Department> it = depIn.iterator();
		while(it.hasNext()){
			departments.addElement(it.next());
		}
	}
	

}
