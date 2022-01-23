package h06.lazy_fetch_eager_fetch;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Book06 {

	
	
	@Id
	private int book_id;
	private String book_name;
	
	@ManyToOne
	@JoinColumn(name="std_id")  
	private Student06 student;

	public Book06() {
		
	}

	public Book06(int book_id, String book_name) {
		
		this.book_id = book_id;
		this.book_name = book_name;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public Student06 getStudent() {
		return student;
	}

	public void setStudent(Student06 student) {
		this.student = student;
	}
}
