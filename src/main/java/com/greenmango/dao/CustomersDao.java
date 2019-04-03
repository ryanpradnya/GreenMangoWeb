package com.greenmango.dao;
// Generated Mar 30, 2019 11:34:54 PM by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.greenmango.entities.*;

/**
 * Home object for domain model class Customers.
 * @see com.greenmango.dao.Customers
 * @author Hibernate Tools
 */
@Stateless
public class CustomersDao {

	private static final Log log = LogFactory.getLog(CustomersDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Customers transientInstance) {
		log.debug("persisting Customers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Customers persistentInstance) {
		log.debug("removing Customers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Customers merge(Customers detachedInstance) {
		log.debug("merging Customers instance");
		try {
			Customers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Customers findById(Integer id) {
		log.debug("getting Customers instance with id: " + id);
		try {
			Customers instance = entityManager.find(Customers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
