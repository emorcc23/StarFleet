/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev1.dao;

import branches.fev1.files.Mission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Santos
 */
public class DaoMission {

      /*
	 * PROPIEDADES Y MÉTODOS SINGLETON
       */
      private Connection con = null;

      private static DaoMission instance = null;

      private DaoMission() throws SQLException {
            con = Singleton.getConnection();
      }

      public static DaoMission getInstance() throws SQLException {
            if (instance == null) {
                  instance = new DaoMission();
            }

            return instance;
      }

      /*
	 * MÉTODOS PROPIOS DE LA CLASE DAO
       */
      public void insert(Mission e) throws SQLException {
            PreparedStatement ps = con.prepareStatement("INSERT INTO mision (id_mision,nombre,id_nave,descripcion) VALUES (?,?,?,?)");

            ps.setInt(1, e.getId_mission());
            ps.setString(2, e.getName());
            ps.setInt(3, e.getId_ship());
            ps.setString(4, e.getDescription());

            ps.executeUpdate();
            ps.close();
      }

      public ArrayList<Mission> findAll() throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM mision");
            ResultSet rs = ps.executeQuery();

            ArrayList<Mission> result = null;

            while (rs.next()) {
                  if (result == null) {
                        result = new ArrayList<>();
                  }
                  result.add(new Mission(rs.getInt("id_mision"), rs.getString("nombre"), rs.getInt("id_nave"), rs.getString("descripcion")));
            }

            rs.close();
            ps.close();

            return result;
      }

      public Mission findByPk(int id) throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM mision WHERE id_mision = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Mission result = null;

            if (rs.next()) {
                  result = new Mission(rs.getInt("id_mision"), rs.getString("nombre"), rs.getInt("id_nave"), rs.getString("descripcion"));
            }

            rs.close();
            ps.close();

            return result;

      }

      public void delete(Mission e) throws SQLException {
            delete(e.getId_mission());
      }

      public void delete(int id) throws SQLException {

            if (id <= 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("DELETE FROM mision WHERE id_mision = ?");
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
      }

      public void update(Mission e) throws SQLException {

            if (e.getId_mission()== 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("UPDATE mision SET id_mision=?,nombre=?,id_nave=?,descripcion=?");

            ps.setInt(1, e.getId_mission());
            ps.setString(2, e.getName());
            ps.setInt(3, e.getId_ship());
            ps.setString(4, e.getDescription());

            ps.executeUpdate();

            ps.close();

      }
}
