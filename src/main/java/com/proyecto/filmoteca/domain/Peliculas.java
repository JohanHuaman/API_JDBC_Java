package com.proyecto.filmoteca.domain;

public class Peliculas {
    
    private int id;
    private String titulo;
    private String director;
    private String genero;
    private String año;
    private String idioma;
    private int duracion; 

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, String genero, String año, String idioma, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.año = año;
        this.idioma = idioma;
        this.duracion = duracion;
    }

    public Peliculas(int id, String titulo, String director, String genero, String año, String idioma, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.año = año;
        this.idioma = idioma;
        this.duracion = duracion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
