package rest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest1.domain.Pedido;



@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, String> {

}