package br.com.falcao.megazordapi.commons;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class GenericCustomRepositoryImpl<T, ID extends Serializable> {

	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public Session getSession() {
		return this.entityManager.unwrap(Session.class);
	}
	
	public TypedQuery<T> createSQLQuery(StringBuilder stb, Class<T> resultTransformer) {
		//Query query = this.getSession().createSQLQuery(stb.toString());
		//query.setResultTransformer(resultTransformer);
		/*Query query;
		query.value(stb.toString());
		query.nativeQuery(true);*/
		CriteriaBuilder criteriaBuilder = this.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(resultTransformer);
		Root<T> transform = criteriaQuery.from(resultTransformer);
		criteriaQuery.select(transform);
		
		TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		return typedQuery;
	}
	
}
