package com.greenmango.dao;
// Generated Mar 30, 2019 11:34:54 PM by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.greenmango.entities.*;

/**
 * Home object for domain model class Summary.
 * @see com.greenmango.dao.Summary
 * @author Hibernate Tools
 */
@Stateless
public class SummaryDao {

	private static final Log log = LogFactory.getLog(SummaryDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Summary transientInstance) {
		log.debug("persisting Summary instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Summary persistentInstance) {
		log.debug("removing Summary instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Summary merge(Summary detachedInstance) {
		log.debug("merging Summary instance");
		try {
			Summary result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Summary findById(Integer id) {
		log.debug("getting Summary instance with id: " + id);
		try {
			Summary instance = entityManager.find(Summary.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
