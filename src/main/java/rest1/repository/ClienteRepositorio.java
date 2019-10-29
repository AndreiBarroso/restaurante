package rest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest1.domain.Cliente;


@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {

}


