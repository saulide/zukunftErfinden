package com.zkf.umfrage.client.db;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DataBaseConn implements IsSerializable{
	
	private String userName;
	private String rang;
	
	public DataBaseConn()
	{
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}
	
}
