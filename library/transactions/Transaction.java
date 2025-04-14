package library.transactions;
import library.books.Book;
import library.members.Member;
import java.util.Date;

public class Transaction {
	 private Member member;
	    private Book book;
	    private Date date;

	    public Transaction(Member member, Book book) {
	        this.member = member;
	        this.book = book;
	        this.date = new Date();
	    }

	    public void issueBook() {
	        if (book.isAvailable()) {
	            book.borrowBook();
	            System.out.println(member.getName() + " borrowed \"" + book.getTitle() + "\" on " + date);
	        } else {
	            System.out.println("Sorry, the book is not available.");
	        }
	    }

	    public void returnBook() {
	        book.returnBook();
	        System.out.println(member.getName() + " returned \"" + book.getTitle() + "\" on " + new Date());
	    }
}
