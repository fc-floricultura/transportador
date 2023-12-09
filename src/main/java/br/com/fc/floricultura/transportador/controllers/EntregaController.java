package br.com.fc.floricultura.transportador.controllers;

import br.com.fc.floricultura.transportador.models.dto.EntregaDTO;
import br.com.fc.floricultura.transportador.models.dto.VoucherDTO;
import br.com.fc.floricultura.transportador.services.EntregaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/entrega")
public class EntregaController {

  private EntregaService entregaService;

  @RequestMapping(method = RequestMethod.POST)
  public VoucherDTO reservaEntrega(@RequestBody EntregaDTO pedidoDTO) {
    return entregaService.reservaEntrega(pedidoDTO);
  }
}
