/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanal.s
 */
public class LoopTest {

    public static void main(String[] args) {
        // life cycle of Thread  
        // Thread's New State  
        LoopTest_i loopTest_i = new LoopTest_i();
        LoopTest_j loopTest_j = new LoopTest_j();
        // Both the above threads are in runnable state  
        // Running state of Thread1 and Thread2  
        loopTest_i.start();
        try {
            // Move control to another thread
            loopTest_j.sleep(50);
            System.out.println("loopTest_j slept 1");
        } catch (InterruptedException ex) {
            Logger.getLogger(LoopTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Blocked State Thread1  
        try {
            loopTest_i.sleep(50);
            System.out.println("loopTest_i slept 2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loopTest_j.start();
        System.out.println("Main Thread End");
    }
}
