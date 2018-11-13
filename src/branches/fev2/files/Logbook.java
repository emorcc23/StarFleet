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
public class Logbook {

      private int id_logbook;
      private int id_ship;
      private String date;
      private String description;
      private String audio;
      
      public Logbook (int id_logbook, int id_ship, String date, String description, String audio) {
            this.id_logbook = id_logbook;
            this.id_ship = id_ship;
            this.date = date;
            this.description = description;
            this.audio = audio;
      }
      
      public Logbook (int id_ship, String date, String description, String audio) {
            this.id_ship = id_ship;
            this.date = date;
            this.description = description;
            this.audio = audio;
      }

      public int getId_logbook() {
            return id_logbook;
      }

      public void setId_logbook(int id_logbook) {
            this.id_logbook = id_logbook;
      }

      public int getId_ship() {
            return id_ship;
      }

      public void setId_ship(int id_ship) {
            this.id_ship = id_ship;
      }

      public String getDate() {
            return date;
      }

      public void setDate(String date) {
            this.date = date;
      }

      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

      public String getAudio() {
            return audio;
      }

      public void setAudio(String audio) {
            this.audio = audio;
      }
      
      

}
