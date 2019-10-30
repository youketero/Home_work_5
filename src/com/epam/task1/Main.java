package com.epam.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Book[] book ={new Book(1,"War and peace","Tolstoy","Idn",2001,1225,200),new Book(1,"War and peace","Tolstoy","Idn",2001,1225,200),
        //        new Book(1,"War and peace","Tolstoy","Idn",2001,1225,200),new Book(1,"War and peace","Tolstoy","Idn",2001,1225,200)};
        System.out.print("Enter array length-> ");
        Scanner arrayLen = new Scanner(System.in);
        int arrLength = arrayLen.nextInt();
        Books bokk2 = new Books(arrLength);
        bokk2.addBook(new Book(1,"War and peace","Tolstoy","Idn",2001,1225,120));
        bokk2.addBook(new Book(2,"War and peace","Tolstoy","Idn",1,1225,120));
        bokk2.addBook(new Book(3,"War and peace","Tolstoy","Idn",20,1225,120));
        bokk2.addBook(new Book(4,"War and peace","Tolstoy","Idn",2001,1225,120));
        System.out.println("_________________________________________________________________");
        System.out.println("All books: ");
        bokk2.printAllBook(bokk2);
        System.out.println("_________________________________________________________________");
        Scanner asc = new Scanner(System.in);
        System.out.print("Enter search age : ");
        int age = asc.nextInt();
        System.out.println("Find results: ");
        bokk2.printAllBook(bokk2.searchBookAge(age));
        System.out.println("_________________________________________________________________");
        Scanner cost = new Scanner(System.in);
        System.out.print("Enter percent: ");
        int costChange = cost.nextInt();
        System.out.println("New cost of the books: ");
        bokk2.printAllBook(bokk2.changeCost(costChange));
        System.out.println("_________________________________________________________________");
        Scanner name = new Scanner(System.in);
        System.out.print("Enter name of the book: ");
        String nameBook = cost.next();
        System.out.println("Find results: ");
        bokk2.printAllBook(bokk2.searchBookName(nameBook));

    }


}
