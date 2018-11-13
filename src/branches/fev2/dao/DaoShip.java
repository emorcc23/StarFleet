/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.dao;

import branches.fev2.files.Ship;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Álvaro Santos
 */
public class DaoShip {

      /*
      PROPIEDADES Y MÉTODOS SINGLETON
       */
      private Connection con = null;
      private static DaoShip instance = null;

      private DaoShip() throws SQLException {
            con = Singleton.getConnection();
      }

      public static DaoShip getInstance() throws SQLException {
            if (instance == null) {
                  instance = new DaoShip();
            }
            return instance;
      }

      /*
      * MÉTODOS PROPIOS DE LA CLASE DAO
       */
      public void insert(Ship e) throws SQLException {

            PreparedStatement ps = con.prepareStatement("INSERT INTO ship (captain,alias,licenceplate,kind,image) VALUES (?,?,?,?,?)");

            ps.setString(1, e.getCaptain());
            ps.setString(2, e.getAlias());
            ps.setString(3, e.getLicenceplate());
            ps.setString(4, e.getKind());
            ps.setString(5, e.getImage());

            ps.executeUpdate();
            ps.close();

      }

      public ArrayList<Ship> findAll() throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM ship");
            ResultSet rs = ps.executeQuery();

            ArrayList<Ship> result = null;

            while (rs.next()) {
                  if (result == null) {
                        result = new ArrayList<>();
                  }
                  result.add(new Ship(rs.getInt("id_ship"), rs.getString("captain"), rs.getString("alias"), rs.getString("licenceplate"), rs.getString("kind"), rs.getString("image")));
            }

            rs.close();
            ps.close();

            return result;
      }

      public Ship findByPk(int id) throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM ship WHERE id_ship = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Ship result = null;

            if (rs.next()) {
                  result = new Ship(rs.getInt("id_ship"), rs.getString("captain"), rs.getString("alias"), rs.getString("licenceplate"), rs.getString("kind"), rs.getString("image"));
            }

            rs.close();
            ps.close();
            return result;
      }

      public void delete(Ship e) throws SQLException {
            delete(e.getId_ship());
      }

      public void delete(int id) throws SQLException {

            if (id <= 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("DELETE FROM ship WHERE id_ship = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
      }

      public void update(Ship e) throws SQLException {

            if (e.getId_ship() == 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("UPDATE ship SET id_ship=?,captain=?,alias=?,licenceplate=?,kind=?,image=?");
            ps.setInt(1, e.getId_ship());
            ps.setString(2, e.getCaptain());
            ps.setString(3, e.getAlias());
            ps.setString(4, e.getLicenceplate());
            ps.setString(5, e.getKind());
            ps.setString(6, e.getImage());
            ps.executeUpdate();
            ps.close();
      }

      public int extractLastId() throws SQLException {
            int lastId = 0;

            PreparedStatement ps = con.prepareStatement("SELECT id_ship  FROM ship order by id_ship desc limit 1;");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                  lastId = rs.getInt("id_ship") + 1;
            }

            return lastId;
      }

//      public ArrayList<Ship> findAll() throws SQLException {
//
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM nave");
//            ResultSet rs = ps.executeQuery();
//
//            ArrayList<Ship> result = null;
//
//            while (rs.next()) {
//                  if (result == null) {
//                        result = new ArrayList<>();
//                  }
//                  result.add(new Ship(rs.getInt("id_nave"), rs.getString("capitan"), rs.getString("nombre"), rs.getString("matricula"), rs.getString("tipo"), rs.getString("foto")));
//            }
//
//            rs.close();
//            ps.close();
//
//            return result;
//      }
      public void fillList(JTable table) throws SQLException {

      }
//            try {
// //Para establecer el modelo al JTable
// DefaultTableModel modelo = new DefaultTableModel();
//            this.jtQuery.setModel(modelo);
//            //Para conectarnos a nuestra base de datos
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdproductos", "usuario", "clave");
//            //Para ejecutar la consulta
//            Statement s = conexion.createStatement();
//            //Ejecutamos la consulta que escribimos en la caja de texto
//            //y los datos lo almacenamos en un ResultSet
//            ResultSet rs = s.executeQuery(txtQuery.getText());
//            //Obteniendo la informacion de las columnas que estan siendo consultadas
//            ResultSetMetaData rsMd = rs.getMetaData();
//            //La cantidad de columnas que tiene la consulta
//            int cantidadColumnas = rsMd.getColumnCount();
//            //Establecer como cabezeras el nombre de las colimnas
//            for (int i = 1; i <= cantidadColumnas; i++) {
//                  modelo.addColumn(rsMd.getColumnLabel(i));
//            }
//            //Creando las filas para el JTable
//            while (rs.next()) {
//                  Object[] fila = new Object[cantidadColumnas];
//                  for (int i = 0; i < cantidadColumnas; i++) {
//                        fila[i] = rs.getObject(i + 1);
//                  }
//                  modelo.addRow(fila);
//            }
//            rs.close();
//            conexion.close();
//      }
//      catch (Exception ex
//
//      
//            ) {
// ex.printStackTrace();
//      }

}
