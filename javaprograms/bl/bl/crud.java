import java.util.List;
import java.util.Scanner;
public class crud {

	public static void main(String[] args) {
		
		BookDAO b=new BOOKdao()
while(true)
{
	System.out.println("*******************Book CRUD Operatrions*******************");
	System.out.println("1.Inser Book");
	System.out.println("2.update Book");
	System.out.println("3.Delete Book");
	System.out.println("4.show All Databases");
	System.out.println("5.Exit");
	System.out.println("eneter your choices:");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:System.out.println("enter book id,name,author and price");
	int id=sc.next();
	String name=sc.next();
	String author=sc.next();
	float price=sc.nextFloat():
		Book book2=new Book(id,name,author,price);
	dao.insertBook(book2);
		System.out.println("Book inserted.");
		break;
	case 2:
		dao.updateBook(book);
		System.out.println("book updated.");
		break;
	case 3:
		dao.deleteBook(book);
		System.out.println("book deleted.");
		break;
	case 4:
		List<Book> books=dao.listAllBooks();
		for(Book b:books) {
			System.out.println(b.getTitle()+""b.getAuthor());
	}
		break;
	case 5:System.exit(0);;
	default:System.out.println("wrong choice......");
	
	}
}
	}

}
