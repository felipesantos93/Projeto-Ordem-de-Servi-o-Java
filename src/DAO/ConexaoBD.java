/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
	


	public static Connection conectar() {
	Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestaoservico?serverTimezone=UTC", "root", "120993"); 
		
			
		} catch (ClassNotFoundException | SQLException erro ) {
			System.out.println("DAO.ConexaoBD.conectar() Drive não está na biblioteca ou erro na conexão com o banco" + erro);
			
		}  
                return conn;
	}
	
	
      
}
	
	
