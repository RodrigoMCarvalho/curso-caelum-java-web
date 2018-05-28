package br.com.caelum;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
	 try {
		 Class.forName("com.mysql.jdbc.Driver"); 
         return DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/db_agenda", "root", "");
     } catch (Exception e) {
         throw new RuntimeException(e);
     }
	 
//	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("agendaPU");
//
//	public EntityManager getConnection() {
//		return factory.createEntityManager();
//
//	}
}
}
