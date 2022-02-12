/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.ensf409;
// Names used in this exercise are arbitrary but alphabetical. A for the first class, etc.
// Classes are named after animals and interfaces are named after vegetables.

interface InterfaceBeet extends InterfaceAsparagus {
    // public, static, and final
    String THE_STRING = "THE_STRING(InterfaceBeet)";

    // public
    default String defaultMethod() {
        return "defaultMethod(InterfaceBeet)";
    }

    // public
    default String abstractMethod() {
        return "abstractMethod(InterfaceBeet)";
    }
}
