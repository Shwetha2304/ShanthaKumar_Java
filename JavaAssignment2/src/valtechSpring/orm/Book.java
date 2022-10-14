package valtechSpring.orm;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="allBooks")
@DiscriminatorColumn(name="booklist")
@DiscriminatorValue("book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private Date published;
	
	@ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(name="book_author",joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="author_id",referencedColumnName="id"))
	private Set<Author> author;
	public Set<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	
	@ManyToOne(targetEntity=Publisher.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinColumn(name="publisher_id",referencedColumnName="id")
	private Set<Publisher> publisher;
	public Set<Publisher> getPublisher() {
		return publisher;
	}
	public void setPublisher(Set<Publisher> publisher) {
		this.publisher = publisher;
	}
	
	
	
	
	public Book(){}

	public Book(String name, Date published) {
		super();
		
		this.name = name;
		this.published = published;
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

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", published=" + published + "]";
	}
	
	
	
	
}
