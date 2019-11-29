package br.com.falcao.megazordapi.commons;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class GenericRepositoryImpl <T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements GenericRepository<T, ID> {

	private EntityManager entityManager;
	
	public GenericRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
 		super(domainClass, entityManager);
		this.entityManager = entityManager;
	}
	
	public GenericRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}
	
	private Session getSession(){
		return this.entityManager.unwrap(Session.class);
	}

	public T persistOrUpdate(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	public T persistOrUpdate(T object, boolean atualizaCamposNulos) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> persistOrUpdate(Iterable<T> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> persistOrUpdate(Iterable<T> entities, boolean atualizaCamposNulos) {
		// TODO Auto-generated method stub
		return null;
	}	
}
