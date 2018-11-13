/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.files;

import branches.fev2.dao.DaoTripulant;
import branches.fev2.dao.Singleton;
import java.sql.SQLException;

/**
 *
 * @author Álvaro Santos
 */
public class Tripulant {

      private static Tripulant instance = null;

      public static Tripulant getInstance() throws SQLException {
            if (instance == null) {
                  instance = new Tripulant();
            }

            return instance;
      }

      private int id_tripulant;
      private String alias;
      private String position;
      private String gender;
      private int experience;
      private String origin;
      private String race;
      private int age;
      private String image;
      private int id_ship;
      
      public Tripulant() {}

      public Tripulant(int id_tripulant, String name, String position, String gender, int experience, String origin, String race, int age, String image, int id_ship) {
            this.id_tripulant = id_tripulant;
            this.alias = name;
            this.position = position;
            this.gender = gender;
            this.experience = experience;
            this.origin = origin;
            this.race = race;
            this.age = age;
            this.image = image;
            this.id_ship = id_ship;
      }

      public Tripulant(String name, String position, String gender, int experience, String origin, String race, int age, String image, int id_ship) {
            this.alias = name;
            this.position = position;
            this.gender = gender;
            this.experience = experience;
            this.origin = origin;
            this.race = race;
            this.age = age;
            this.image = image;
            this.id_ship = id_ship;
      }

      public int getId_tripulant() {
            return id_tripulant;
      }

      public void setId_tripulant(int id_tripulant) {
            this.id_tripulant = id_tripulant;
      }

      public String getAlias() {
            return alias;
      }

      public void setAlias(String alias) {
            this.alias = alias;
      }

      public String getPosition() {
            return position;
      }

      public void setPosition(String position) {
            this.position = position;
      }

      public String getGender() {
            return gender;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      public int getExperience() {
            return experience;
      }

      public void setExperience(int experience) {
            this.experience = experience;
      }

      public String getOrigin() {
            return origin;
      }

      public void setOrigin(String origin) {
            this.origin = origin;
      }

      public String getRace() {
            return race;
      }

      public void setRace(String race) {
            this.race = race;
      }

      public int getAge() {
            return age;
      }

      public void setAge(int age) {
            this.age = age;
      }

      public String getImage() {
            return image;
      }

      public void setImage(String image) {
            this.image = image;
      }

      public int getId_ship() {
            return id_ship;
      }

      public void setId_ship(int id_ship) {
            this.id_ship = id_ship;
      }
      
      public void insert() throws SQLException {
            DaoTripulant.getInstance().insert(this);
      }

}
