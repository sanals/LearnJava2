/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.learnthreads.concurrency;

/**
 *
 * @author sanal.s
 */
public class SameString extends Thread {

    public static String string = "";

    public static void string(String string) {
        SameString.string = string;
        SameString sameString = new SameString();
        sameString.start();
        //when start() is called, the "SameString.character" with its initial value 
        //say "a" is passed on to run(). But since its run in a separate thread, 
        //and since it may get delayed during the contatination, the next line may print 
        //"a", and the "SameString.character += "b";" may get executed right after this 
        //and prints then prints "ab".. Or before this is printed, the run() method 
        //gets executed and "ac" is returned, since in that thread, "ab" doesn't exist.
        //It is completely unpredictable how the value gets printed
        System.out.println(SameString.string);
        SameString.string += "b";
        System.out.println(SameString.string+"0");
        System.out.println(SameString.string);
        System.out.println(SameString.string);
        System.out.println(SameString.string);
        //A couple of sample unpredictable outputs::
        
        //a             //a
        //before run    //before run
        //ab0           //ac1
        //ab            //after run
        //ab            //ab0
        //ab            //ab
        //ab1           //ab
        //after run     //ab  
    }
    

    @Override
    public void run() {
        System.out.println("before run");
        SameString.string += "c";
        System.out.println(SameString.string+"1");
        System.out.println("after run");
    }
}
