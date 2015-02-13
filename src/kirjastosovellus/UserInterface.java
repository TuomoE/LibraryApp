/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjastosovellus;

import java.util.Scanner;


public class UserInterface {
    
    private static String user;
    Library library = new Library();
    
    /**
     * 
     * @param args 
     * Käyttäjä antaa ohjelman käynnistyksessä parametrin käyttäjästä
     */
    public UserInterface (String[] args)
    {
        mainMenu(args);
    }
    
    private void mainMenu (String[] args) {
        
        // tässä pyörii ui
       
        switch (args[0]) {
            
            case "admin":
                System.out.println("admin käyttäjä");
                int close = -9;
                while (close != 7) {
                int selection = showAdminMenu();
                handleUserInput(selection, 2);
                close = selection;
                }
                break;
                
            case "kirjasto":
                int close2 = -9;
                while (close2 != 5) {
                int selection2 = showUserMenu();
                handleUserInput(selection2, 1);
                }
                break;
                
            default :
                throw new IllegalArgumentException("Invalid username");
        }
    }
    
    private int showUserMenu () {
        System.out.println("**********KirjastoSovellus************");
        System.out.println("    1.  Lainaa kirjastosta");
        System.out.println("    2.  Etsi nimellä");
        System.out.println("    3.  Etsi ISBN numerolla");
        System.out.println("    4.  Palauta hyödyke");
        System.out.println("    5.  Lopeta");
        System.out.println("Anna valintasi: ");
        Scanner scan1 = new Scanner(System.in);
        int luku = scan1.nextInt();
        return luku;
    }
    
    private int showAdminMenu () {
        System.out.println("**********Admin User************");
        System.out.println("    1.  Lisää hyödyke");
        System.out.println("    2.  Poista hyödyke");
        System.out.println("    3.  Listaa kaikki");
        System.out.println("    4.  Etsi nimellä");
        System.out.println("    5.  Etsi ISBN numerolla");
        System.out.println("    6.  Näytä myöhässä olevat");
        System.out.println("    7.  Poistu");
        System.out.println("Anna valintasi: ");
        int selection;
        
        Scanner sc = new Scanner(System.in);
        selection = sc.nextInt();
        
        return selection;
    }
    
    
    /**
     * 
     * @param input     (book = 1,DVD = 2, Blu-ray = 3,...)
     * @param usertype  (admin = 2, user = 1) 
     */
    private void handleUserInput (int input, int usertype) 
    {
        
        switch (input) {
            case 1:
                if (usertype == 1) {
                    System.out.println("Kirja lainataan");
                    // TODO  ********************************
                    //***************************************
                    break;
                } 
                else {
                    System.out.println("Lisätään hyödyke");
                    library.addItem(input);
                }
                break;
            case 2:
                if (usertype == 1) {
                System.out.println("");
                System.out.println("Etsitään nimellä");
                    System.out.println("Anna tuotteen nimi: ");
                    Scanner scan = new Scanner(System.in);
                    String name = scan.nextLine();
                    library.searchByTitle(name);
                }
                else {
                System.out.println("Poistetaan hyödyke");
                    System.out.print("");
                    if (library.database.isEmpty()) {
                        System.out.println("Et voi poistaa koska tietokanta on tyhjä");
                    }
                    else { 
                    library.showAllItems();
                    System.out.println("Anna poistettavan tuotteen ID");
                    Scanner scan = new Scanner(System.in);
                    int removeIndex = scan.nextInt();
                    library.removeItem(removeIndex);
                    }
                }
                break;
            case 3:
                if (usertype == 1) {
                System.out.println("");
                System.out.println("Etsitään ISBN numerolla");
                    System.out.println("Anna tuotteen ISBN numero: ");
                    Scanner scan = new Scanner(System.in);
                    String name = scan.nextLine();
                    library.searchByISBN(name);
                }
                else {
                System.out.println("Listataan kaikki");
                    library.showAllItems();
                }
                break;
            case 4: 
                if (usertype == 1) {
                System.out.println("Palautetaan hyödyke");
                // TODO  ********************************
                    //***************************************
                }
                else {
                System.out.println("");
                System.out.println("Etsitään nimellä");
                    System.out.println("Anna tuotteen nimi: ");
                    Scanner scan = new Scanner(System.in);
                    String name = scan.nextLine();
                    library.searchByTitle(name);
                }
                break;
            case 5:
                if (usertype == 1) {
                System.out.println("Lopetetaan");
                System.exit(1);
               
                }else {
                    System.out.println("Etsitään ISBN numerolla");
                    System.out.println("Anna tuotteen ISBN numero: ");
                    Scanner scan = new Scanner(System.in);
                    String name = scan.nextLine();
                    library.searchByISBN(name);
                }
                break;
            case 6:
                System.out.println("Näytä myöhässä olevat");
                // TODO  ********************************
                    //***************************************
            
            case 7:
                System.out.println("Lopetetaan");
                System.exit(1);
            default :
                System.out.println("Annoit väärän syötteen.");
        }
    }
    
}
