package br.com.fc.floricultura.transportador.models.entities;

import java.time.LocalDate;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Entrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long pedidoId;
	private LocalDate dataParaBusca;
	private LocalDate previsaoParaEntrega;
	private String enderecoOrigem;
	private String enderecoDestino;

}
