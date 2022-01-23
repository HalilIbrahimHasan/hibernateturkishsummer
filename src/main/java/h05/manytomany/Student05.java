package h05.manytomany;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Student05 {
	
	
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Student05_Book05",joinColumns = {@JoinColumn(name="std_id")},inverseJoinColumns = {@JoinColumn(name="book_id")})
	private List <Book05> bookList = new ArrayList();
	
	
	public Student05() {
		
	}
	
	public Student05(int std_id, String name, int grade, List<Book05> bookList) {
		
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
		this.bookList = bookList;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<Book05> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book05> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Student05 [std_id=" + std_id + ", name=" + name + ", grade=" + grade;
	}
	
	
	
	
	

}
