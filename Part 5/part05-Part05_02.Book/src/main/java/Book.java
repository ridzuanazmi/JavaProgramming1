/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Book {
    
    private String title;
    private String author;
    private int page;
    
    public Book(String author, String name, int pages) {
        this.title = name;
        this.author = author;
        this.page = pages;
    }
    
    public String getName() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public int getPages() {
        return this.page;
    }
    
    public String toString() {
        return this.author + ", " + this.title + ", " + this.page + " pages";
    }
    
}
