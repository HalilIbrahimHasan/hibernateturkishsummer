package h02.embeddables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import h01.annotations.Student;

public class RunnerSave02 {

	public static void main(String[] args) {
		
		Course course = new Course("Music", "Java");
		
		Student02 std2 = new Student02(101, "Sabah Nur", 14, course);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		
		session.save(std2);
		
		
		tx.commit();

	}

}
