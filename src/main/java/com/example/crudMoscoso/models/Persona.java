package com.example.crudMoscoso.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //ponen automaticamente los Getter y Setter para cada a tributo
    //el @Column sirve para renombrar las columnas por ejemplo @Column(name="tel")
    @Column
    @Getter
    @Setter
    private long id;

    @Column
    @Getter
    @Setter
    private String nombre;


    @Column
    @Getter
    @Setter
    private String telefono;



}
