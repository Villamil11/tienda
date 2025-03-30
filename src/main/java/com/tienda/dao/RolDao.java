package com.tienda.dao;

import com.tienda.domain.Rol;
import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
    
    Usuario findByUsernameAndPassword(String username, String Password);

    Usuario findByUsernameOrCorreo(String username, String correo);

    boolean existsByUsernameOrCorreo(String username, String correo);

    public void save(Rol rol);
}