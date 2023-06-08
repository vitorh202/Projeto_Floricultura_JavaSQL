/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vh
 */
public class ConectBD {
    
    private static final String drive = "com.mysql.cj.jdbc.Driver";
    private static  final String URL = "jdbc:mysql://localhost:3306/floricultura";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection GetConnection(){
        
            try {
        Class.forName(drive);
        
        return DriverManager.getConnection(URL, USER, PASS);
        
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException ("Erro na conexão" + e);
        }
        
    }
    
    public static void closeconection (Connection com){
            try {
                 if(com != null){
                com.close();
                 }
            } catch (SQLException ex) {
                System.out.println("Tentativa de fechar o servidor falhou pos o mesmo não está aberto, Erro: " + ex);
            
        }
        
    }
    
        public static void closeconection (Connection com, PreparedStatement stmt){
            
            closeconection(com);
            
            try {     
              
                if(stmt != null){
                    stmt.close();
                }
                
            } catch (SQLException ex) {
                System.out.println("Tentativa de fechar o servidor falhou pos o mesmo não está aberto, Erro: " + ex);
            
        }
        
    }
        
          public static void closeconection (Connection com, PreparedStatement stmt, ResultSet rs){
            
                  closeconection(com, stmt);
            
            try {     
            
                if (rs != null){
                    rs.close();
                }
                
            } catch (SQLException ex) {
                System.out.println("Tentativa de fechar o servidor falhou pos o mesmo não está aberto, Erro: " + ex);
            
        }
        
    }
    
}
