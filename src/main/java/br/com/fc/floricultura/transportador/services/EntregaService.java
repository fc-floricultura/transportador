package br.com.fc.floricultura.transportador.services;

import br.com.fc.floricultura.transportador.mappers.EntregaMapper;
import br.com.fc.floricultura.transportador.mappers.VoucherMapper;
import br.com.fc.floricultura.transportador.models.dto.EntregaDTO;
import br.com.fc.floricultura.transportador.models.dto.VoucherDTO;
import br.com.fc.floricultura.transportador.models.entities.Entrega;
import br.com.fc.floricultura.transportador.repositories.EntregaRepository;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EntregaService {
  private static final long TEMPO_ENTREGA = 1L;

  private final EntregaRepository repository;
  private final EntregaMapper entregaMapper;
  private final VoucherMapper voucherMapper;

  public VoucherDTO reservaEntrega(EntregaDTO entregaDTO) {
    final Entrega entrega = criarEntrega(entregaDTO);

    return voucherMapper.toDto(entrega);
  }

  private Entrega criarEntrega(EntregaDTO entregaDTO) {
    final LocalDate previsaoEntrega = entregaDTO.getDataParaEntrega().plusDays(TEMPO_ENTREGA);
    final Entrega entrega = entregaMapper.criarEntrega(entregaDTO, previsaoEntrega);

    return repository.save(entrega);
  }

}
