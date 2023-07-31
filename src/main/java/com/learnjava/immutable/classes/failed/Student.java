/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.classes.failed;

/**
 *
 * @author sanal.s
 */
public class Student {

    private String name;
    private int age;
    private Subject subject;

    public Student(String name, int age, Subject subject) {
        this.name = name;
        this.age = age;
        //replacing with `this.subject = new Subject(subject.getName(), subject.getBook());` will help making this class act as immutable in the ImmutableExample class
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
                //replacing with `return new Subject(subject.getName(), subject.getBook());` will help making this class act as immutable in the ImmutableExample class
        this.subject = subject;
    }
}