/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.classes.failed;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sanal.s
 */
public class FailedTest {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Book book1 = new Book("Mathematics");
        Subject subject1 = new Subject("Math", book1);
        Student student1 = new Student("Alice", 20, subject1);
        map.put("student1", student1);

        Date date = new Date();
        
        ImmutableExample example = new ImmutableExample("example", date, map);
        System.out.println(example.getDateValue());
        System.out.println(example.getMapValue().get("student1").getName()); // Output: Alice
        System.out.println(example.getMapValue().get("student1").getSubject().getName()); // Output: Math
        System.out.println(example.getMapValue().get("student1").getSubject().getBook().getTitle()); // Output: Mathematics

        System.out.println("");
        date.setTime(0);
        System.out.println(example.getDateValue());
        student1.setName("Bob");
        System.out.println(example.getMapValue().get("student1").getName()); // Output: Alice
        subject1.setName("Science");
        System.out.println(example.getMapValue().get("student1").getSubject().getName()); // Output: Science
        book1.setTitle("Biology");
        System.out.println(example.getMapValue().get("student1").getSubject().getBook().getTitle()); // Output: Mathematics
    }
}
