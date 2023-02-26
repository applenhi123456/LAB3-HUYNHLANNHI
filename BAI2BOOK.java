/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    
    // Constructors
    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }
    
    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    
    public Book(Book bo) {
        this.boCode = bo.getBoCode();
        this.boTitle = bo.getBoTitle();
        this.boAuthor = bo.getBoAuthor();
    }
    
    // Getters and Setters
    public String getBoCode() {
        return this.boCode;
    }
    
    public void setBoCode(String code) {
        this.boCode = code;
    }
    
    public String getBoTitle() {
        return this.boTitle;
    }
    
    public void setBoTitle(String title) {
        this.boTitle = title;
    }
    
    public String getBoAuthor() {
        return this.boAuthor;
    }
    
    public void setBoAuthor(String authorName) {
        this.boAuthor = authorName;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Book{" +
                "boCode='" + boCode + '\'' +
                ", boTitle='" + boTitle + '\'' +
                ", boAuthor='" + boAuthor + '\'' +
                '}';
    }
}