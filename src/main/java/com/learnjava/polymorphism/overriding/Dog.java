/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.polymorphism.overriding;

/**
 *
 * @author sanal.s
 */
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void bark() {
        System.out.println("Dog is barking");
    }
}
