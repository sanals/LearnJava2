/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class TestingIsAliveString extends Thread {

    public static String string = "";
    public static int count = 0;

    public static void waitingTest(String string) {
        SameString.string = string;
        TestingIsAliveString testingIsAliveString = new TestingIsAliveString();
        testingIsAliveString.start();
        // Wait for the thread to finish
        while (testingIsAliveString.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(SameString.string);
        SameString.string += "b";
        System.out.println(SameString.string+"0");
        System.out.println(SameString.string);
        System.out.println(SameString.string);
        System.out.println(SameString.string);
        //sample outputs
        //Waiting...
        //.
        //.
        //.
        //Waiting...
        //before run
        //Waiting...
        //.
        //.
        //.
        //Waiting...
        //ac1
        //after run
        //Waiting...
        //ac
        //acb0
        //acb
        //acb
        //acb        
    }

    @Override
    public void run() {
        System.out.println("before run");
        SameString.string += "c";
        System.out.println(SameString.string+"1");
        System.out.println("after run");
    }
}
