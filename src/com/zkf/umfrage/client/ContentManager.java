package com.zkf.umfrage.client;

import com.google.gwt.user.client.ui.RootPanel;
import com.zkf.umfrage.client.ui.login.login;

public class ContentManager {
	
	private ZukunftErfinden zf;
	private login login;
	
	
	public ContentManager(ZukunftErfinden zukunftErfinden){
		
		// Binding 
		zf = zukunftErfinden;
		login = new login();
		RootPanel.get("bodyScreen").add(login);
		// creating zur�ck button irgendwann
		
		//Database stuf, l�uft noch automatisch

		
		
		
	}

}
