package com.PabloJimenez07.whereIsThat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "temporadas")
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private int anioEmision;
    private int numeroEpisodios;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

    public Temporada() {
    }

    public Temporada(int numero, int anioEmision, int numeroEpisodios, Serie serie) {
        this.numero = numero;
        this.anioEmision = anioEmision;
        this.numeroEpisodios = numeroEpisodios;
        this.serie = serie;
    }

    public Long getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnioEmision() {
        return anioEmision;
    }

    public void setAnioEmision(int anioEmision) {
        this.anioEmision = anioEmision;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}