package br.com.fc.floricultura.transportador.mappers;

import br.com.fc.floricultura.transportador.models.dto.VoucherDTO;
import br.com.fc.floricultura.transportador.models.entities.Entrega;
import java.time.LocalDate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface VoucherMapper {

  @Mapping(target = "numero", source = "pedidoId")
  VoucherDTO toDto(Entrega entrega);
}
