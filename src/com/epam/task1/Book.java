package com.epam.task1;

public class Book {
        private int id;
        private String name;
        private String author;
        private String publisher;
        private int year;
        private int pages;
        private int cost;

        public Book(int id , String name, String author, String publisher, int year, int pages, int cost) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
            this.pages = pages;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }

        public void getFullInformation(){
                System.out.println("Name of the book: " + this.name + " Author of the book: " + this.author + " Publisher of the book: "
                                    + this.publisher + " Year of publishing: " + this.year + " Number of pages: " + this.pages
                                    + " Cost of the book: " + this.cost);
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return this.cost;
        }
}
