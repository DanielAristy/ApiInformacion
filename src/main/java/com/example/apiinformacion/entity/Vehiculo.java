package com.example.apiinformacion.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @Column(name = "placa")
    private String placa;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String  modelo;

    @Column(name = "color")
    private String color;

}
