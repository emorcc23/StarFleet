/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev1.methods;

import branches.fev1.dao.DaoLogbook;
import branches.fev1.dao.DaoMission;
import branches.fev1.dao.DaoShip;
import branches.fev1.dao.DaoTripulant;
import branches.fev1.files.Logbook;
import branches.fev1.files.Mission;
import branches.fev1.files.Ship;
import branches.fev1.files.Tripulant;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro.santos
 */
public class Methods {

      static Scanner enter = new Scanner(System.in);

      public static int menu() {
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. List by id");
            System.out.println("4. Remove");
            System.out.println("5. Update");
            System.out.println("0. Exit");
            int option = enter.nextInt();
            return option;
      }

      public static void updateShip() throws SQLException {
            System.out.println("\n You have chosen: update a ship");
            System.out.println("ID ship (int):");
            int i = enter.nextInt();
            System.out.println("Captain (String):");
            String c = enter.next();
            System.out.println("Name (String):");
            String n = enter.next();
            System.out.println("Register (String):");
            String m = enter.next();
            System.out.println("Type (String):");
            String t = enter.next();
            System.out.println("Image (String):");
            String f = enter.next();

            Ship newNave = new Ship(i, c, n, m, t, f);
            DaoShip.getInstance().update(newNave);
            System.out.println("Has been updated successfully");
      }

      public static void addShip() throws SQLException {
            System.out.println("\n You have chosen: add a ship");
            System.out.println("ID ship (int):");
            int i = enter.nextInt();
            System.out.println("Captain (String):");
            String c = enter.next();
            System.out.println("Name (String):");
            String n = enter.next();
            System.out.println("Register (String):");
            String m = enter.next();
            System.out.println("Type (String):");
            String t = enter.next();
            System.out.println("Image (String):");
            String f = enter.next();

            Ship newNave = new Ship(i, c, n, m, t, f);
            DaoShip.getInstance().insert(newNave);
            System.out.println("Has been added successfully");
      }

      public static void addTripulant() throws SQLException {
            System.out.println("\n You have chosen: add a tripulant");
            System.out.println("ID tripulant (int):");
            int i = enter.nextInt();
            System.out.println("Name (String):");
            String n = enter.next();
            System.out.println("Position (String):");
            String c = enter.next();
            System.out.println("Gender (String):");
            String s = enter.next();
            System.out.println("Experience (int):");
            int e = enter.nextInt();
            System.out.println("Origin (String):");
            String o = enter.next();
            System.out.println("Race (String)");
            String r = enter.next();
            System.out.println("Age (int)");
            int ed = enter.nextInt();
            System.out.println("Image (String):");
            String f = enter.next();
            System.out.println("ID ship (int):");
            int id = enter.nextInt();

            Tripulant newTripulante = new Tripulant(i, n, c, s, e, o, r, ed, f, id);
            DaoTripulant.getInstance().insert(newTripulante);
            System.out.println("Has been added successfully");
      }

      public static void addMission() throws SQLException {
            System.out.println("\n You have chosen: add a Mission");
            System.out.println("ID mission (String):");
            int i = enter.nextInt();
            System.out.println("Name: (String):");
            String n = enter.next();
            System.out.println("ID ship (int):");
            int id = enter.nextInt();
            System.out.println("Description (String):");
            String d = enter.next();

            Mission newMision = new Mission(i, n, id, d);
            DaoMission.getInstance().insert(newMision);
            System.out.println("Has been added successfully");
      }

      public static void addLogbook() throws SQLException {
            System.out.println("\n You have chosen: add a logbook");
            System.out.println("ID logbook (int):");
            int i = enter.nextInt();
            System.out.println("ID ship (int):");
            int id = enter.nextInt();
            System.out.println("Date (String YYYY/MM/DD):");
            String f = enter.next();
            System.out.println("Description: (String):");
            String d = enter.next();
            System.out.println("Audio: (String):");
            String a = enter.next();

            Logbook newCuaderno = new Logbook(i, id, f, d, a);
            DaoLogbook.getInstance().insert(newCuaderno);
            System.out.println("Registrado con exito");

      }

      public static void add() throws SQLException {
            System.out.println("\n Selec a option to add: ");
            System.out.println("1. Ship");
            System.out.println("2. Tripulant");
            System.out.println("3. Mission");
            System.out.println("4. Logbook");
            int e = enter.nextInt();
            switch (e) {
                  case 1:
                        addShip();
                        break;
                  case 2:
                        addTripulant();
                        break;
                  case 3:
                        addMission();
                        break;
                  case 4:
                        addLogbook();
                        break;
                  default:
                        System.out.println("Couldn't added");
                        break;
            }
      }

      public static void listShip() throws SQLException {
            ArrayList<Ship> listaNaves = DaoShip.getInstance().findAll();
            for (int i = 0; i < listaNaves.size(); i++) {
                  System.out.println("Ship: " + listaNaves.get(i).getId_ship());
                  System.out.println("Captain: " + listaNaves.get(i).getCaptain());
                  System.out.println("Name: " + listaNaves.get(i).getName());
                  System.out.println("Register: " + listaNaves.get(i).getRegister());
                  System.out.println("Type: " + listaNaves.get(i).getType());
                  System.out.println("Image: " + listaNaves.get(i).getImage());
            }
      }

      public static void listTripulant() throws SQLException {
            ArrayList<Tripulant> listaTripulantes = DaoTripulant.getInstance().findAll();
            for (int i = 0; i < listaTripulantes.size(); i++) {
                  System.out.println("Tripulant: " + listaTripulantes.get(i).getId_tripulant());
                  System.out.println("Name: " + listaTripulantes.get(i).getName());
                  System.out.println("Position: " + listaTripulantes.get(i).getPosition());
                  System.out.println("Gender: " + listaTripulantes.get(i).getGender());
                  System.out.println("Experience: " + listaTripulantes.get(i).getExperience());
                  System.out.println("Origin: " + listaTripulantes.get(i).getOrigin());
                  System.out.println("Race: " + listaTripulantes.get(i).getRace());
                  System.out.println("Age: " + listaTripulantes.get(i).getAge());
                  System.out.println("Image: " + listaTripulantes.get(i).getImage());
                  System.out.println("ID ship: " + listaTripulantes.get(i).getId_ship());
            }
      }

      public static void listMission() throws SQLException {
            ArrayList<Mission> listaMisiones = DaoMission.getInstance().findAll();
            for (int i = 0; i < listaMisiones.size(); i++) {
                  System.out.println("Mission: " + listaMisiones.get(i).getId_mission());
                  System.out.println("Name: " + listaMisiones.get(i).getName());
                  System.out.println("ID ship: " + listaMisiones.get(i).getId_ship());
                  System.out.println("Description: " + listaMisiones.get(i).getDescription());
            }
      }

      public static void listLogbook() throws SQLException {
            ArrayList<Logbook> listaCuadernos = DaoLogbook.getInstance().findAll();
            for (int i = 0; i < listaCuadernos.size(); i++) {
                  System.out.println("ID Logbook: " + listaCuadernos.get(i).getId_logbook());
                  System.out.println("ID Ship: " + listaCuadernos.get(i).getId_ship());
                  System.out.println("Date: " + listaCuadernos.get(i).getDate());
                  System.out.println("Description: " + listaCuadernos.get(i).getDescription());
                  System.out.println("Audio: " + listaCuadernos.get(i).getAudio());
            }
      }

      public static void list() throws SQLException {
            System.out.println("\n Select a option to list");
            System.out.println("1. Ship");
            System.out.println("2. Tripulant");
            System.out.println("3. Mission");
            System.out.println("4. Logbook");
            int e = enter.nextInt();
            switch (e) {
                  case 1:
                        listShip();
                        break;
                  case 2:
                        listTripulant();
                        break;
                  case 3:
                        listMission();
                        break;
                  case 4:
                        listLogbook();
                        break;
                  default:
                        System.out.println("Couldn't listed");
                        break;
            }
      }

      public static void listShipById() throws SQLException {
            System.out.println("Introduce the ID that you want to search: ");
            int id = enter.nextInt();
            Ship datoPorId = DaoShip.getInstance().findByPk(id);
            System.out.println("Ship: " + datoPorId.getId_ship());
            System.out.println("Captain: " + datoPorId.getCaptain());
            System.out.println("Name: " + datoPorId.getName());
            System.out.println("Register: " + datoPorId.getRegister());
            System.out.println("Type: " + datoPorId.getType());
            System.out.println("Image: " + datoPorId.getImage());
      }

      public static void listTripulantById() throws SQLException {
            System.out.println("Introduce the ID that you want to search: ");
            int id = enter.nextInt();
            Tripulant datoPorId = DaoTripulant.getInstance().findByPk(id);
            System.out.println("Tripulant: " + datoPorId.getId_tripulant());
            System.out.println("Name: " + datoPorId.getName());
            System.out.println("Position: " + datoPorId.getPosition());
            System.out.println("Gender: " + datoPorId.getGender());
            System.out.println("Experience: " + datoPorId.getExperience());
            System.out.println("Origin: " + datoPorId.getOrigin());
            System.out.println("Race: " + datoPorId.getRace());
            System.out.println("Age: " + datoPorId.getAge());
            System.out.println("Image: " + datoPorId.getImage());
            System.out.println("ID ship: " + datoPorId.getId_ship());
      }

      public static void listMissionById() throws SQLException {
            System.out.println("Introduce the ID that you want to search ");
            int id = enter.nextInt();
            Mission datoPorId = DaoMission.getInstance().findByPk(id);
            System.out.println("Mission: " + datoPorId.getId_mission());
            System.out.println("Name: " + datoPorId.getName());
            System.out.println("Ship: " + datoPorId.getId_ship());
            System.out.println("Description: " + datoPorId.getDescription());
      }

      public static void listLogbookById() throws SQLException {
            System.out.println("Introduce the ID that you want to search: ");
            int id = enter.nextInt();
            Logbook datoPodId = DaoLogbook.getInstance().findByPk(id);
            System.out.println("Logbook: " + datoPodId.getId_logbook());
            System.out.println("Ship: " + datoPodId.getId_ship());
            System.out.println("Date: " + datoPodId.getDate());
            System.out.println("Description: " + datoPodId.getDescription());
            System.out.println("Audio: " + datoPodId.getAudio());
      }

      public static void listById() throws SQLException {
            System.out.println("\n Select the list that you want to see:");
            System.out.println("1. Ship");
            System.out.println("2. Tripulant");
            System.out.println("3. Mission");
            System.out.println("4. Logbook");
            int e = enter.nextInt();
            switch (e) {
                  case 1:
                        listShipById();
                        break;
                  case 2:
                        listTripulantById();
                        break;
                  case 3:
                        listMissionById();
                        break;
                  case 4:
                        listLogbookById();
                        break;
                  default:
                        System.out.println("Couldn't list by id");
                        break;
            }
      }

      public static void removeShipById() throws SQLException {
            System.out.println("Introduce the ID that you want to remove: ");
            int id = enter.nextInt();
            DaoShip.getInstance().delete(id);
            System.out.println("Has been removed successfully");
      }

      public static void removeTripulantById() throws SQLException {
            System.out.println("Introduce the ID that you want to remove: ");
            int id = enter.nextInt();
            DaoTripulant.getInstance().delete(id);
            System.out.println("Has been removed successfully");
      }

      public static void removeMissionById() throws SQLException {
            System.out.println("Introduce the ID that you want to remove: ");
            int id = enter.nextInt();
            DaoMission.getInstance().delete(id);
            System.out.println("Has been removed successfully");
      }

      public static void removeLogbookById() throws SQLException {
            System.out.println("Introduce the ID that you want to remove: ");
            int id = enter.nextInt();
            DaoLogbook.getInstance().delete(id);
            System.out.println("Has been removed successfully");
      }

      public static void removeById() throws SQLException {
            System.out.println("\n Select the list that you want to remove by id:");
            System.out.println("1. Ship");
            System.out.println("2. Tripulant");
            System.out.println("3. Mission");
            System.out.println("4. Logbook");
            int e = enter.nextInt();
            switch (e) {
                  case 1:
                        removeShipById();
                        break;
                  case 2:
                        removeTripulantById();
                        break;
                  case 3:
                        removeMissionById();
                        break;
                  case 4:
                        removeLogbookById();
                        break;
                  default:
                        System.out.println("Couldn't remove by id");
                        break;
            }
      }
}
