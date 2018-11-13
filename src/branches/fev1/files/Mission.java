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
public class Mission {

      private int id_mission;
      private String name;
      private int id_ship;
      private String description;

      public Mission(int id_mission, String name, int id_ship, String description) {
            this.id_mission = id_mission;
            this.name = name;
            this.id_ship = id_ship;
            this.description = description;
      }

      public Mission(String name, int id_ship, String description) {
            this.name = name;
            this.id_ship = id_ship;
            this.description = description;
      }

      public int getId_mission() {
            return id_mission;
      }

      public void setId_mission(int id_mission) {
            this.id_mission = id_mission;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public int getId_ship() {
            return id_ship;
      }

      public void setId_ship(int id_ship) {
            this.id_ship = id_ship;
      }

      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }
}
