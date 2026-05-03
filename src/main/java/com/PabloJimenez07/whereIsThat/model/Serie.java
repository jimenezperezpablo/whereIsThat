package com.PabloJimenez07.whereIsThat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "series")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int numeroTemporadas;
    private boolean emision;
    private String posterUrl;
    private String genero;
    private int anioSalida;
    private String derechos;

    public Serie() {
    }

    public Serie(String titulo, int numeroTemporadas, boolean emision,
            String posterUrl, String genero, int anioSalida, String derechos) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.emision = emision;
        this.posterUrl = posterUrl;
        this.genero = genero;
        this.anioSalida = anioSalida;
        this.derechos = derechos;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isEmision() {
        return emision;
    }

    public void setEmision(boolean emision) {
        this.emision = emision;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(int anioSalida) {
        this.anioSalida = anioSalida;
    }

    public String getDerechos() {
        return derechos;
    }

    public void setDerechos(String derechos) {
        this.derechos = derechos;
    }
}