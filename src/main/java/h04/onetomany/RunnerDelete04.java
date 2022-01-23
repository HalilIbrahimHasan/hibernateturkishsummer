package h04.onetomany;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerDelete04 {

	public static void main(String[] args) {
		
		
		Book04 book = new Book04();
		
		Student04 std = new Student04();
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book04.class)
				.addAnnotatedClass(Student04.class);
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
//		String sqlQuery ="DELETE FROM Book04";
//		
//		int numOofRowsDeleted = session.createSQLQuery(sqlQuery).executeUpdate();
		
//		System.out.println(numOofRowsDeleted);
		
//		String hqlQuery ="DELETE FROM Student04";
//		
//		int numOfDeletedRows = session.createQuery(hqlQuery).executeUpdate();
//		
//		System.out.println(numOfDeletedRows + " row silindi");
		
		
		
		std = session.get(Student04.class, 101);
		
		session.delete(std);
		
		tx.commit();
		
		
		
		
		
		
		
		

	}

}
