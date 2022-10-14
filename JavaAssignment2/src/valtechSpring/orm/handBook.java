package valtechSpring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("handbook")
public class handBook extends Book{
	private int isbn;
	private int price;
	private int pubyear;
	private int edition;
	public handBook(){}
	public handBook(int isbn, int price, int pubyear, int edition) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.pubyear = pubyear;
		this.edition = edition;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPubyear() {
		return pubyear;
	}
	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "handBook [isbn=" + isbn + ", price=" + price + ", pubyear=" + pubyear + ", edition=" + edition + "]";
	}
	
}
