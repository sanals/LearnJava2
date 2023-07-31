/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.classes.failed;


/**
 *
 * @author sanal.s
 */
public class Subject {

    private String name;
    private Book book;

    public Subject(String name, Book book) {
        this.name = name;
        //replacing with `this.book = new Book(book.getTitle());` will help making this class act as immutable in the ImmutableExample class
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        //replacing with `return new Book(book.getTitle());` will help making this class act as immutable in the ImmutableExample class
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
