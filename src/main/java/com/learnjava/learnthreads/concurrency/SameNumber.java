/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class SameNumber extends Thread {

    public static int number = 0;

    public static void numbder(int numbder) {
        SameNumber.number = numbder;
        SameNumber sameNumber = new SameNumber();
        sameNumber.start();
        System.out.println(SameNumber.number);
        SameNumber.number++;
        System.out.println(SameNumber.number);
    }

    @Override
    public void run() {
        SameNumber.number++;
    }
}
