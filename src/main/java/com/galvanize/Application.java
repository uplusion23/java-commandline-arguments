package com.galvanize;

public class Application {
    public static void main(String[] args) {
        System.out.printf("%s <%s>", args[0].replaceAll("\"", ""), args[1]);
    }
}
