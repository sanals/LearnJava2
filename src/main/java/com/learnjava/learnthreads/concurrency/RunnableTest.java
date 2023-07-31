/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class RunnableTest implements Runnable {

    String name;
    Thread thread;

    public RunnableTest(String name) {
        this.name = name;
        thread = new Thread(this, name);
        //(name, prioriry, group)
        System.out.println("A New thread: " + thread + "is created\n");
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int j = 5; j > 0; j--) {
                System.out.println(name + ": " + j);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " thread Interrupted");
        }
        System.out.println(name + " thread exiting.");
    }
}
