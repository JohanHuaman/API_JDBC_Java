package com.proyecto.filmoteca;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("---------------------------");
            System.out.println(" GESTOR DE PELICULAS ");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Listar peliculas");
            System.out.println("3. Actulizar datos de pelicula");
            System.out.println("4. Borrar pelicula");
            System.out.println("0. SALIR");
            System.out.println("---------------------------");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    PeliculasService.insertarPelicula();
                    break;
                case 2:
                    //LISTAR
                    break;
                case 3:
                    //ACTUALIZAR
                    break;
                case 4:
                    //BORRAR
                    break;
                case 0:
                    System.out.println("Nos vemos!");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }

        } while (opcion != 0);

    }
}
