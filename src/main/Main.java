package main;

import javax.swing.SwingUtilities;

import model.CoreModel;
import view.LoginView;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import controller.MainController;
import dba.DBFacade;

public class Main {
	public static void main(String[] args){
		//Database stuff
        DatabaseProperties props = new DatabaseProperties();
        ComboPooledDataSource cpds = new ComboPooledDataSource();

        cpds.setJdbcUrl(props.getUrl());
        cpds.setUser(props.getUser());
        cpds.setPassword(props.getPass());

        cpds.setAcquireRetryAttempts(1);
        cpds.setAcquireRetryDelay(1);
        cpds.setBreakAfterAcquireFailure(true);
		//TESTING MAIN

        CoreModel model = new CoreModel();
        DBFacade facade = new DBFacade(cpds);
        MainController controlador = new MainController(model,facade);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LoginView(controlador).setVisible(true);;

			}
		});

		//cpds.close();

	}

}
