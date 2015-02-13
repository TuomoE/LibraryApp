/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastosovellus;

import java.util.Scanner;

/**
 *
 * @author Ohjelmistokehitys
 */
public class Book extends LibraryItem {

    private int pages;
    private int publicatiosedition;
    private String description;
    
    
    @Override
    public void showItemInformation() {
        super.showItemInformation();
        System.out.println("Kirjassa on sivuja:" + this.pages);
        System.out.println("Kirjan painos on:" + this.publicatiosedition);
        System.out.println("Kirjan kuvaus: " + this.description);
        
        
    }

    @Override
    public void addInformation() {
    }

    @Override
    public LibraryItem createItem (int selection) {
      super.createItem(selection);
      Scanner scan = new Scanner(System.in);
      System.out.println("Anna kirjan sivujen määrä: ");
      this.setPages(scan.nextInt());
      System.out.println("Kirjan painos on: ");
      this.setPublicatiosedition(scan.nextInt());
      System.out.println("Anna kirjan lyhyt kuvaus. lopeta painamalla enter. ");
      this.setDescription(scan.nextLine());
      System.out.println("");
      System.out.println("Tallennetut tiedot: ");
      this.showItemInformation();
        return this;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublicatiosedition() {
        return publicatiosedition;
    }

    public void setPublicatiosedition(int publicatiosedition) {
        this.publicatiosedition = publicatiosedition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
}
