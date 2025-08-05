package dp.iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("80일간의 세계일주"));
		bookShelf.appendBook(new Book("BIBLE"));
		bookShelf.appendBook(new Book("신데렐라"));
		bookShelf.appendBook(new Book("장발장"));
		
		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();

	}

}
