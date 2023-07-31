/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class LoopTest_i extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 1");
        System.out.println("i in Thread 1 ");
        for (int i = 1; i <= 50; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(50);
                System.out.println("Thread slept 0: "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 Completed.");
    }
}
