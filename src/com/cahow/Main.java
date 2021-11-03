package com.cahow;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Book b1 = new Book("Java Generics", "Mike");
        Book b2 = new Book("Java Collections", "Mike");
        Book b3 = new Book("Java Collections", "Allie");

        Book b4 = new ChildrensBook("Java for Kids", "Allie", "Mike");

        List<Book> bookshelf = new ArrayList<>(Arrays.asList(b1, b2, b3));

        bookshelf.add(0, b4);
        for(int i = 0; i > bookshelf.size(); i++){
            bookshelf.get(i);
        }
        bookshelf.forEach(System.out::println);

        bookshelf.remove(b1);
        bookshelf.remove(0);
        System.out.println(bookshelf.indexOf(b1));
        System.out.println(bookshelf.indexOf(b2));
        System.out.println(bookshelf.indexOf(b3));
        System.out.println(bookshelf.indexOf(b4));

        bookshelf.set(1, b4);

        for(int i = 0; i > bookshelf.size(); i++){
            bookshelf.get(i);
        }
        bookshelf.forEach(System.out::println);

    }

}
