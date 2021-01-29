package com.proyecto.filmoteca;

import java.util.Scanner;

public class PeliculasService {

    public static void insertarPelicula() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre la pelicula :");
        String peli = sc.nextLine();

        System.out.println("Ingrese el director de la pelicula :");
        String director = sc.nextLine();

        System.out.println("Ingrese ele genero de la pelicula :");
        String genero = sc.nextLine();

        System.out.println("Ingrese el año de la pelicula :");
        String año = sc.nextLine();

        System.out.println("Ingrese el idioma de la pelicula :");
        String idioma = sc.nextLine();

        System.out.println("Ingrese la duracion de la pelicula :");
        int duracion = sc.nextInt();

        Peliculas nuevaPelicula = new Peliculas(peli, director, genero, año, idioma, duracion);

        PeliculasDAO.insertarPeliculaDB(nuevaPelicula);
    }
    
    public static void listarPeliculas(){
        PeliculasDAO.listarPeliculasDB();
    }

    public static void actualizarPelicula() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre la pelicula :");
        String peli = sc.nextLine();

        System.out.println("Ingrese el director de la pelicula :");
        String director = sc.nextLine();

        System.out.println("Ingrese ele genero de la pelicula :");
        String genero = sc.nextLine();

        System.out.println("Ingrese el año de la pelicula :");
        String año = sc.nextLine();

        System.out.println("Ingrese el idioma de la pelicula :");
        String idioma = sc.nextLine();

        System.out.println("Ingrese la duracion de la pelicula :");
        int duracion = sc.nextInt();
        
        System.out.println("Ingrese el ID de la pelicua que se desea actualizar: ");
        int idAct = sc.nextInt();
        
        Peliculas peliculaActualizada = new Peliculas(idAct, peli, director, genero, año, idioma, duracion);
        
        PeliculasDAO.actualizarPeliculaDB(peliculaActualizada);
    }
}
