package repository;

import Dominio.Producer;
import conn.ConnectionFactory;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class ProducerRepository {

    public static void create(Producer producer) {
        String sql = "INSERT INTO `shop_car`.`cars_garage` (`name`, `brand`, `model`) VALUES ('%s', '%s', '%s');"
                .formatted(producer.getName(), producer.getBrand(), producer.getModel());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Valor inserido ao database com sucesso");
         }catch(SQLException e){
                throw new RuntimeException(e);
        }
        }

    public static void delete(int id) {
        String sql = "DELETE FROM `shop_car`.`cars_garage` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Valor inserido ao database com sucesso");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `shop_car`.`cars_garage` SET `name` = '%s', `brand` = '%s', `model` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getBrand(), producer.getModel(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println("Valor inserido ao database com sucesso");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

 //   public static void selectAll(Producer producer) {
  //      String sql = "UPDATE `shop_car`.`cars_garage` SET `name` = '%s', `brand` = '%s', `model` = '%s' WHERE (`id` = '%d');"
   //             .formatted(producer.getName(), producer.getBrand(), producer.getModel(), producer.getId());
  //      try (Connection conn = ConnectionFactory.getConnection();
   //          Statement smt = conn.createStatement()) {
    //        int rowsAffected = smt.executeUpdate(sql);
     //       System.out.println("Valor inserido ao database com sucesso");
    //    }catch(SQLException e){
    //        throw new RuntimeException(e);
    //    }
  //  }
    }

