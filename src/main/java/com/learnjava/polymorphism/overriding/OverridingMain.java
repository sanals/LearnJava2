/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.polymorphism.overriding;

/**
 *
 * @author sanal.s
 */
public class OverridingMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();//prints ainmal

        Dog dog = new Dog();
        dog.eat();//prints dog
        dog.bark();//prints barking
        
        Animal animal1 = new Dog();
        animal1.eat();//prints dog
	//animal1.bark();//not allowed because bark() is only present in Dog class
	//Dog dog2 = new Animal();//not allowed because "incompatible types: Animal cannot be converted to Dog"
    }
}
