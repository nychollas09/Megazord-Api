package br.com.falcao.megazordapi.repository;

import org.springframework.stereotype.Repository;

import br.com.falcao.megazordapi.commons.GenericRepository;
import br.com.falcao.megazordapi.domain.model.Categoria;

@Repository
public interface CategoriaRepository extends GenericRepository<Categoria, Long> {
}
