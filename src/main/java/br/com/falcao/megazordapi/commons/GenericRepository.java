package br.com.falcao.megazordapi.commons;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

	public T persistOrUpdate(T object);

	public T persistOrUpdate(T object, boolean atualizaCamposNulos);

	public List<T> persistOrUpdate(Iterable<T> entities);

	public List<T> persistOrUpdate(Iterable<T> entities, boolean atualizaCamposNulos);

}
