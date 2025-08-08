package Bookjava;
class Book{
	String title;
	String author;
	double price;
	Book(String author,String title,double price){
		this.author=author;
		this.title=title;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Author:"+author);
		System.out.println("Title:"+title);
		System.out.println("Price:"+price);
		
	}
}
class Ebook extends Book{
	double filesizeMB;
	Ebook(String author,String title,double price,double filesizeMB)/*its should have the same parameters as the parent class + the new variable that in it*/
	{
		super(author,title,price);
		this.filesizeMB=filesizeMB;	
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("File size:"+filesizeMB);
		
	}
	
}
class printBook extends Book{
	int numberofPages;
	printBook(String author,String title,double price,int numberofPages){
		super(author,title,price);//value passing using super
		this.numberofPages=numberofPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("NO of pages:"+numberofPages);
		
	}
}

public class Main_book { 
	public static void main(String[]args) {
	Ebook book1=new Ebook("abc","abc",50.0,25.0);
	book1.displayDetails();
	printBook book2 = new printBook("Def","Abc",60.0,100);
	book2.displayDetails();
	}
}
