package rest1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import rest1.domain.Cliente;
import rest1.repository.ClienteRepositorio;

@Controller
public class ClienteController {

    private final ClienteRepositorio repositorio;

    public  ClienteController(ClienteRepositorio repo) {

        repositorio = repo;

    }

    @GetMapping (path = "/clientes")

    public String lista (Model model) {

        Iterable<Cliente> clientes = repositorio.findAll();

        model.addAttribute("clientes", clientes);
        return "clientes/lista";

    }

    @PostMapping (path = "/clientes")

    public String  criaCliente ( String cpf, String nome, String endereco, String telefone) {

        Cliente novoCliente = new Cliente();
        novoCliente.setCpf(cpf);
        novoCliente.setNome(nome);
        novoCliente.setEndereco(endereco);
        novoCliente.setTelefone(telefone);
        repositorio.save(novoCliente);

        return "redirect:/clientes";


    }


}
