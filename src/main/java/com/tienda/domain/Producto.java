/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import com.tienda.domain.Categoria;
import lombok.Data;

/**
 *
 * @author josep
 */

@Data // Gerera por debajo los set y get
@Entity
@Table(name = "producto")

public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")   
    private Long idProducto;
    private String descripcion;
    private String destalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
    
    public Producto () {
    
    }
    

    public Producto(String descripcion, String destalle, double precio, int existencias, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.destalle = destalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

}
