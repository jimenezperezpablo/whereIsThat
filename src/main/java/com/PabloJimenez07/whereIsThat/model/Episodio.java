package com.PabloJimenez07.whereIsThat.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "episodios")
public class Episodio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;

    @ManyToMany
    @JoinTable(name = "episodio_localizacion", joinColumns = @JoinColumn(name = "episodio_id"), inverseJoinColumns = @JoinColumn(name = "localizacion_id"))
    private List<Localizacion> localizaciones = new ArrayList<>();

    public Episodio() {
    }

    public Episodio(int numero, String titulo, Temporada temporada) {
        this.numero = numero;
        this.titulo = titulo;
        this.temporada = temporada;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public List<Localizacion> getLocalizaciones() {
        return localizaciones;
    }

    public void setLocalizaciones(List<Localizacion> localizaciones) {
        this.localizaciones = localizaciones;
    }
}
