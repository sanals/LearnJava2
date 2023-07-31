/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mtn.momo.learnjava;

/**
 *
 * @author sanal.s
 */
public class LearnJava {

    public static void main(String[] args) {
        testArrays();
    }

    static void testArrays() {
        int a[] = new int[1];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a:" + a[i]);
        }
        int b[][] = new int[2][2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = (i + j);
            }

        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println("b:" + b[i][j]);
            }
        }
        int c[][][] = new int[3][3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    c[i][j][k] = (i + j + k);
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    System.out.println("c:" + c[i][j][k]);
                }
            }
        }
        int d[][][][] = new int[4][4][4][4];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                for (int k = 0; k < d.length; k++) {
                    for (int l = 0; l < d.length; l++) {
                        d[i][j][k][l] = (i + j + k + l);
                    }
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                for (int k = 0; k < d.length; k++) {
                    for (int l = 0; l < d.length; l++) {
                        System.out.println("d:" + d[i][j][k][l]);
                    }
                }
            }
        }

    }
}
