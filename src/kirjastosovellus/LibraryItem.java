/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastosovellus;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Ohjelmistokehitys
 */
public abstract class LibraryItem {
    
    private int itemID;
    private String ISBN;
    private String title;
    private String publisher;
    protected LocalDate borrowedDate;
    protected boolean isBorrowed;
    protected boolean isReserved;
    private String Borrower;
    
    public void showItemInformation() {
        System.out.println("ID: " + this.getItemID());
        System.out.println("ISBN on: " + this.getISBN());
        System.out.println("Nimi on: " + this.getTitle());
        System.out.println("Julkaisija on: " + this.getPublisher());
    }
    
    public abstract void addInformation();
    
    
    /**
     * Annetaan tuotteen yläluokan(libraryitem) ominaisuudet
     * @param selection
     * @return 
     */
    public LibraryItem createItem (int index) {
        
        this.setItemID(index);
        Scanner scan = new Scanner(System.in);
        System.out.println("Anna nimi:");
        this.setTitle(scan.nextLine());
        System.out.println("Anna julkaisija:");
        this.setPublisher(scan.nextLine());
        System.out.println("Anna ISBN:");
        this.setISBN(scan.nextLine());
     //   this.setItemID();
          
        return this;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public boolean isIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public String getBorrower() {
        return Borrower;
    }

    public void setBorrower(String Borrower) {
        this.Borrower = Borrower;
    }
 
    
}
