package h04.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		
		
		
		Student04 std = new Student04();
		
		Book04 book = new Book04();
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student04.class).
				addAnnotatedClass(Book04.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		book = session.get(Book04.class, 13);
		
		
		tx.commit();
		
		System.out.println(book);
		
		

	}

}
