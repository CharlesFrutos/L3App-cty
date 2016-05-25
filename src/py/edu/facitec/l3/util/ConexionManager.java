package py.edu.facitec.l3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionManager {
	
	private static Connection conexion;
	private static Statement stm;
	
	
	//Constantes
	private static final String URL ="jdbc:postgresql://localhost:5432/db_trabajo_practico";
	private static final String USERS="postgres";
	private static final String PASSWORD="12345";
	
	public static Connection abrirConexion(){
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("se ha conectado al driver");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Error al conectar con el driver");
			e.printStackTrace();
		}
		
		try {
			conexion = DriverManager.getConnection(USERS, PASSWORD, URL);
			stm=conexion.createStatement();
			System.out.println("se ha conectado a la base de datos");
			
		} catch (SQLException e) {
			System.out.println("Error al conectar con la base de datos");
			e.printStackTrace();
			
		}
		
		return conexion;
		
	}
	
	public static void cerrarConexion(){
		if (conexion !=null);
			try {
				stm.close();
				conexion.close();
			} catch (Exception e) {
				e.printStackTrace();
			
		}
		
		
	}

}
