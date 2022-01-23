package h04.onetomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave04 {

	public static void main(String[] args) {
		

		
		Book04 b1 = new Book04(10, "Math Book");
		Book04 b2 = new Book04(11, "Java Book");
		Book04 b3 = new Book04(12, "Science Book");
		Book04 b4 = new Book04(13, "English Book");

		List<Book04> bookList1 = new ArrayList();
		
		bookList1.add(b1);
		bookList1.add(b2);

		Student04 std1 = new Student04(101, "Zehra Cicek", 11, bookList1);
		
		Student04 std2 = new Student04(102, "Bahar Koc", 12);
		
		std2.getBookList().add(b2);
		std2.getBookList().add(b3);

		
		b1.setStudent(std1);
		b2.setStudent(std1);
		
		b2.setStudent(std2);
		b3.setStudent(std2);
		
		
		Student04 std3 = new Student04(103, "Hakan Inal", 13);
		
		
		Configuration con =new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student04.class).addAnnotatedClass(Book04.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		
		
		
		
		
		
		
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);

		
		session.save(std1);
		session.save(std2);
		session.save(std3);

		
		
		
		tx.commit();
		
		
		
		
		
		
		
		
		
	}

}
