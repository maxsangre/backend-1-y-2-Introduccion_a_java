/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Sangre
 */
public class DaoProducto extends DAO {
    public void mostrarProductos() throws Exception {
        try {
            String max1 = "SELECT * FROM producto";
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(max1);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
        } catch (Exception max2) {
            System.out.println("Error MARICA");
            throw max2;
        }
    }

    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public void mostrarNompre() throws Exception {
        try {
            String max1 = "SELECT * FROM producto";
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(max1);
            while (resultado.next()) {
                System.out.println(
                        resultado.getInt("codigo") +
                                "     " + resultado.getString("nombre") +
                                "     " + resultado.getDouble("precio"));
            }
        } catch (Exception max2) {
                        System.out.println("Error MARICA");
            throw max2;
        }
    }

    //Listar aquellos productos que su precio esté entre 120 y 202.
    public void mostrarEntre(int max1, int max2) throws Exception {
        try {
            String max3 = "SELECT * FROM producto WHERE precio BETWEEN " + max1 + " AND " + max2;
            ;
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(max3);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (Exception max4) {
                        System.out.println("Error MARICA");
            throw max4;
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto.
    public void listarPortatiles() throws Exception {
        try {
            String max1 = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(max1);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (Exception max2) {
                        System.out.println("Error MARICA");
            throw max2;
        }
    }

    //e) Listar el nombre y el precio del producto más barato.
    public void listarProductoMasBarato() throws Exception {
        try {
            String max1 = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(max1);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") +
                        "     " + resultado.getDouble("precio"));
            }
        } catch (Exception max2) {
            throw max2;
        }
    }

    //f) Ingresar un producto a la base de datos.
    public void ingresarProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String max1 = "INSERT INTO producto (nombre, precio, codigo_Fabricante) VALUES ('" + nombre + "', " + precio + ", " + codigoFabricante + ")";
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            insertarModificarEliminar(max1);
            System.out.println("Producto ingresado Gato");
        } catch (Exception max2) {
                        System.out.println("Error MARICA");
            throw max2;
        }
    }

    //h) Editar un producto con datos a elección.
    public void modificarProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String max1 = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_Fabricante = " + codigoFabricante + " WHERE codigo = " + codigo;
            conectarBaseDeDatos();
            sentencia = conection.createStatement();
            insertarModificarEliminar(max1);
            System.out.println("Producto modificado Gay");
        } catch (Exception max2) {
                        System.out.println("Error MARICA");
            throw max2;
        }
    }
}