/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable;

/**
 *
 * @author sanal.s
 */
public class ImmutableChecker {

    public static Integer getHashCode(Object object, String value) {
        System.out.println("hashCode for value '" + value + "': " + object.hashCode());
        return object.hashCode();
    }

    public static boolean isSame(Integer hashCode1, Integer hashCode2, String values) {
        if (hashCode1.equals(hashCode2)) {
            System.out.println(values+" isSame");
            return true;
        } else {
            System.out.println(values+" notSame");
            return false;
        }
    }

//    public static boolean isSame(Object object1, Object object2) {
//        return getHashCode(object1, "object1").equals(getHashCode(object2, "object2"));
//    }
}
