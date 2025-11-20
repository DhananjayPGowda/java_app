package com.example;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){ 
        System.out.println("My Java application is running!");
	Scanner sc = new Scanner(System.in);
        while (true) {

	    System.out.print("Enter your something: ");
            String data = sc.nextLine();
	    System.out.println("you entered : " + data);

            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                System.out.println("Application interrupted: " + e.getMessage());
                break;
            }
        }
    }
}
