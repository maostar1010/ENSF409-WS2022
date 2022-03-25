/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;

import java.lang.*;

public class SimpleThread implements Runnable {
    public void run() {
        System.out.println("A simple thread that doesn't do much.");
    }

    public static void main(String args[]) {
        SimpleThread obj = new SimpleThread();
        Thread t = new Thread (obj);
        t.start();
    }
}
