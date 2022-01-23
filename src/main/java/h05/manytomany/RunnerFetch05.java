package h05.manytomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch05 {

	public static void main(String[] args) {

		Book05 book = new Book05();

		Student05 std = new Student05();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student05.class)
				.addAnnotatedClass(Book05.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		std = session.get(Student05.class, 102);

		//
//		String hqlQuery = "FROM Book05 WHERE book_name = 'English Book' ";
//
//		List<Object> hqlList = session.createQuery(hqlQuery).getResultList();
//
//		System.out.println(hqlList);
		
		
		

		String hqlQuery = "FROM Book05 WHERE book_name = 'English Book' ";

		List<Object> singleResult = session.createQuery(hqlQuery).getResultList();

		System.out.println(singleResult);

		tx.commit();
		
		

//		System.out.print(std);

	}

}
