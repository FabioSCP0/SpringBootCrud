package com.github.FabioSCP0.ProjetoSB.models.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.github.FabioSCP0.ProjetoSB.models.entity.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
