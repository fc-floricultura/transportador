package br.com.fc.floricultura.transportador.services;

import br.com.fc.floricultura.transportador.models.dto.EntregaDTO;
import br.com.fc.floricultura.transportador.models.dto.VoucherDTO;
import br.com.fc.floricultura.transportador.models.entities.Entrega;
import br.com.fc.floricultura.transportador.repositories.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EntregaService {

  private final EntregaRepository repository;

  public VoucherDTO reservaEntrega(EntregaDTO pedidoDTO) {

    Entrega entrega = new Entrega();
    entrega.setDataParaBusca(pedidoDTO.getDataParaEntrega());
    entrega.setPrevisaoParaEntrega(pedidoDTO.getDataParaEntrega().plusDays(1l));
    entrega.setEnderecoDestino(pedidoDTO.getEnderecoDestino());
    entrega.setEnderecoOrigem(pedidoDTO.getEnderecoOrigem());
    entrega.setPedidoId(pedidoDTO.getPedidoId());

    repository.save(entrega);

    VoucherDTO voucher = new VoucherDTO();
    voucher.setNumero(entrega.getId());
    voucher.setPrevisaoParaEntrega(entrega.getPrevisaoParaEntrega());
    return voucher;
  }

}
