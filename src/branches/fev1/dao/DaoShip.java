/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev1.dao;

import branches.fev1.files.Ship;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
      MÉTODOS PROPIOS DE LA CLASE DAO
       */
      public void insert(Ship e) throws SQLException {

            PreparedStatement ps = con.prepareStatement("INSERT INTO nave (id_nave,capitan,nombre,matricula,tipo,foto) VALUES (?,?,?,?,?,?)");

            ps.setInt(1, e.getId_ship());
            ps.setString(2, e.getCaptain());
            ps.setString(3, e.getName());
            ps.setString(4, e.getRegister());
            ps.setString(5, e.getType());
            ps.setString(6, e.getImage());

            ps.executeUpdate();
            ps.close();

      }

      public ArrayList<Ship> findAll() throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM nave");
            ResultSet rs = ps.executeQuery();

            ArrayList<Ship> result = null;

            while (rs.next()) {
                  if (result == null) {
                        result = new ArrayList<>();
                  }
                  result.add(new Ship(rs.getInt("id_nave"), rs.getString("capitan"), rs.getString("nombre"), rs.getString("matricula"), rs.getString("tipo"), rs.getString("foto")));
            }

            rs.close();
            ps.close();

            return result;
      }

      public Ship findByPk(int id) throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM nave WHERE id_nave = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Ship result = null;

            if (rs.next()) {
                  result = new Ship(rs.getInt("id_nave"), rs.getString("capitan"), rs.getString("nombre"), rs.getString("matricula"), rs.getString("tipo"), rs.getString("foto"));
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

            PreparedStatement ps = con.prepareStatement("DELETE FROM nave WHERE id_nave = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
      }

      public void update(Ship e) throws SQLException {

            if (e.getId_ship()== 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("UPDATE nave SET id_nave=?,capitan=?,nombre=?,matricula=?,tipo=?,foto=?");
            ps.setInt(1, e.getId_ship());
            ps.setString(2, e.getCaptain());
            ps.setString(3, e.getName());
            ps.setString(4, e.getRegister());
            ps.setString(5, e.getType());
            ps.setString(6, e.getImage());
            ps.executeUpdate();
            ps.close();
      }

}
