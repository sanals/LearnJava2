/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.classes.success;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sanal.s
 */
public class SuccessTest {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Book book1 = new Book("Mathematics");
        Subject subject1 = new Subject("Math", book1);
        Student student1 = new Student("Alice", 20, subject1);
        map.put("student1", student1);

        Date date = new Date();
        
        ImmutableExample example = new ImmutableExample("example", date, map);
        System.out.println(example.getDateValue());
        System.out.println(example.getMapValue().get("student1").getName());
        System.out.println(example.getMapValue().get("student1").getSubject().getName());
        System.out.println(example.getMapValue().get("student1").getSubject().getBook().getTitle());
        System.out.println("");
        

        date.setTime(0);
        book1.setTitle("Biology");
        subject1.setName("Science");
        student1.setName("Bob");
        map.put("student1", student1);
        System.out.println(example.getDateValue());
        System.out.println(example.getMapValue().get("student1").getName());
        System.out.println(example.getMapValue().get("student1").getSubject().getName());
        System.out.println(example.getMapValue().get("student1").getSubject().getBook().getTitle());
    }
}
