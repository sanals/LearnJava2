package com.learnjava.learnthreads;

import com.learnjava.learnthreads.concurrency.RunnableTest;
import com.learnjava.learnthreads.concurrency.TestingIsAliveString;
import com.learnjava.learnthreads.inheritance.ExtendThread;
import com.learnjava.learnthreads.inheritance.NotThread;
import com.learnjava.learnthreads.inheritance.ImplementThread;
import com.learnjava.learnthreads.inheritance.ExtendThreadAndOverrideRunAndStart;
import com.learnjava.learnthreads.inheritance.ExtendThreadAndOverrideRun;

/**
 *
 * @author sanal.s
 */
public class LearnThreads {

    public static void main(String[] args) {
        LearnThreads learnThreads = new LearnThreads();
        learnThreads.runnableTest();
    }

    public void runnableTest(){
        new RunnableTest("1st");
        new RunnableTest("2nd");
        new RunnableTest("3rd");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException excetion) {
            System.out.println("Inturruption occurs in Main Thread");
        }
        System.out.println("We are exiting from Main Thread");
    }
    
    public void testConcurrency(){
//        SameNumber.numbder(1);
//        SameString.string("a");
        TestingIsAliveString.waitingTest("a");
    }
            
    public void testEachRunMethods() {
        NotThread notThread = new NotThread();
//        notThread.run();//compilation error

        ExtendThread extendThread = new ExtendThread();
        System.out.println("before ExtendThread");
        extendThread.start();
        System.out.println("after ExtendThread");
        Thread extendThread_thread = new Thread(extendThread);
        extendThread_thread.start();

        ExtendThreadAndOverrideRun extendThreadAndOverrideRun = new ExtendThreadAndOverrideRun();
        extendThreadAndOverrideRun.start();

        ExtendThreadAndOverrideRunAndStart extendThreadAndOverrideRunAndStart = new ExtendThreadAndOverrideRunAndStart();
        extendThreadAndOverrideRunAndStart.start();
        
        ImplementThread implementThread = new ImplementThread();
        implementThread.run();
        Thread implementThread_thread = new Thread(implementThread);
        implementThread_thread.start();

    }
}
