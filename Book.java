package org.msm.lib;

public class Book {

	private String title;
	private int bookID;
	private String author;
	private String pub;
	private int price;
	private int qtyInHand;
	
	
	public Book(String title, int bookID, String author, String pub, int price, int qtyInHand) {
		super();
		this.title = title;
		this.bookID = bookID;
		this.author = author;
		this.pub = pub;
		this.price = price;
		this.qtyInHand = qtyInHand;
	}
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @return the pub
	 */
	public String getPub() {
		return pub;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @param pub the pub to set
	 */
	public void setPub(String pub) {
		this.pub = pub;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the qtyInHand
	 */
	public int getQtyInHand() {
		return qtyInHand;
	}
	/**
	 * @param qtyInHand the qtyInHand to set
	 */
	public void setQtyInHand(int qtyInHand) {
		this.qtyInHand = qtyInHand;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookID=" + bookID + ", author=" + author + ", pub=" + pub + ", price="
				+ price + ", qtyInHand=" + qtyInHand + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.bookID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.bookID==(((Book)obj).getBookID());
	}
	
	 	
}
