/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable;

/**
 *
 * @author sanal.s
 */
public class LearnImmutable {

    public static void main(String[] args) {
        checkImmutability5();
    }
    
    private static void checkImmutability5() {
        //scp = string constant pool
        String a = new String("first");//heap
        String b = new String("first");//heap
        System.out.println("a==b :: (heap==heap unequal obj)"+(a==b));
        String c = "first";//scp
        System.out.println("c==b :: (scp==heap)"+(c==b));
    }
    
    private static void checkImmutability4() {
        //scp = string constant pool
        String a = new String("first");//heap
        String b = a;//heap
        System.out.println("a==b :: (heap==heap)"+(a==b));
        String c = "first";//scp
        System.out.println("c==b :: (scp==heap)"+(c==b));
    }
    
    private static void checkImmutability3() {
        //scp = string constant pool
        String a = new String("first");//heap
        String b = a.intern();//scp
        System.out.println("a==b :: (heap==scp)"+(a==b));
        String c = "first";//scp
        System.out.println("c==b :: (scp==scp)"+(c==b));
    }

    private static void checkImmutability2() {
        String a = "first";
        Integer hashCodea = ImmutableChecker.getHashCode(a, "a");
        String b = "first";
        Integer hashCodeb = ImmutableChecker.getHashCode(b, "b");
        String c = new String("first");
        Integer hashCodec = ImmutableChecker.getHashCode(c, "c");
        String d = c;
        Integer hashCoded = ImmutableChecker.getHashCode(d, "d");

        //all will have same hashcode if the value(string) is same. hascode is calculated based on the value it contain
        
        ImmutableChecker.isSame(hashCodea, hashCodeb, "a and b");
        ImmutableChecker.isSame(hashCodea, hashCodec, "a and c");
        ImmutableChecker.isSame(hashCodec, hashCoded, "c and d");

        System.out.println("a==b        : " + (a == b));//true
        System.out.println("a.equals(b) : " + (a.equals(b)));//true
        System.out.println("a==c        : " + (a == c));//false
        System.out.println("a.equals(c) : " + (a.equals(c)));//true
        System.out.println("c==d        : " + (c == d));//true
        System.out.println("c.equals(d) : " + (c.equals(d)));//true
        checkImmutability1();
    }

    private static void checkImmutability1() {
        String first = "first";
        Integer hashCode1 = ImmutableChecker.getHashCode(first, "first");
        first += "";
        Integer hashCode2 = ImmutableChecker.getHashCode(first, "first");
        first += " ";
        Integer hashCode3 = ImmutableChecker.getHashCode(first, "first ");

        ImmutableChecker.isSame(hashCode1, hashCode2, "'first' and 'first'");
        ImmutableChecker.isSame(hashCode1, hashCode3, "'first' and 'first '");
    }
}
