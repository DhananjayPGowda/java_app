package com.example;


public class HelloWorld {
    public static void main(String[] args){ 
        System.out.println("My Java application is running!");
        while (true) {
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                System.out.println("Application interrupted: " + e.getMessage());
                break;
            }
        }
    }
}
