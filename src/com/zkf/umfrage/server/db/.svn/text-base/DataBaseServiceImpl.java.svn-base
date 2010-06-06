package com.zkf.umfrage.server.db;
import java.sql.*;

import com.zkf.umfrage.client.db.DataBaseService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class DataBaseServiceImpl extends RemoteServiceServlet implements DataBaseService {
	
	private static final long serialVersionUID = 1L;

	  Connection conn=null;	
		String SQLQuerry=null;
		PreparedStatement select=null;//select statement
		ResultSet result=null; //recordset
		Statement update=null;
		String url 		= "jdbc:mysql://localhost:3306/";
	    String db 		= "zukunftErfinden";
	    String driver 	= "com.mysql.jdbc.Driver";    				   
	    String user 	= "peter";
	    String password 	= "zukunft";

	    public String connectDatabase() {				  		
			String resultString;
			
			try{			
				
				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection(url+db, user, password);			
				
				resultString="Connected";
			}
			catch(Exception e){
	 			System.err.println("Unable to connect, keine DB Verbindung!");
	 			e.printStackTrace();
	 			//System.exit(1);
	 			resultString="failed";
	 		}		
			return resultString;
		}

			
		public String querryProfileDatabase(){		
			String name = "";
			
			if (connectDatabase().equals("Connected")){
				try {								
					
					select=conn.prepareStatement("SELECT * FROM benutzer");

					result=select.executeQuery();				
					result.next();
					name = result.getString("vorname");
					
													
					select.close();
					conn.close();
									
					
				}catch (SQLException e) {
					e.printStackTrace();								
					
				};
				
				
			}
			
			return name;
			
		}


}
