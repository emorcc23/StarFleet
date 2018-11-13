/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.dao;

import branches.fev2.files.Logbook;
import branches.fev2.files.Ship;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Santos
 */
public class DaoLogbook {

      /*
	 * PROPIEDADES Y MÉTODOS SINGLETON
       */
      private Connection con = null;

      private static DaoLogbook instance = null;

      private DaoLogbook() throws SQLException {
            con = Singleton.getConnection();
      }

      public static DaoLogbook getInstance() throws SQLException {
            if (instance == null) {
                  instance = new DaoLogbook();
            }

            return instance;
      }

      /*
	 * MÉTODOS PROPIOS DE LA CLASE DAO
       */
      public void insert(Logbook e) throws SQLException {
            PreparedStatement ps = con.prepareStatement("INSERT INTO logbook (id_ship,datee,description,audio) VALUES (?,?,?,?)");

            ps.setInt(1, e.getId_ship());
            ps.setString(2, e.getDate());
            ps.setString(3, e.getDescription());
            ps.setString(4, e.getAudio());

            ps.executeUpdate();
            ps.close();
      }

      public ArrayList<Logbook> findAll() throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM logbook");
            ResultSet rs = ps.executeQuery();

            ArrayList<Logbook> result = null;

            while (rs.next()) {
                  if (result == null) {
                        result = new ArrayList<>();
                  }
                  result.add(new Logbook(rs.getInt("id_logbook"), rs.getInt("id_ship"), rs.getString("datee"), rs.getString("description"), rs.getString("audio")));
            }

            rs.close();
            ps.close();

            return result;
      }

      public Logbook findByPk(int id) throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM logbook WHERE id_logbook = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Logbook result = null;

            if (rs.next()) {
                  result = new Logbook(rs.getInt("id_logbook"), rs.getInt("id_ship"), rs.getString("datee"), rs.getString("description"), rs.getString("audio"));
            }

            rs.close();
            ps.close();

            return result;

      }

      public void delete(Logbook e) throws SQLException {
            delete(e.getId_logbook());
      }

      public void delete(int id) throws SQLException {

            if (id <= 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("DELETE FROM logbook WHERE id_logbook = ?");
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
      }

      public void update(Logbook e) throws SQLException {

            if (e.getId_logbook() == 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("UPDATE logbook SET id_logbook=?,id_ship=?,datee=?,description=?,audio=?");

            ps.setInt(1, e.getId_logbook());
            ps.setInt(2, e.getId_ship());
            ps.setString(3, e.getDate());
            ps.setString(4, e.getDescription());
            ps.setString(5, e.getAudio());
            ps.executeUpdate();

            ps.close();

      }

      public int extractLastId() throws SQLException {
            int lastId = 0;

            PreparedStatement ps = con.prepareStatement("SELECT id_logbook  FROM logbook order by id_logbook desc limit 1;");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                  lastId = rs.getInt("id_logbook") + 1;
            }

            return lastId;
      }
      
      public ArrayList<Ship> extractIdShip() throws SQLException {
            PreparedStatement ps = con.prepareStatement("SELECT id_ship FROM ship");
            ResultSet rs = ps.executeQuery();
            ArrayList<Ship> result = null;
            while (rs.next()) {
                  if (result == null) {
                        result = new ArrayList<>();
                  }
                  result.add(new Ship(rs.getInt("id_ship")));
            }
            rs.close();
            ps.close();
            return result;
      }
}
