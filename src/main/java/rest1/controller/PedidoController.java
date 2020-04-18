package rest1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rest1.domain.Pedido;
import rest1.repository.PedidoRepositorio;

@Controller
public class PedidoController {

    private final PedidoRepositorio repositorio;

    public PedidoController(PedidoRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @GetMapping(path = "/pedidos")
    public String lista (Model model) {

        Iterable<Pedido> pedidos = repositorio.findAll() ;

        model.addAttribute("pedidos", pedidos);

        return "pedidos/lista";
    }


}