/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.files;

import branches.fev2.dao.DaoShip;
import branches.fev2.dao.Singleton;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Álvaro Santos
 */
public class Ship {

      private static Ship instance = null;

      public static Ship getInstance() throws SQLException {
            if (instance == null) {
                  instance = new Ship();
            }
            return instance;
      }

      private int id_ship;
      private String captain;
      private String alias;
      private String licenceplate;
      private String kind;
      private String image;
      
      public Ship() {}

      public Ship(int id_ship, String captain, String name, String register, String type, String image) {
            this.id_ship = id_ship;
            this.captain = captain;
            this.alias = name;
            this.licenceplate = register;
            this.kind = type;
            this.image = image;
      }

      public Ship(String captain, String name, String register, String type, String image) {
            this.captain = captain;
            this.alias = name;
            this.licenceplate = register;
            this.kind = type;
            this.image = image;
      }

      public Ship(int id_ship) {
            this.id_ship = id_ship;
      }

      public int getId_ship() {
            return id_ship;
      }

      public void setId_ship(int id_ship) {
            this.id_ship = id_ship;
      }

      public String getCaptain() {
            return captain;
      }

      public void setCaptain(String captain) {
            this.captain = captain;
      }

      public String getAlias() {
            return alias;
      }

      public void setAlias(String alias) {
            this.alias = alias;
      }

      public String getLicenceplate() {
            return licenceplate;
      }

      public void setLicenceplate(String licenceplate) {
            this.licenceplate = licenceplate;
      }

      public String getKind() {
            return kind;
      }

      public void setKind(String kind) {
            this.kind = kind;
      }

      public String getImage() {
            return image;
      }

      public void setImage(String image) {
            this.image = image;
      }

      public void insert() throws SQLException {
            DaoShip.getInstance().insert(this);
      }

      public ArrayList<Ship> findAll() throws SQLException {
            ArrayList<Ship> result = DaoShip.getInstance().findAll();
            return result;
      }

      public void delete() throws SQLException {
            DaoShip.getInstance().delete(this);
      }

      public void update() throws SQLException {
            DaoShip.getInstance().update(this);
      }

      public int extractLastId() throws SQLException {
            int lastId = DaoShip.getInstance().extractLastId();
            return lastId;
      }

}
