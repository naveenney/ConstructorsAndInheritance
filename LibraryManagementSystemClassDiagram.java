package constructorsandinheritance;

import java.util.List;

class LibraryManagementSystem {
	String userType;
	String userName;
	String password;
	List<User> userList;
	Librarian librarian;

	public void logIn() {

	}

	public void register() {

	}

	public void logOut() {

	}

}

class User {
	String name;
	int id;
	List<Book> bookList;
	Account account;

	public void verify() {

	}

	public void checkAccount() {

	}

	public void getBooksInfo() {

	}
}

class Staff extends User {
	String dept;
}

class Student extends User {
	int Class;
}

class Account {
	int noBorrowedBooks;
	int noReservedBooks;
	int noReturedBooks;
	int noOfLostBooks;
	int fineAmount;
	User user;

	public void calculateFine() {

	}

}

class Book {
	String title;
	String author;
	String isbn;
	int publication;
	List<User> userList;

	public void showDueDate() {

	}

	public void reservationStatus() {

	}

	public void feedback() {

	}

	public void bookRequest() {

	}

	public void renWinfo() {

	}
}

class Librarian {
	String name;
	int id;
	String password;
	String searchString;
	List<Book> bookList;
	Librarian librarian;

	public void verifyLibrarian() {

	}

	public void search() {

	}
}

class LibraryDatabase {
	List<Book> bookList;

	List<Account> accountList;

	public void add() {

	}

	public void delete() {

	}

	public void update() {

	}

	public void display() {

	}

	public void search() {

	}
}

