package br.com.falcao.megazordapi.resource;

import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.falcao.megazordapi.domain.model.Categoria;
import br.com.falcao.megazordapi.service.CategoriaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@ExposesResourceFor(Categoria.class)
@RequestMapping(path = "/categoria-resource")
public class CategoriaResource {

	private final CategoriaService categoriaService;

	@GetMapping
	public ResponseEntity<Iterable<Categoria>> buscarTodasAsCategorias() {
		return ResponseEntity.ok().body(this.categoriaService.buscarTodasAsCategorias());
	}

}
