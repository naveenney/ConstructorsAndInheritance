package constructorsandinheritance;

class Book {

	private String title;
	private String isbn;
	private String author;
	private int publicationYear;

	public Book(String title, String isbn, String author, int publicationYear) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public void display()
	{
		System.out.println("BOOK TITLE:"+title+"\nISBN NUMBER:"+isbn+"\nAUTHOR:"+author+"\nPUBLICATION YEAR:"+publicationYear);
	}
}

public class Question1
{
	public static void main(String[] args)
	{
		Book book=new Book("Java","978-3-16-148410-0","James",2019);
		
		book.display();
	}
}