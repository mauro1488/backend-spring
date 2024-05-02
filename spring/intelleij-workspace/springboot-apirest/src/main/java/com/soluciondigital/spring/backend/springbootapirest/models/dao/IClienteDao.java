package com.soluciondigital.spring.backend.springbootapirest.models.dao;

import com.soluciondigital.spring.backend.springbootapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
