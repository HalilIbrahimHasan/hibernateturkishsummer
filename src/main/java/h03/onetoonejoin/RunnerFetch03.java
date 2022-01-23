package h03.onetoonejoin;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {

	public static void main(String[] args) {

		Student03 std = new Student03();
		Dairy dairy = new Dairy();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student03.class)
				.addAnnotatedClass(Dairy.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		std = session.get(Student03.class, 103);

		tx.commit();

//		System.out.println(std);

		// Get student name, dairy, grade and id from both tables
//		String sqlQuery = "SELECT s.student_name, d.dairy_name, s.grade, s.std_id "
//				+ "FROM Student03 s "
//				+ "INNER JOIN Dairy d "
//				+ "ON s.std_id = d.std_id";

//		List< Object[]> sqlList = session.createSQLQuery(sqlQuery).getResultList();

//		for(Object[] each : sqlList) {
//			
//			for(Object o :each ) {
//				System.out.println(o);
//			}
////			System.out.println(Arrays.toString(each));
//			
//			
//		}

//		String hqlQuery = "Select s.name , d.name, s.grade, s.std_id " + "FROM Student03 s INNER JOIN Dairy d  "
//				+ "On s.std_id = d.student ";
//
//		List<Object[]> hqlList = session.createQuery(hqlQuery).getResultList();
//
//		for (Object[] each : hqlList) {
//
//			System.out.println(Arrays.toString(each));
//
//		}

//		String sqlQuery2 = "Select s.student_name, s.std_id, s.grade, d.dairy_name " + "FROM Student03 s "
//				+ "FULL JOIN Dairy d " + "ON s.std_id = d.std_id";
//
//		List<Object[]> sqlList2 = session.createSQLQuery(sqlQuery2).getResultList();
//
//		for (Object[] each : sqlList2) {
//
//			System.out.println(Arrays.toString(each));
//
//		}

//		String hqlQuery2 = "Select s.name, s.std_id, s.grade, d.name " + "FROM Student03 s "
//				+ "FULL JOIN Dairy d " + "ON s.std_id = d.student";
//
//		List<Object[]> hqlList2 = session.createQuery(hqlQuery2).getResultList();
//		
//		for(Object[] each:hqlList2 ) {
//			System.out.println(Arrays.toString(each));
//		}

		// Tum datalari aliniz
//		String sqlQuery3 = "SELECT s.student_name, s.grade, s.std_id, d.dairy_id, d.dairy_name"
//				+ " FROM Student03 s FULL JOIN Dairy d ON s.std_id = d.std_id";
//
//		List<Object[]> sqlList3 = session.createSQLQuery(sqlQuery3).getResultList();
//
//		for (Object[] each : sqlList3) {
//			System.out.println(Arrays.toString(each));
//		}

		String hqlQuery3 = "FROM Student03 s FULL JOIN Dairy d ON s.std_id = d.student";

		List<Object[]> hqlList3 = session.createQuery(hqlQuery3).getResultList();

		for (Object[] each : hqlList3) {
			System.out.println(Arrays.toString(each));
		}

	}

}
