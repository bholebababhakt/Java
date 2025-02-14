package com.example.demo.language;

public class Main {
    // javac -d classes .\src\main\java\com\example\demo\mainmethod\Main.java
    // java -cp classes com.example.demo.mainmethod.Main hello nitin
    static int test2 =0;
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("hello world");
        var test =0;
        System.out.println(test + " "+test2);
    }
}
