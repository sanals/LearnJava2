/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.designpattern.singleton;

/**
 *
 * @author sanal.s
 */
public class SingletonLazyInitialization {

    // Private static instance variable
    private static SingletonLazyInitialization instance;

    // Private constructor to prevent external instantiation
    private SingletonLazyInitialization() {
        // Initialization, if needed
    }

    // Public static method to get the instance
    public static SingletonLazyInitialization getInstance() {
        // Lazy initialization: create the instance only when needed
        // Lazy initialization is not thread safe
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

    // Other methods and properties of the SingletonLazyInitialization class (if any)
    public void showMessage() {
        System.out.println("Hello, I am a SingletonLazyInitialization!");
    }
}
