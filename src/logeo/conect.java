/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Tristan
 */
public class conect {

    public static Connection getConexion() {
        String Url = "jdbc:sqlserver://SLAG-RJ45\\SERVER:65274;databaseName=Login;user=sa;password=root;";

        try {
            Connection con = DriverManager.getConnection(Url);
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public static ArrayList<String> esta(){
        ArrayList<String> lista = new ArrayList<String>();
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT * FROM Estados"); 
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("estados"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public static ArrayList<String> des(){
        ArrayList<String> lista = new ArrayList<String>();
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT * FROM Hoteles"); 
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("destino"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public static ArrayList<String> atra(){
        ArrayList<String> lista = new ArrayList<String>();
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            Connection con = conect.getConexion();
            ps = con.prepareStatement("SELECT * FROM Guias"); 
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("atractivo"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
    
    
}
    
    
    
    
    
    
    
    
    

