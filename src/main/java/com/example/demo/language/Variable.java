package com.example.demo.language;

public class Variable {
    // Primitive Data Types
    byte myByte = 10;
    short myShort = 100;
    int myInt = 1000;
    long myLong = 10000L;
    float myFloat = 10.5f;
    double myDouble = 20.5;
    char myChar = 'A';
    boolean myBoolean = true;

    // Wrapper Classes (Object types)
    Byte myByteObj = 10;
    Short myShortObj = 100;
    Integer myIntObj = 1000;
    Long myLongObj = 10000L;
    Float myFloatObj = 10.5f;
    Double myDoubleObj = 20.5;
    Character myCharObj = 'A';
    Boolean myBooleanObj = true;

    // Non-static and static variables
    String nonStatic = "nonStatic";
    static String staticVariable = "staticVariable";

    static void printVariable(String parameter) {
/*
        Java 10 introduced local-variable type inference using the var keyword, which allows
        the compiler to infer the type of the variable based on the value assigned to it.
*/
//        var tenp = parameter;
//        String test = "local var";
//        var test2 = test;
        var localVariable = "localVariable"; // Using var for local variable only in methods
        System.out.println("Parameter: " + parameter);
        System.out.println("Local Variable: " + localVariable);
    }

    void printAll() {
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        System.out.println("\nWrapper Classes (Object Types):");
        System.out.println("Byte: " + myByteObj);
        System.out.println("Short: " + myShortObj);
        System.out.println("Integer: " + myIntObj);
        System.out.println("Long: " + myLongObj);
        System.out.println("Float: " + myFloatObj);
        System.out.println("Double: " + myDoubleObj);
        System.out.println("Character: " + myCharObj);
        System.out.println("Boolean: " + myBooleanObj);

        System.out.println("\nNon-static Variable: " + nonStatic);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        printVariable("parameterValue");

        Variable variable = new Variable();
        variable.printAll();
    }
}
