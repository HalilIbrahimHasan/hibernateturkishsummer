package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {
		
		Student std = new Student();
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		std = session.get(Student.class, 102);
		
		
		tx.commit();
		
		System.out.println(std);
		
	}

}
