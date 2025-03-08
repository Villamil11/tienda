/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.domain.Producto;


public interface ProductoDao extends JpaRepository<Producto, Long> {
    

}
