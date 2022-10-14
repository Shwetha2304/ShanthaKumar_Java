package valtechSpring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("blog")
public class Blog extends Book{
	private String url;
	private int visitedTimes;
	public Blog(){}
	public Blog(String url, int visitedTimes) {
		super();
		this.url = url;
		this.visitedTimes = visitedTimes;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVisitedTimes() {
		return visitedTimes;
	}
	public void setVisitedTimes(int visitedTimes) {
		this.visitedTimes = visitedTimes;
	}
	@Override
	public String toString() {
		return "Blog [url=" + url + ", visitedTimes=" + visitedTimes + "]";
	}
	
}
