package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.entity.Automovel;
import model.util.JPAUtil;

public class AutomovelDAO {

	
	public void insereAuto(Automovel auto) {
		EntityManager em = JPAUtil.getEntityManager();		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		em.close();
	}
	
	public List<Automovel> listaAutos() {		
		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		List<Automovel> autos = q.getResultList();
		em.close();		
		return autos;
	}	
	

}
