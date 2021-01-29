package com.proyecto.filmoteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeliculasDAO {
    
    private static final String INSERT = "INSERT INTO peliculas(titulo, director, genero, año, idioma, duracion) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT = "SELECT * FROM peliculas";
    private static final String UPDATE = "UPDATE peliculas SET titulo = ?, director = ?, genero = ?, año = ?, idioma = ?, duracion = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM peliculas WHERE id = ?";
            
    //INSERTAR PELICULA
    public static void insertarPeliculaDB(Peliculas pelicula){
        Connection conn;
        PreparedStatement ps;
        
        try{
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(INSERT);
            
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setString(3, pelicula.getGenero());
            ps.setString(4, pelicula.getAño());
            ps.setString(5, pelicula.getIdioma());
            ps.setInt(6, pelicula.getDuracion());
            
            ps.executeUpdate();
            
            System.out.println("Agregado Correctamente");
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    //LISTAR PELICULA
    public static void listarPeliculasDB(){
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: " +rs.getInt("id"));
                System.out.println("Titulo: " +rs.getString("titulo"));
                System.out.println("Director: " +rs.getString("director"));
                System.out.println("Genero: " +rs.getString("genero"));
                System.out.println("Año: " +rs.getString("año"));
                System.out.println("Idioma: " +rs.getString("idioma"));
                System.out.println("Duración: " +rs.getInt("duracion")+ " mins.");
                System.out.println("");
            }
        }catch(SQLException e){
            System.out.println("No se pudieron listar las peliculas");
            System.out.println(e);
        }
    }
    
    //ACTUALIZAR PELICULA
    public static void actualizarPeliculaDB(Peliculas pelicula){
        Connection conn;
        PreparedStatement ps;
        
        try{
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(UPDATE);
            
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setString(3, pelicula.getGenero());
            ps.setString(4, pelicula.getAño());
            ps.setString(5, pelicula.getIdioma());
            ps.setInt(6, pelicula.getDuracion());
            ps.setInt(7, pelicula.getId());
            
            ps.executeUpdate();
            
            System.out.println("Libro actualizado correctamente");
            
        }catch(SQLException e){
            System.out.println("El libro se actualizó");
            System.out.println(e);
        }
    }
    //BORRAR PELICULA
}
