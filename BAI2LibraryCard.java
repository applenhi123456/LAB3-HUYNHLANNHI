/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class LibraryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;
    
    // Constructors
    public LibraryCard() {
        this.lbCode = 0;
        this.owner = "";
        this.borrowCount = 0;
    }
    
    public LibraryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }
    
    // Getters and Setters
    public long getLbCode() {
        return this.lbCode;
    }
    
    public void setLbCode(long code) {
        this.lbCode = code;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public int getBorrowCount() {
        return this.borrowCount;
    }
    
    // Other methods
    public void checkOut(int num) {
        this.borrowCount += num;
    }
    
    // toString method
    @Override
    public String toString() {
        return "LibraryCard{" +
                "lbCode=" + lbCode +
                ", owner='" + owner + '\'' +
                ", borrowCount=" + borrowCount +
                '}';
    }
}