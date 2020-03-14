package model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateOneToManyMain
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cart cart=new Cart();
		cart.setName("NewCart");
		
		Items item1=new Items("I1",10,1,cart);
		Items item2=new Items("I2",20,2,cart);
		Set<Items> itemsSet =  new HashSet<Items>();
		itemsSet.add(item1);
		itemsSet.add(item2);
		cart.setItems(itemsSet);
		cart.setTotal(10*1+20*2);
		
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		
		try
		{
			sessionFactory=HibernateUtil.getSessionFactory();
			session=sessionFactory.openSession();
			System.out.println("Session Created");
			tx=session.beginTransaction();
			session.save(cart);
			session.save(item1);
			session.save(item2);
			tx.commit();
			System.out.println("Cart ID="+cart.getId());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured."+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			if(!sessionFactory.isClosed())
			{
				System.out.println("Closing SessionFactory");
				sessionFactory.close();
			}
		}
	}
}