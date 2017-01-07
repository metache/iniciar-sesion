/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilerias;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ruben D
 */
public class ClassConex {

    public String driver;
    public String direccionBD;
    public String usuario;
    public String contrasena;
    public Connection conexion;

    public ClassConex() {
        this.driver = "com.mysql.jdbc.Driver";
        this.direccionBD = "jdbc:mysql://sandbox2.ufps.edu.co/ufps_22";
        this.usuario = "ufps_22";
        this.contrasena = "ufps_hj";

        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(direccionBD, usuario, contrasena);
        } catch (Exception e) {
        }
    }

    public Connection obtenerConexion() {
        return conexion;
    }
    
    public Connection cerrarConexion(){
        conexion=null;
        return conexion;
    }

}
