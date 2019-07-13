package com.lti.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.User;

@Component("udao")
public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional // for begin and commit
	public void addUser(User usr) {
		entityManager.merge(usr);
	}
	public List<User> fetch(String uanem) {
		Query q=entityManager.createQuery("select t from User t where t.uname= :username");
		q.setParameter("username",uanem);
		List<User>list=q.getResultList();
	return list;
	}
}
