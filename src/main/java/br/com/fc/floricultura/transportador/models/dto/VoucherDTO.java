package br.com.fc.floricultura.transportador.models.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VoucherDTO {

	private Long numero;

	private LocalDate previsaoParaEntrega;

}
