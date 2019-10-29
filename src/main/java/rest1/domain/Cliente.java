package rest1.domain;


import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Cliente {


    @Id
    @CPF
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;



}
