/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class TestingIsAliveNumber extends Thread {

    public static int amount = 0;
    public static int count = 0;

    public static void waitingTest() {
        TestingIsAliveNumber testingIsAliveNumber = new TestingIsAliveNumber();
        testingIsAliveNumber.start();
        // Wait for the thread to finish
        while (testingIsAliveNumber.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
        //sample outputs
//Waiting...        //Waiting...
//Waiting...        //Main: 1
//Waiting...        //Main: 2 
//Waiting...
//Waiting...
//Waiting...
//Waiting...
//Waiting...
//Main: 1
//Main: 2        
    }

    @Override
    public void run() {
        amount++;
    }
}
