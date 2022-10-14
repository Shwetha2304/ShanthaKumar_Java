package valtechSpring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int phone;
	
	@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private  Set<Book> book;
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	public Set<Book> getBook() {
		return book;
	}
	
	@OneToOne(targetEntity=Address.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Address address;
	
	
	public Author(){}
	public Author(String name, int phone) {
		super();
		
		this.name = name;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
