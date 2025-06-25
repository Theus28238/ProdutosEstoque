package io.github.theus28238.Produtos.e.estoque.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "tb_products")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nomeproduto;
    private String descricao;


    private BigDecimal preco;

    private Date data_validade;
}
