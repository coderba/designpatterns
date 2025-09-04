package org.designpatterns.behavioral.iterator;

import java.util.Iterator;

// Aggregate Interface
public interface BookCatalog {
    Iterator<Book> createIterator();
}
