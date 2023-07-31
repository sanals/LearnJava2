/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.test_non_final_variables;

/**
 *
 * @author sanal.s
 */
public class OuterClassA {

    static class InnerClassB {

        //a variable needs to be final, otherwise it can be updated using methods as shown using updatePrivateVariable..() method
        private int privateVariable = 0;

        static class InnerClassD {

            public void updatePrivateVariableInDInB(InnerClassB innerClassB, int aVariable) {
                innerClassB.privateVariable = aVariable; // this line compiles making it mutable
            }
        }

        public int getPrivateVariable() {
            return privateVariable;
        }

    }

    public void updatePrivateVariableInAOutsideB(InnerClassB innerClassB, int aVariable) {
        innerClassB.privateVariable = aVariable; // this line compiles making it mutable
    }

    static class InnerClassC {

        public void updatePrivateVariableInCOutsideB(InnerClassB innerClassB, int aVariable) {
            innerClassB.privateVariable = aVariable; // this line compiles making it mutable
        }
    }
}
