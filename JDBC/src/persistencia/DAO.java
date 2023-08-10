/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Sangre
 */
public abstract class DAO {
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE = "tienda";
    protected Connection conection = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    protected void conectarBaseDeDatos() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE +
                    "?useSSL=false&timeZone=America/Mexico_City";
            conection = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (SQLException max) {
            throw max;
        }
    }
    protected void desconectarBaseDeDatos() throws Exception {
        try {
            if (conection != null) {
                conection.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (resultado != null) {
                resultado.close();
            }
        } catch (Exception max) {
            throw max;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException max) {
            throw max;
        } finally {
            desconectarBaseDeDatos();
        }
    }

    protected void consultarBaseDeDatos(String sql) throws Exception {
        try {
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception max) {
            throw max;
        }
    }
}