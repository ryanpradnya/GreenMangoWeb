package com.greenmango.dao;
// Generated Mar 30, 2019 11:34:54 PM by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.greenmango.entities.*;

/**
 * Home object for domain model class Transaction.
 * @see com.greenmango.dao.Transaction
 * @author Hibernate Tools
 */
@Stateless
public class TransactionDao {

	private static final Log log = LogFactory.getLog(TransactionDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Transaction transientInstance) {
		log.debug("persisting Transaction instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Transaction persistentInstance) {
		log.debug("removing Transaction instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Transaction merge(Transaction detachedInstance) {
		log.debug("merging Transaction instance");
		try {
			Transaction result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Transaction findById(Integer id) {
		log.debug("getting Transaction instance with id: " + id);
		try {
			Transaction instance = entityManager.find(Transaction.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
