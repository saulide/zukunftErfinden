package com.zkf.umfrage.client.model;

import com.google.gwt.user.client.rpc.IsSerializable;

public class User implements IsSerializable{
	
	public String loginName;
	public String rang;
	public int benutzerId;
	public String vorname;
	public String nachname;
	
	public User(String test) {
		this.loginName = test;
	}


}
