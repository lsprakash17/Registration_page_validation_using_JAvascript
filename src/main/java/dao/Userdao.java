package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.User;
public class Userdao 
{
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager M=entityManagerFactory.createEntityManager();
EntityTransaction T=M.getTransaction();

public void Save(User user) 
{
T.begin();
M.persist(user);
T.commit();
}

}
