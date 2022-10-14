package valtechSpring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	
	private int phonenumber;

	
	@OneToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="publisher")
	private Set<Book> book;
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
	@OneToOne(targetEntity=Address.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Publisher(){}
	public Publisher( String name, int phonenumber) {
		super();
		
		this.name = name;
		this.phonenumber = phonenumber;
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
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	
	
}
