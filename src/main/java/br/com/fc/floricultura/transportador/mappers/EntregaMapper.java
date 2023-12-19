package br.com.fc.floricultura.transportador.mappers;

import br.com.fc.floricultura.transportador.models.dto.EntregaDTO;
import br.com.fc.floricultura.transportador.models.entities.Entrega;
import java.time.LocalDate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EntregaMapper {
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "dataParaBusca", source = "dataParaEntrega")
  Entrega toEntity(EntregaDTO entregaDTO);

  default Entrega criarEntrega(EntregaDTO entregaDTO, LocalDate previsaoParaEntrega) {
    Entrega entrega = toEntity(entregaDTO);
    entrega.setPrevisaoParaEntrega(previsaoParaEntrega);
    return entrega;
  }
}
