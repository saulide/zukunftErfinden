package com.zkf.umfrage.client;


import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ZukunftErfinden implements EntryPoint {

	ContentManager cm;
	@Override
	public void onModuleLoad() {
		
		cm = new ContentManager(this);
	
	}
}
	

