/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtn.momo.learnjava;

/**
 *
 * @author sanal.s
 */
public class DefatulValues {
    public static void main(String[] args) {
        
    }
    static String as;
    static Integer ai;
    
    static String[] asArray;
    
    static void testString(){
        System.out.println("as: "+as);
        String bs;
//        System.out.println("bs: "+bs);//compilation error
    }
    static void testInteger(){
        System.out.println("ai: "+ai);
        Integer bi = new Integer(1);
//        System.out.println("bi: "+bi);//compilation error
    }
    static void testStringArray(){
        System.out.println("asArray: "+asArray);
        String[] bsArray;
//        System.out.println("bsArray: "+bsArray);//compilation error
    }
}
