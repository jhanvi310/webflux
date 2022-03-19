package model;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Data{
	
	
	    public String title;
	    public String type;
	    public ArrayList<String> items;
	    
	

	public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public ArrayList<String> getItems() {
			return items;
		}

		public void setItems(ArrayList<String> items) {
			this.items = items;
		}

	public class Slideshow{
	    public String author;
	    public String date;
	    public ArrayList<Data> slides;
	    public String title;
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public ArrayList<Data> getSlides() {
			return slides;
		}
		public void setSlides(ArrayList<Data> slides) {
			this.slides = slides;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "slidshow [author=" + author + ", date=" + date + ", slides=" + slides + "]";
		}
	}

	
}
