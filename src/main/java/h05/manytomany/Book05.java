package h05.manytomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book05 {

	@Id
	private int book_id;
	private String book_name;
	@ManyToMany(mappedBy="bookList")
	private List<Student05> studentList = new ArrayList();
	
	public Book05() {
		
	}

	public Book05(int book_id, String book_name) {
		
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

	public List<Student05> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student05> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Book05 [book_id=" + book_id + ", book_name=" + book_name + ", studentList=" + studentList + "]";
	}

	
	
	
	
}
