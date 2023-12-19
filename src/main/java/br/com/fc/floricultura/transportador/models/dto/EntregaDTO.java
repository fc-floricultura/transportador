package br.com.fc.floricultura.transportador.models.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EntregaDTO {

	private Long pedidoId;
	private LocalDate dataParaEntrega;
	private String enderecoOrigem;
	private String enderecoDestino;

}
