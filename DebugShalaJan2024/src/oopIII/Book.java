package oopIII;

public class Book {
	
	int bookid;//instance data member , primitive dm
	String title;//refrence variable
	Publisher publisher;//refrence variable 
	
	
	public Book() {
		
	}


	public Book(int bookid, String title, Publisher publisher) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.publisher = publisher;
	}

	//
	public Book(int bookid, String title,int pubid , String pub_name , String pub_loc) {
		
		this.bookid = bookid;
		this.title = title;
		this.publisher = new Publisher(pubid , pub_name , pub_loc);
	}

	//method
	public void display()
	{
		System.out.println("Book id: "+bookid);
		System.out.println("Book Title: "+title);
		publisher.display();
	}
	
	
}
