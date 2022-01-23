package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerUpdate {

	public static void main(String[] args) {

		Student std = new Student();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		String hqlQuery = "UPDATE Student s SET s.name = 'Ali Can' WHERE s.std_id = 103 ";
//
//		int row = session.createQuery(hqlQuery).executeUpdate();
//		System.out.println(row + " guncellendi");
//
//		String hqlQuery = "UPDATE Student s SET s.name = 'Isimsiz Kahraman' WHERE s.grade < 15 ";
//
//		int row = session.createQuery(hqlQuery).executeUpdate();
//		System.out.println(row + " guncellendi");
		
		
//		
//		std = session.get(Student.class, 104);
//		
//		std.setName("Veli Han");
//		std.setGrade(18);
		
		
		for(int i = 101; i<105; i++) {
			
			std = session.get(Student.class, i);
			
			
			std.setName("Harika Ogrenci");
			std.setGrade(15);
			
		}
		
		

		tx.commit();

	}

}
