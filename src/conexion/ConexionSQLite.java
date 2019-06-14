package conexion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionSQLite {

	private static Connection conexion = null;   //este objeto va a ser la instacia única

	//método para obtener la instancia
	public static Connection getConexion() {
		if (conexion == null) {
			//cargamos el fichero de propiedades
			Properties properties = new Properties();
			try {
				properties.load(new FileReader("config.properties"));
				String DRIVER = properties.getProperty("DRIVER");
				String URL    = properties.getProperty("URL");
				conexion = DriverManager.getConnection(DRIVER + URL);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conexion;
	}

	//método para cerrar la conexión
	
	public static void cerrarConexion () {
		if (conexion != null) {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ConexionSQLite conexion1 = new ConexionSQLite();
		ConexionSQLite conexion2 = new ConexionSQLite();
		System.out.println(conexion1.getConexion());
		System.out.println(conexion2.getConexion());
	}







}