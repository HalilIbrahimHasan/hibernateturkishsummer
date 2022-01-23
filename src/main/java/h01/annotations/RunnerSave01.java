package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

	public static void main(String[] args) {
		
		
		//                         std_id  student_name  grade email
		Student std1 = new Student(101, "Hakan Inal", 13);
		Student std2 = new Student(102, "Sabah Nur", 14);

		Student std3 = new Student(103, "Dayach", 15);
		Student std4 = new Student(104, "Hakan", 16);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf  = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		session.save(std4);
		

		tx.commit();
	}

}
