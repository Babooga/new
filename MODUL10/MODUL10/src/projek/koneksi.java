/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projek;

/**
 *
 * @author rama
 * 2211102208
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi{
    private static Connection mysqlkoneksi;
    public static Connection koneksiDB() throws SQLException{
        if(mysqlkoneksi == null){
            try{
                String DB = "jdbc:mysql://localhost:3306/dbdata";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkoneksi = (Connection) DriverManager.getConnection(DB, user, pass);
            }catch(Exception e){
                
            }
        }return mysqlkoneksi;
    }
}
