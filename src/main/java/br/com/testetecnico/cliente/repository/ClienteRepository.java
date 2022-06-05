package br.com.testetecnico.cliente.repository;

import br.com.testetecnico.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
