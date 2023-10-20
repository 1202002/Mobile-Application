package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Database {

   private  ArrayList<Book> books = new ArrayList<>() ;

   public Database(){

       books.add(new Book("laravel" ,"jeffry way" , "Programming")) ;
       books.add(new Book("Mysql" ,"Abdullah Alnatsha" , "Database")) ;
       books.add(new Book("Javascript" ,"W3c" , "Web App")) ;
       books.add(new Book("php" ,"laracast" , "Web")) ;
       books.add(new Book("Docker" ,"Ahmad asmar" , "Programming")) ;
       books.add(new Book("MongoDB" ,"jehad nasser" , "Database")) ;
   }

   public List<Book> getBooks(String cat){

       ArrayList<Book> result = new ArrayList<>();

       for(Book b:books){
           if(b.getCategory().equals(cat)){
               result.add(b) ;
           }
       }
       return  result ;
   }
}
