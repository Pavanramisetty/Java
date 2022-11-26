package com.fdmgroup.bookstore.model;

public class Book{
   private int itemID;
   private double price;
   private String title;
   private String author;
   private BookGenere bookGenere;

   public Book(int itemID, double price, String title, String author, BookGenere bookgenere) {
		super();
		this.itemID = itemID;
		this.price = price;
		this.title = title;
		this.author = author;
		this.bookGenere = bookgenere;
   }
    public Book() {
	super();
   }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookGenere == null) ? 0 : bookGenere.hashCode());
		result = prime * result + itemID;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookGenere != other.bookGenere)
			return false;
		if (itemID != other.itemID)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
		public int getItemID() {
			return itemID;
		}
		
		
		public void setItemID(int itemID) {
			this.itemID = itemID;
		}
		
		
		public double getPrice() {
			return price;
		}
		
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public String getTitle() {
			return title;
		}
		
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		
		public String getAuthor() {
			return author;
		}
		
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		
		public BookGenere getBookgenere() {
			return bookGenere;
		}
		
		
		public void setBookgenere(BookGenere bookgenere) {
			this.bookGenere = bookgenere;
		}

		@Override
		public String toString() {
			return "Book [itemID=" + itemID + ", price=" + price + ", title=" + title + ", author=" + author
					+ ", bookGenere=" + bookGenere + "]";
		}
}
