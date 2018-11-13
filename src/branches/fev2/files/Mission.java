/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.files;

/**
 *
 * @author Álvaro Santos
 */
public class Mission {
      
      private int id_mission;
      private String alias;
      private int id_ship;
      private String description;
      
      public Mission (int id_mission, String name, int id_ship, String description) {
            this.id_mission = id_mission;
            this.alias = name;
            this.id_ship = id_ship;
            this.description = description;
      }
      
      public Mission (String name, int id_ship, String description) {
            this.alias = name;
            this.id_ship = id_ship;
            this.description = description;
      }

      public int getId_mission() {
            return id_mission;
      }

      public void setId_mission(int id_mission) {
            this.id_mission = id_mission;
      }

      public String getAlias() {
            return alias;
      }

      public void setAlias(String alias) {
            this.alias = alias;
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
