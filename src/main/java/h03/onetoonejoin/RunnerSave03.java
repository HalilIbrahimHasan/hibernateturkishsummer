package h03.onetoonejoin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {

	public static void main(String[] args) {
		
		Dairy d1 = new Dairy(10, "Ilk Dairy" );
		Dairy d2 = new Dairy(11, "ikinci Dairy");
		Dairy d3 = new Dairy(12, "Ucuncu Dairy");

		Student03 std1 = new Student03(101, "Hakan Inal", 12,d1 );
		Student03 std2 = new Student03(102, "Dayanch Gurbangeldiyev", 13,d2);
		Student03 std3 = new Student03(103, "Sabah Nur", 13,d3 );
		
		d1.setStudent(std1);
		d2.setStudent(std2);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).addAnnotatedClass(Dairy.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(d1);
		session.save(d2);
		session.save(d3);

		session.save(std1);
		session.save(std2);
		session.save(std3);

		
		
		tx.commit();
		
		
		
		
		

	}

}
