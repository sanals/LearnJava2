/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.inheritance;

/**
 *
 * @author sanal.s
 */
public class ExtendThreadAndOverrideRunAndStart extends Thread {

    @Override
    public void run() {
        System.out.println("ExtendThreadAndOverrideRunAndStart run");
    }
    
    @Override
    public void start(){
        System.out.println("ExtendThreadAndOverrideRunAndStart start");
    }
}
