package rest1.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Pedido {



    @Id
    @GeneratedValue
    private int  codigo;

    private String produto;

    private float preco;




}
