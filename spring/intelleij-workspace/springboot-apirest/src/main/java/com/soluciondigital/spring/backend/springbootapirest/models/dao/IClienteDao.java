package com.soluciondigital.spring.backend.springbootapirest.models.dao;

import com.soluciondigital.spring.backend.springbootapirest.models.entity.Cliente;
/*import org.springframework.data.repository.CrudRepository;*/
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
