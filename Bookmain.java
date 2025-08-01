package oops;
class Book{
	String author;
	String title;
	final int bookID;
	static int bookcounter=1000;
	static final String LIBRARY_NAME="Central Library";
	Book(){
		author="unknown";
		title="unknown";
		bookcounter++;
		bookID=bookcounter;
	}
	Book(String author,String title){
		this.author=author;
		this.title=title;
		bookcounter++;
		bookID=bookcounter;
		
	}
	public void displayinfo() {
		System.out.println("Author"+author);
		System.out.println("Title:"+title);
		System.out.println("Book ID:"+bookID);
	}
	public void displayinfo(boolean showLibrary) {
		if (showLibrary==true) {
			System.out.println("Library"+LIBRARY_NAME);
		}
	}
	public static void displayTotalbooks() {
		int bookcount=bookcounter-1000;
		System.out.println("Total books"+bookcount);
	}
}

public class Bookmain {
	public static void main(String[]args) {
	Book book1=new Book();
	Book book2=new Book();
	Book book3=new Book();
	Book book4=new Book("ABC","DEF");
	Book book5=new Book("ghi","jkl");
	Book book6=new Book("mno","pqr");
	book1.displayinfo();
	book2.displayinfo();
	book3.displayinfo();
	book4.displayinfo();
	book5.displayinfo();
	book6.displayinfo();

	Book.displayTotalbooks();
}
}
