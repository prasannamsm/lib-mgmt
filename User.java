package org.msm.lib;
public class User {

	private String name;
	private int userId;
	private String address;
	private String mail;
	private String contactNum;
	private int noOfBooksInHand;
	private int maxLimitOfBooks;
	
	
	
	/**
	 * @param name
	 * @param userId
	 * @param address
	 * @param mail
	 * @param contactNum
	 * @param noOfBooksInHand
	 */
	public User(String name, int userId, String address, String mail, String contactNum, int noOfBooksInHand) {
		super();
		this.name = name;
		this.userId = userId;
		this.address = address;
		this.mail = mail;
		this.contactNum = contactNum;
		this.noOfBooksInHand = noOfBooksInHand;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @return the contactNum
	 */
	public String getContactNum() {
		return contactNum;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	/**
	 * @return the noOfBooksInHand
	 */
	public int getNoOfBooksInHand() {
		return noOfBooksInHand;
	}
	/**
	 * @param noOfBooksInHand the noOfBooksInHand to set
	 */
	public void setNoOfBooksInHand(int noOfBooksInHand) {
		this.noOfBooksInHand = noOfBooksInHand;
	}
	/**
	 * @return the maxLimitOfBooks
	 */
	public int getMaxLimitOfBooks() {
		return maxLimitOfBooks;
	}
	/**
	 * @param maxLimitOfBooks the maxLimitOfBooks to set
	 */
	public void setMaxLimitOfBooks(int maxLimitOfBooks) {
		this.maxLimitOfBooks = maxLimitOfBooks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + ", address=" + address + ", mail=" + mail + ", contactNum="
				+ contactNum + ", noOfBooksInHand=" + noOfBooksInHand + ", maxLimitOfBooks=" + maxLimitOfBooks + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getUserId();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.userId == ((User)obj).getUserId() ;
	}
	
	
	
}
