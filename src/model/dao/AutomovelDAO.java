package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.entity.Automovel;
import model.util.JPAUtil;

public class AutomovelDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2010);
		auto.setModelo("Ferrari");
		auto.setObservacoes("Nunca foi batido");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		em.close();	

	}

}
