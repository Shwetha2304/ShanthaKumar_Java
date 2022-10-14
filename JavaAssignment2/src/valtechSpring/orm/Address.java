package valtechSpring.orm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	
	@OneToOne(targetEntity=Publisher.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Publisher publisher;
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@OneToOne(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private Author author;
	
	
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Address() {}

	public Address( String street, String city, String state, int zipcode) {
		super();
	
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}
	
	
}
