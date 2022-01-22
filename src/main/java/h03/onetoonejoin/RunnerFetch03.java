package h03.onetoonejoin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {

	public static void main(String[] args) {
		

		Student03 std = new Student03();
		Dairy dairy = new Dairy();
		
		

		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).addAnnotatedClass(Dairy.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
//		std = session.get(Student03.class, 103);
		
		
		tx.commit();
		
		
//		System.out.println(std);
		
		
		// Get student name, dairy, grade and id from both tables
		String sqlQuery = "";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
