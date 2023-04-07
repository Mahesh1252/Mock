package mock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;




@Component
public class Idfcdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(idfcdto dto)
{
	entityTransaction.begin();
	entityManager.persist(dto);
	entityTransaction.commit();
}

public idfcdto fetch(String Email)
{
idfcdto idfcdto=entityManager.find(idfcdto.class, Email);

return idfcdto;
}
}
