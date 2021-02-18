
import java.util.*;
import java.io.*;

public class BookCompareTest 
{ 

	public static void main(String[] args) 
	{
		Book b1 = new Book("A", "Z"); 
		Book b2 = new Book("B", "X"); 
		Book b3 = new Book("C", "Y"); 


        // -- ------------------------------------------------------------------------------
        System.out.println("Using TreeSet without BookAuthorComparator which uses the compareTo"); 
        System.out.println(" ");

		TreeSet<Book> tree1 = new TreeSet<Book>(); 
		tree1.add(b1); 
		tree1.add(b2); 
		tree1.add(b3); 

		System.out.println(tree1); 
		System.out.println(" ");
        System.out.println(" ");
        // -- ------------------------------------------------------------------------------


        // -- ------------------------------------------------------------------------------
        System.out.println("Using TreeSet with BookAuthorComparator"); 
        System.out.println(" ");
		BookAuthorComparator bookAuthorComparator = new BookAuthorComparator(); 

		TreeSet<Book> tree2 = new TreeSet<Book>(bookAuthorComparator); 
		tree2.add(b1); 
		tree2.add(b2); 
		tree2.add(b3); 

		System.out.println(tree2); 
		// -- ------------------------------------------------------------------------------

    }
}


class Book implements Comparable 
{ 
	String title; 
	String author;

	public Book(String pTitle, String pAuthor) 
	{ 
		title = pTitle; 
		author = pAuthor;
	} 

	public int compareTo(Object b) 
	{ 
		Book book = (Book) b; 
		return (title.compareTo(book.title)); 
	} 

	public String toString() 
	{
        return "Book: "+title+" - Author: "+author;
    }
}


class BookAuthorComparator implements Comparator<Book> 
{
    public int compare(Book one, Book two) 
    { 
    	return (one.author.compareTo(two.author)); 
    } 
} 


