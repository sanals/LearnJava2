/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.designpattern.singleton;

/**
 *
 * @author sanal.s
 */
public class SingletonLazyInitializationThreadSafe {
    private static volatile SingletonLazyInitializationThreadSafe instance;

    private SingletonLazyInitializationThreadSafe() {
        // Initialization, if needed
    }

    public static SingletonLazyInitializationThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyInitializationThreadSafe.class) {
                //"double-checked locking" by checking if (instance == null) on each case
                //Makes sure instance is only created if it does not exist, and multiple threads attempting to create the instance simultaneously do not interfere with each other.
                if (instance == null) {
                    instance = new SingletonLazyInitializationThreadSafe();
                }
            }
        }
        return instance;
    }

    // Other methods and properties of the Singleton class (if any)
    public void showMessage() {
        System.out.println("Hello, I am a thread-safe Singleton!");
    }
}

