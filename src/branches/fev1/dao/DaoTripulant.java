/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev1.dao;

import branches.fev1.files.Tripulant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Santos
 */
public class DaoTripulant {

      /*
      * PROPIEDADES Y MÉTODOS SINGLETON
      */
      private Connection con = null;

      private static DaoTripulant instance = null;

      private DaoTripulant() throws SQLException {
            con = Singleton.getConnection();
      }

      public static DaoTripulant getInstance() throws SQLException {
            if (instance == null) {
                  instance = new DaoTripulant();
            }

            return instance;
      }

      /*
	 * MÉTODOS PROPIOS DE LA CLASE DAO
       */
      public void insert(Tripulant e) throws SQLException {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO tripulante (id_tripulante,nombre,cargo,sexo,experiencia,origen,raza,edad,foto,id_nave) VALUES (?,?,?,?,?,?,?,?,?,?);");
            ps.setInt(1, e.getId_tripulant());
            ps.setString(2, e.getName());
            ps.setString(3, e.getPosition());
            ps.setString(4, e.getGender());
            ps.setInt(5, e.getExperience());
            ps.setString(6, e.getOrigin());
            ps.setString(7, e.getRace());
            ps.setInt(8, e.getAge());
            ps.setString(9, e.getImage());
            ps.setInt(10, e.getId_ship());

            ps.executeUpdate();
            ps.close();

      }

      public ArrayList<Tripulant> findAll() throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM tripulante");
            ResultSet rs = ps.executeQuery();

            ArrayList<Tripulant> result = null;

            while (rs.next()) {
                  if (result == null) {
                        result = new ArrayList<>();
                  }

                  result.add(new Tripulant(rs.getInt("id_tripulante"), rs.getString("nombre"), rs.getString("cargo"), rs.getString("sexo"), rs.getInt("experiencia"), rs.getString("origen"), rs.getString("raza"), rs.getInt("edad"), rs.getString("foto"), rs.getInt("id_nave")));
            }

            rs.close();
            ps.close();

            return result;
      }

      public Tripulant findByPk(int id) throws SQLException {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM tripulante WHERE id_tripulante = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Tripulant result = null;

            if (rs.next()) {

                  result = new Tripulant(rs.getInt("id_tripulante"), rs.getString("nombre"), rs.getString("cargo"), rs.getString("sexo"), rs.getInt("experiencia"), rs.getString("origen"), rs.getString("raza"), rs.getInt("edad"), rs.getString("foto"), rs.getInt("id_nave"));

            }

            rs.close();
            ps.close();

            return result;

      }

      public void delete(Tripulant e) throws SQLException {
            delete(e.getId_tripulant());
      }

      public void delete(int id) throws SQLException {

            if (id <= 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("DELETE FROM tripulante WHERE id_tripulante = ?");
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
      }

      public void update(Tripulant e) throws SQLException {

            if (e.getId_tripulant()== 0) {
                  return;
            }

            PreparedStatement ps = con.prepareStatement("UPDATE tripulante SET id_tripulante=?,nombre=?,cargo=?,sexo=?,experiencia=?,origen=?,raza=?,edad=?,foto=?,id_nave=?");

            ps.setInt(1, e.getId_tripulant());
            ps.setString(2, e.getName());
            ps.setString(3, e.getPosition());
            ps.setString(4, e.getGender());
            ps.setInt(5, e.getExperience());
            ps.setString(6, e.getOrigin());
            ps.setString(7, e.getRace());
            ps.setInt(8, e.getAge());
            ps.setString(9, e.getImage());
            ps.setInt(10, e.getId_ship());

            ps.executeUpdate();

            ps.close();

      }
}
