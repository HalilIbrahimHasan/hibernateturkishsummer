package h04.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book04 {
	
	@Id
	private int book_id;
	private String book_name;
	
	@ManyToOne
	@JoinColumn(name="std_id")  
	private Student04 student;

	public Book04() {
		
	}

	public Book04(int book_id, String book_name) {
		
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

	public Student04 getStudent() {
		return student;
	}

	public void setStudent(Student04 student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Book04 [book_id=" + book_id + ", book_name=" + book_name + ", student=" + student + "]";
	}
	
	
	
	
	

}
