package library;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class Main {
	public static void main(String[] args) {
		Book b1=new Book("Alchemist","Paul Coelho","987654321");
		Member m1=new Member("Madhu",101);
		Transaction t1=new Transaction(m1,b1);
		t1.issueBook();
		t1.issueBook();
		//t1.returnBook();
		b1.borrowBook();
	}
}
