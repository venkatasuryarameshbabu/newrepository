package model;
public class HibernateUtil {

private static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory() {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
return factory;

}
}