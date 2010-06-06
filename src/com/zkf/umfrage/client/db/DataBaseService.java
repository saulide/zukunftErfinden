package com.zkf.umfrage.client.db;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface DataBaseService extends RemoteService {
	public static final String SERVICE_URI = "DataBaseService";

	public static class Util {

		public static DataBaseServiceAsync getInstance() {

			DataBaseServiceAsync instance = (DataBaseServiceAsync) GWT
					.create(DataBaseService.class);
			ServiceDefTarget target = (ServiceDefTarget) instance;
			target.setServiceEntryPoint(GWT.getModuleBaseURL() + SERVICE_URI);
			return instance;
		}
	
	}
	
	public String querryProfileDatabase();

}
