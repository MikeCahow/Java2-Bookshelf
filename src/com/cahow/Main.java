package com.cahow;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        
        Book b1 = new Book("Java Generics", "Mike");
        Book b2 = new Book("Java Collections", "Mike");
        Book b3 = new Book("Java Collections", "Allie");
    }
    Book b4 = new ChildrensBook("Java for Kids", "Allie", "Mike");
}
