package com.proyecto.filmoteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    
    
    private static final String URL = "jdbc:mysql://localhost:3306/filmoteca?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
    public static void close(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
}
