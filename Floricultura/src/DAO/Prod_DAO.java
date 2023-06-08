/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Bean.ProdutoBean;
import Conect.ConectBD;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vh
 */
public class Prod_DAO {
    
    public void CreateProd (ProdutoBean Prod_Bean, int id){
        
        if(id == 0) {
        
         Connection con = ConectBD.GetConnection();
         PreparedStatement stmt = null;
       
       try{
          stmt = con.prepareStatement("INSERT INTO `produtos`(`nome`, `categoria`, `quantidade`, `preco`) VALUES (?,?,?,?)");
          stmt.setString(1, Prod_Bean.getProd_name());
          stmt.setString(2, Prod_Bean.getProd_categ());
          stmt.setInt(3, Prod_Bean.getProd_Quant());
          stmt.setFloat(4, Prod_Bean.getProd_preço());
          
          stmt.executeUpdate();
          
           JOptionPane.showMessageDialog(null,"Produto criado com sucesso!");
          
       }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro ao salvar: " + e);
        }finally{
           ConectBD.closeconection(con, stmt);
       }
       
        }else{
            
         Connection con = ConectBD.GetConnection();
         PreparedStatement stmt = null;
       
       try{
          stmt = con.prepareStatement("INSERT INTO `produtos`(`id_produto`, `nome`, `categoria`, `quantidade`, `preco`) VALUES (?,?,?,?,?)");
          stmt.setInt(1, id);
          stmt.setString(2, Prod_Bean.getProd_name());
          stmt.setString(3, Prod_Bean.getProd_categ());
          stmt.setInt(4, Prod_Bean.getProd_Quant());
          stmt.setFloat(5, Prod_Bean.getProd_preço());
          
          stmt.executeUpdate();
          
           JOptionPane.showMessageDialog(null,"Produto criado com sucesso!");
          
       }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro ao salvar: " + e);
        }finally{
           ConectBD.closeconection(con, stmt);
       }
            
        }
        
    }
    
    public void BuscarProd (int id, ProdutoBean Prod_Bean){
        
        Connection con = ConectBD.GetConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
       try{
           stmt = con.prepareStatement("SELECT * FROM `produtos` WHERE `id_produto` = '"+id+"'");
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Prod_Bean.setProd_name(rs.getString("nome"));
               Prod_Bean.setProd_categ(rs.getString("categoria"));
               Prod_Bean.setProd_Quant(rs.getInt("quantidade"));
               Prod_Bean.setProd_preço(rs.getFloat("preco"));
           }
          
       }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro ao obter produto: " + e);
        }finally{
           ConectBD.closeconection(con, stmt,rs);
       }
        
    }
    
    
    public void UpdateProd (int id, ProdutoBean Prod_Bean){
        
         Connection con = ConectBD.GetConnection();
         PreparedStatement stmt = null;
       
       try{
          stmt = con.prepareStatement("UPDATE `produtos` SET `nome` = ?,`categoria` = ?,`quantidade` = ?,`preco` = ? WHERE `id_produto` = ?");
          stmt.setString(1, Prod_Bean.getProd_name());
          stmt.setString(2, Prod_Bean.getProd_categ());
          stmt.setInt(3, Prod_Bean.getProd_Quant());
          stmt.setFloat(4, Prod_Bean.getProd_preço());
          stmt.setInt(5, id);
          
          stmt.executeUpdate();
          
           JOptionPane.showMessageDialog(null,"Produto atualizado com sucesso!");
          
       }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro ao salvar: " + e);
        }finally{
           ConectBD.closeconection(con, stmt);
       }
        
    }
    
    public void DeleteProd (int id){
        
         Connection con = ConectBD.GetConnection();
         PreparedStatement stmt = null;
       
       try{
          stmt = con.prepareStatement("DELETE FROM `produtos` WHERE `id_produto` = ?");
          stmt.setInt(1, id);
          
          stmt.executeUpdate();
          JOptionPane.showMessageDialog(null,"Produto deletado com sucesso!");
          
       }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Erro ao deletar: " + e);
        }finally{
           ConectBD.closeconection(con, stmt);
       }
        
    }
    
}
