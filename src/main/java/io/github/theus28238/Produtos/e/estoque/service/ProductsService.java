package io.github.theus28238.Produtos.e.estoque.service;

import io.github.theus28238.Produtos.e.estoque.entitys.Produto;
import io.github.theus28238.Produtos.e.estoque.repositorys.ProductsRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository){
        this.productsRepository = productsRepository;
    }


    public Produto salvoProduto(Produto produto){
        return productsRepository.save(produto);
    }

    public void deletaProduto(UUID id){
       productsRepository.deleteById(id);
    }

    public List<Produto> encontrarNome(String nomeproduto){
        return productsRepository.findBynomeproduto(nomeproduto);


    }


}
