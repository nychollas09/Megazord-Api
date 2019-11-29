package br.com.falcao.megazordapi.domain.dto;

import br.com.falcao.megazordapi.domain.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @SuppressWarnings("unused")
public class CategoriaDTO {

	private Long codigo;
	private String nome;
	private Integer versao;
	private String nomeECodigo;
	
	public String getNomeECodigo() {
		return new StringBuilder(String.valueOf(this.getCodigo())).append(" - ").append(this.getNome()).toString();
	}
	
	public Categoria toEntity() {
		Categoria categoria = new Categoria();
		categoria.setCodigo(this.getCodigo());
		categoria.setNome(this.getNome());
		categoria.setVersao(this.getVersao());
		return categoria;
	}
	
}
