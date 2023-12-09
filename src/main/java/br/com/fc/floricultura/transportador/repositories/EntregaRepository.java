package br.com.fc.floricultura.transportador.repositories;

import br.com.fc.floricultura.transportador.models.entities.Entrega;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Long> {

}
