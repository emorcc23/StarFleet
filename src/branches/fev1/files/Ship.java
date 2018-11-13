/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev1.files;

/**
 *
 * @author Álvaro Santos
 */
public class Ship {

      private int id_ship;
      private String captain;
      private String name;
      private String register;
      private String type;
      private String image;

      public Ship(int id_ship, String captain, String name, String register, String type, String image) {
            this.id_ship = id_ship;
            this.captain = captain;
            this.name = name;
            this.register = register;
            this.type = type;
            this.image = image;
      }

      public Ship(String captain, String name, String register, String type, String image) {
            this.captain = captain;
            this.name = name;
            this.register = register;
            this.type = type;
            this.image = image;
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

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getRegister() {
            return register;
      }

      public void setRegister(String register) {
            this.register = register;
      }

      public String getType() {
            return type;
      }

      public void setType(String type) {
            this.type = type;
      }

      public String getImage() {
            return image;
      }

      public void setImage(String image) {
            this.image = image;
      }
}
