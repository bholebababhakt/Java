package com.example.demo.language;

public class Intializer {
    int instanceValue;
    static int staticValue;

    // Static Intializer block it get executed when first time class reference we get
    static {
        staticValue = 20;
        System.out.println("static block executed when class laoded " + staticValue);
    }

    {
        instanceValue = 20;
        staticValue = 10;
        System.out.println("instance block executed before constructor when the object is intialized " + instanceValue);
    }

    public Intializer() {
        System.out.println("constructor executed");
    }
}

/*Result
main method executed
static block executed when class laoded 20
instance block executed before constructor when the object is intialized 20
constructor executed
instance block executed before constructor when the object is intialized 20
constructor executed*/