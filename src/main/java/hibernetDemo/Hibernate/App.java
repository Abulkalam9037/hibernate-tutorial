package hibernetDemo.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Employee emp = new Employee();
		emp.setId(103);
		emp.setName("Abdl");
		emp.setCity("Mumbra");
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		tx.commit();

	}
}
