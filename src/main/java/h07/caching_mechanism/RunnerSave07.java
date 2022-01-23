package h07.caching_mechanism;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h06.lazy_fetch_eager_fetch.Book06;
import h06.lazy_fetch_eager_fetch.Student06;

public class RunnerSave07 {

	public static void main(String[] args) {
		
		
		Book07 b1 = new Book07(10, "Math Book");
		Book07 b2 = new Book07(11, "Java Book");
		Book07 b3 = new Book07(12, "Science Book");
		
		List<Book07> bookList = new ArrayList();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);

		
		Student07 std = new Student07(101, "Dayanch Gurbangeldiyev", 14, bookList);
		
		b1.setStudent( std);
		b2.setStudent( std);
		b3.setStudent( std);

		
		Configuration con =new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student07.class).addAnnotatedClass(Book07.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		
		session.save(std);

		
		
		
		tx.commit();
		
		
		
		

	}

}
