package org.msm.lib;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementService {
	static List<Book> books = new ArrayList<Book>();
	static List<User> users = new ArrayList<User>();
	static Map<User, List<Book>> borrowings
	= new HashMap<User, List<Book>>();
	static Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Library Management System");
		System.out.println("Press 1 to add Book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to Add User");
		System.out.println("Press 5 to Limit the number of Books");
		System.out.println("Press 6 to Search a Book by its title/author");
		System.out.println("Press 7 to Search a user by name");
		System.out.println("Press 6 to exit");
		int choice = c.nextInt();
		do {
			switch (choice) {
			case 1:
				addBookToLib();
				break;
			case 2:
				lendBooktoUser();
				break;
			case 3:
				returnBookToLib();
				break;
			case 4:
				addUser();
				break;
			case 5:
				limitTheNumberOfBooksForUser();
				break;
			case 6:
				searchBookByTitle();
				break;
			case 7:
				searchBookByAuthor();
				break;
			case 8:
				searchUser();
				break;
			case 11:
				System.out.println("Thank  You");
				System.exit(0);
			case 9:
				printBookList();
			case 10:
				printUserList();
				
			default:
				System.out.println("Invalid input");
				break;
			}
			choice = c.nextInt();
		} while (choice > 0 && choice < 11);
	}
	private static void searchUser() {
		// TODO Auto-generated method stub
		
	}
	private static void searchBookByAuthor() {
		System.out.println("----------------Search Book-------");
		
	}
	private static void searchBookByTitle() {
		System.out.println("----------------Search Book By Title -------");
		
	}
	private static void limitTheNumberOfBooksForUser() {
		System.out.println("----------------limitTheNumberOfBooksForUser-------");		
		System.out.println("----------------Provide the User Id: -------");
		int userIdToLend = c.nextInt();
		System.out.println("----------------Provide the limit : -------");
		int maxLimit = c.nextInt();
		User userToLend = null;
		for(User u : users){
	        if(u.getUserId() ==userIdToLend) {
	        	userToLend = u;
	        	break;
	        }
	    }
		if(userToLend==null) {
			System.out.println("----------------User not found -------");
			return;
		}
		userToLend.setMaxLimitOfBooks(maxLimit);
	}
	private static void addUser() {
		System.out.println("----------------Add a User  to Lib-------Input the below details:");
		System.out.println("User name:" );
		String name = c.next();
		System.out.println("mail:" );
		String mail = c.next();
		System.out.println("User ID:" );
		int id = c.nextInt();
		System.out.println("Max Limit:" );
		int qty  = c.nextInt();
		User user = new User(name, id, "", mail, "1122", 0);
		user.setMaxLimitOfBooks(qty);
		users.add(user);
		
		
	}
	private static void returnBookToLib() {
		System.out.println("----------------Return the book  -------");
		
	}
	private static void lendBooktoUser() {
		System.out.println("----------------Provide book  Id: -------");
		int bookdIdToLend = c.nextInt();
		Book bookFound = null;
		for(Book b : books){
	        if(b.getBookID()==bookdIdToLend) {
	        	bookFound = b;
	        	break;
	        }
	    }
		if(bookFound==null) {
			System.out.println("----------------Book  not found -------");
			return;
		}
		System.out.println("----------------Provide the User Id: -------");
		int userIdToLend = c.nextInt();
		User userToLend = null;
		for(User u : users){
	        if(u.getUserId() ==userIdToLend) {
	        	userToLend = u;
	        	break;
	        }
	    }
		if(userToLend==null) {
			System.out.println("----------------User not found -------");
			return;
		}
		if(bookFound.getQtyInHand()==0) {
			System.out.println("----------------Books out of stock. Can't lend any more copies of this book  to any user -------");
			return;
		}
		if(userToLend.getNoOfBooksInHand()==userToLend.getMaxLimitOfBooks()) {
			System.out.println("----------------User reached max borrowings. Can't lend any more books to user -------");
			return;
		}
		List<Book> books = borrowings.get(userToLend);
		if(books.isEmpty()) {
			books = new ArrayList<Book>();
		}
		books.add(bookFound);
		bookFound.setQtyInHand(bookFound.getQtyInHand() - 1);
		
	}
	private static void addBookToLib() {
		System.out.println("----------------Add a book  to Lib-------Input the below details:");
		System.out.println("Title:" );
		String title = c.next();
		System.out.println("Author:" );
		String author = c.next();
		System.out.println("Book ID:" );
		int id = c.nextInt();
		System.out.println("Qty In hand:" );
		int qty  = c.nextInt();
		System.out.println("Publication:" );
		String pub = c.next();
		System.out.println("Price:" );
		int  price = c.nextInt();
		Book bookFound = null;
		for(Book b : books){
	        if(b.getBookID()==id) {
	        	bookFound = b;
	        	break;
	        }
	    }
		if(bookFound!=null) {
			System.out.println("----------------Book with similar ID found in Library.. Thus adding to the stock...");
			bookFound.setQtyInHand(bookFound.getQtyInHand() + 1);
		} else {
			System.out.println("----------------Book with similar ID not found in Library.. Thus adding the new title to the library...");
			books.add(new Book(title, id, author, pub, price, qty));
		}
	}
	
	private static void printBookList() {
		for(Book book:books) {
			System.out.println("--------------------------");
			System.out.println(book);
		}
	}
	private static void printUserList() {
		for(User user:users) {
			System.out.println("--------------------------");
			System.out.println(user); 
		}
	}	
	}
