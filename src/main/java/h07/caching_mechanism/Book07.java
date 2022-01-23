package h07.caching_mechanism;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
//@Cacheable
//@Cache(region = "Book07", usage = CacheConcurrencyStrategy.READ_WRITE)
public class Book07 {

	
	
	@Id
	private int book_id;
	private String book_name;
	
	@ManyToOne
	@JoinColumn(name="std_id")  
	private Student07 student;

	public Book07() {
		
	}

	public Book07(int book_id, String book_name) {
		
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

	public Student07 getStudent() {
		return student;
	}

	public void setStudent(Student07 student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Book06 [book_id=" + book_id + ", book_name=" + book_name + "]";
	}
	
	
}
