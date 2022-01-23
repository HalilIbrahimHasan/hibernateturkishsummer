package h04.onetomany;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import h03.onetoonejoin.Dairy;

@Entity
public class Student04 {
	
	
	
	@Id
	private int std_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	
	@OneToMany(mappedBy="student")
	private List<Book04> bookList = new ArrayList();
	
	
	public Student04() {
	
	}


	public Student04(int std_id, String name, int grade) {
		
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
	}


	public Student04(int std_id, String name, int grade, List<Book04> bookList) {
		
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


	public List<Book04> getBookList() {
		return bookList;
	}


	public void setBookList(List<Book04> bookList) {
		this.bookList = bookList;
	}


	@Override
	public String toString() {
		return "Student04 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", bookList=" + bookList + "]";
	}


	
	
	
	
	
	

}
