/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class JoinTest implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Current thread in run: "
                + t.getName());

        // checks if current thread is alive
        System.out.println("Is Alive in run? " + t.isAlive());
    }

    public static void main(String args[]) throws Exception {
        Thread t = new Thread(new JoinTest());
        t.start();

        // Waits for 1000ms this thread to die.
        t.join(1000);

        //Using text block (java 14 and above)
        System.out.println("""
                           
                           Joining after 1000 milliseconds: 
                           """);
        System.out.println("");
        System.out.println("Current thread in main: "
                + t.getName());

        // Checks if this thread is alive
        System.out.println("Is alive in main? " + t.isAlive());
    }
}
