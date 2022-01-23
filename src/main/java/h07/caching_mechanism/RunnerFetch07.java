package h07.caching_mechanism;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		Student07 std = new Student07();
		
		
		Book07 book = new Book07();
		
		
		Configuration con =new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student07.class).addAnnotatedClass(Book07.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		book = session.get(Book07.class, 10);
		
		book = session.get(Book07.class, 11);
		
		book = session.get(Book07.class, 10);

		
		tx.commit();
		session.close();
		
		Session session2 = sf.openSession();
		
		Transaction tx2 = session2.beginTransaction();
		
		
		
		book = session2.get(Book07.class, 11);
		
		book = session2.get(Book07.class, 12);
		
		
		
		tx2.commit();
		
		

	}

}
