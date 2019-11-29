package br.com.falcao.megazordapi.commons;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.ResultTransformer;

public class GenericCustomRepositoryImpl<T, ID extends Serializable> {

	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public Session getSession() {
		return this.entityManager.unwrap(Session.class);
	}
	
	public SQLQuery createSQLQuery(StringBuilder stb, ResultTransformer resultTransformer) {
		SQLQuery query = getSession().createSQLQuery(stb.toString());
		query.setResultTransformer(resultTransformer);
		
		return query;
	}
	
}
