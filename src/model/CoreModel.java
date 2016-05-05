package model;

import model.users.User;

public class CoreModel {
	private User userSession;

	public CoreModel(){

	}

	public void setUserSession(User newSession){
		this.userSession = newSession;
	}

	public boolean valDNI(String text) {
		return User.validateDNI(text);
	}

}
