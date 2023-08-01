/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.designpattern.singleton;

/**
 *
 * @author sanal.s
 */
public class SingletonEagerInitialization {

    // Private static instance variable
    // Eager initialization: create the instance even if not used
    //It is thread safe, beacause the Singleton instance is created when the class is loaded
    //This is because the Singleton instance is created when the class is initialized by the Java runtime, which happens before any threads can access it.
    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    // Private constructor to prevent external instantiation
    private SingletonEagerInitialization() {
        // Initialization, if needed
    }

    // Public static method to get the instance
    public static SingletonEagerInitialization getInstance() {
        return instance;
    }

    // Other methods and properties of the SingletonEagerInitialization class (if any)
    public void showMessage() {
        System.out.println("Hello, I am a SingletonEagerInitialization!");
    }
}
