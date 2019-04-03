package com.greenmango.dao;
// Generated Mar 30, 2019 11:34:54 PM by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.greenmango.entities.*;

/**
 * Home object for domain model class Admin.
 * @see com.greenmango.dao.Admin
 * @author Hibernate Tools
 */
@Stateless
public class AdminDao {

	private static final Log log = LogFactory.getLog(AdminDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Admin transientInstance) {
		log.debug("persisting Admin instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Admin persistentInstance) {
		log.debug("removing Admin instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Admin merge(Admin detachedInstance) {
		log.debug("merging Admin instance");
		try {
			Admin result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Admin findById(AdminId id) {
		log.debug("getting Admin instance with id: " + id);
		try {
			Admin instance = entityManager.find(Admin.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
