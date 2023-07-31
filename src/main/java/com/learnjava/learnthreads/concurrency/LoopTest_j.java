/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class LoopTest_j extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 2");
        System.out.println("j in Thread 2 ");
        for (int j = 1; j <= 50; j++) {
            System.out.println("j = " + j);
        }
        System.out.println("Thread 2 Completed.");
    }
}
