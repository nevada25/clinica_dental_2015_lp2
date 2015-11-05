/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NEVADA
 */
public class conexionpostgres {
    
   public static Connection conectar(){
    Connection cn=null;
    
        try {
             Class.forName("org.postgresql.Driver");
            cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/centro_odonto","postgres","root");
        } catch (Exception e) {
               System.out.println("ERROR CONEXION"+e.getMessage());
               e.printStackTrace();
        }
    
    return cn;
    } 
    
    public static void main(String[] args) {
        if (conectar()!=null) {
            System.out.println("OK :) ");
        } else {
            System.out.println("NO :(");
        }
        
    }
    
    
}
