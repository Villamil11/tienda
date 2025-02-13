/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tienda.domain;

import jakarta.persitence.*;
import java.io.Serializable;
import lombok.Data;



@Data // Gerera por debajo los set y get
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria; // id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria(){
    }
    
        public Categoria(String descripcion,String rutaImagen, boolean activo)
    {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
}
