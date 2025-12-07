package br.com.alura.produto.infra.repository;

import br.com.alura.produto.domain.repository.ProdutoRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface ProdutoRepositoryExt extends ProdutoRepository {

}
