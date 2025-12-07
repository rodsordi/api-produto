package br.com.alura.produto.infra.repository;

import br.com.alura.produto.domain.entity.Produto;
import br.com.alura.produto.domain.repository.NotificacaoRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class NotificacaoRepositoryImpl implements NotificacaoRepository {

    @Override
    public void notificar(Produto produto) {

    }
}
