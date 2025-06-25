package io.github.theus28238.Produtos.e.estoque.repositorys;

import io.github.theus28238.Produtos.e.estoque.entitys.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductsRepository extends JpaRepository<Produto, UUID> {
    List<Produto> findBynomeproduto(String nomeproduto);
}
