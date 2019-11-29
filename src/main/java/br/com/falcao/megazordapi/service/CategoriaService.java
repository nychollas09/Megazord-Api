package br.com.falcao.megazordapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.falcao.megazordapi.domain.model.Categoria;
import br.com.falcao.megazordapi.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private final CategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	
	public Iterable<Categoria> buscarTodasAsCategorias(){
		return this.categoriaRepository.findAll();
	}
	
}
