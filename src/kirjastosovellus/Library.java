/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastosovellus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ohjelmistokehitys
 */
public class Library{
    
    //luodaan hyödykkeille 
    ArrayList<LibraryItem> database = new ArrayList<>();
    // juokseva indeksi
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    private int getNextID() {
        int currentIndex = this.getIndex();
        currentIndex++;
        this.setIndex(currentIndex);
        return index;
    }
    
    public void addItem (int selection) {
       switch (selection) {
           case 1:  //Book
               Book book = new Book();
               book.createItem(getNextID());
               database.add(book);
               break;
           case 2:  //DVD
               break;
           case 3: // BluRay
               break;
       }
        
    }
    public void removeItem (int removeindex) {
        Iterator<LibraryItem> r = database.iterator();
        boolean notFound = true;
        for(; r.hasNext();){
            LibraryItem item = r.next();
            if (item.getItemID() == removeindex) {
                database.remove(item);
                System.out.println("Tuote indeksillä: " + removeindex + " on poistettu");
                notFound = false;
            }
            if (notFound) {
                 System.out.println("Tuotetta ID:llä " + removeindex + " ei löytynyt!");
            }
        }
        
        
    }
    
    public void showAllItems () {
        Iterator<LibraryItem> i = database.iterator();
        for(; i.hasNext();){
            LibraryItem item = i.next();
            item.showItemInformation();
        }
    }
    
    public void searchByISBN (String ISBNquery) {
        Iterator<LibraryItem> i = database.iterator();
        for(; i.hasNext();){
            LibraryItem item = i.next();
            boolean notFound = true;
            if (ISBNquery.equals(item.getISBN())) {
                System.out.println("");
                item.showItemInformation();
                System.out.println("");
                notFound = false;
            }
            else {
                System.out.println("Tuotetta ISBN:llä " + ISBNquery + " ei löytynyt!");
            }
        }
    }
    
    public void searchByTitle (String nameQuery) {
        Iterator<LibraryItem> i = database.iterator();
        for(; i.hasNext();){
            LibraryItem item = i.next();
            boolean notFound = true;
            if (nameQuery.equals(item.getTitle())) {
                System.out.println("");
                item.showItemInformation();
                System.out.println("");
                notFound = false;
            }
            else {
                System.out.println("Tuotetta nimellä: " + nameQuery + " ei löytynyt!");
            }
        }
    }
    
    public void showBorrowedByLate () {
        
    }
    
    public void returnItem () {
        
    }   
 
}
