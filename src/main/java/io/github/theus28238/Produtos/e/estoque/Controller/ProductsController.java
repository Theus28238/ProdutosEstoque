package io.github.theus28238.Produtos.e.estoque.Controller;

import io.github.theus28238.Produtos.e.estoque.entitys.Produto;
import io.github.theus28238.Produtos.e.estoque.repositorys.ProductsRepository;
import io.github.theus28238.Produtos.e.estoque.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("produtosEstoque")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping("/SalveProduto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return productsService.salvoProduto(produto);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletandoProduto(@PathVariable("id") UUID id){
        productsService.deletaProduto(id);
    }

    @GetMapping("/buscar/{nomeproduto}")
    public List<Produto> buscar(@PathVariable("nomeproduto") String nomeproduto){
        System.out.println("Buscando produtos com o nome: " + nomeproduto);
        return productsService.encontrarNome(nomeproduto);
    }

    @PutMapping("/atualizar/{id}")
    public Produto atualizar(@PathVariable ("id") UUID id,@RequestBody Produto produto){
        return productsService.atualizar(id, produto);
    }
}
