package com.epam.task1;

import java.util.Arrays;

public class Books {
    private static int count = 0;
    private Book[] array;

    public Books(int lengthArray) {
        array = new Book[lengthArray];
    }

    public Book[] addBook(Book args){
        array[count++] = args;
        return array;
    }

    public void printAllBook(Books arg){
        if(arg.array.length == 0){
            System.out.println("We don`t have books");
        }else{
            for (int i = 0; i < count && arg.array[i] != null; i++) {
                arg.array[i].getFullInformation();
            }
        }
    }

    public Books searchBookName(String name){
        Books arr = new Books(array.length);
        for (int i = 0; i < count && array[i]!=null; i++) {
            if(array[i].getName().equalsIgnoreCase(name)){
                arr.addBook(array[i]);
            }
        }
        return arr;
    }

    public Books searchBookAge(int year) {
        Books arr = new Books(array.length);
        for (int i = 0; i < count && array[i]!=null; i++) {
            if (array[i].getYear() > year) {
                arr.addBook(array[i]);
            }
        }
        return arr;
    }
    public Books changeCost (int arg){
        Books arr = new Books(array.length);
        for (int i = 0; i < count && array[i]!=null; i++) {
            array[i].setCost(array[i].getCost()+ ((array[i].getCost())*arg)/100);
            array[i].getFullInformation();
            arr.addBook(array[i]);
        }
        return arr;
    }
}
