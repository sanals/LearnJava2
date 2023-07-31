/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.test_non_final_variables;

/**
 *
 * @author sanal.s
 */
public class TestImmutablity {

    public static void main(String[] args) {
        OuterClassA outerClassA = new OuterClassA();
        OuterClassA.InnerClassB innerClassB =  new OuterClassA.InnerClassB();
        //printing private variable
        System.out.println(innerClassB.getPrivateVariable());
        //updating private variable by passing object
        outerClassA.updatePrivateVariableInAOutsideB(innerClassB, 1);
        //printing private variable after update
        System.out.println(innerClassB.getPrivateVariable());
    }
}
