package org.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        // The Client
        LibraryBookCatalog catalog = new LibraryBookCatalog();

        // Populate the catalog
        catalog.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
        catalog.addBook(new Book("1984", "George Orwell"));
        catalog.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        Iterator<Book> iterator = catalog.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
