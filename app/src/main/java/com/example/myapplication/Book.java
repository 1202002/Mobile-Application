package com.example.myapplication;

public class Book {

    private String title ;
    private  String author ;
    private  String category ;

//    creat an constractor with all attributs
    public Book(String title , String author, String category) {
        this.author = author;
        this.title = title;
        this.category = category;
    }

//    create getter

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

//     create the setter of the class
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
