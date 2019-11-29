package br.com.falcao.megazordapi.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import br.com.falcao.megazordapi.domain.dto.CategoriaDTO;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Version
	@Column(name = "versao", nullable = false)
	private Integer versao;
	
	public CategoriaDTO toDTO() {
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setCodigo(this.getCodigo());
		categoriaDTO.setNome(this.getNome());
		categoriaDTO.setVersao(this.getVersao());
		return categoriaDTO;
	}
	
}
