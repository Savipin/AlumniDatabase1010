/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnidatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tjpeltier
 */
public class AlumniDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run){
            menu();
            int choice = in.nextInt();
            Contact database = new Contact();
            
            switch (choice) {
                
                case 1: database.printMemberList(); break;
                case 2: database.addMember(); break;
                // need to display all of the contacts (with where they are in the list) and ask which peroson to change the setting on)
                case 3: {
                    database.printMemberList();
                    boolean setting = in.nextBoolean();
                    database.setActive(setting);
                } break;
                // modify
                case 4: {
                    System.out.println("number to be changed");
                    int temp = in.nextInt();
                    database.modifyMember(temp);
                } break;
                case 5: run = false;

            }
            System.out.println("------------------------------");
        }
    }
    
    
        
    public static void menu(){
       System.out.println("--- Welcome to the Alumni Database ---");
       System.out.println("What would you like to do? ");
       System.out.println("1. Display Member Report");
       System.out.println("2. Add New Members");
       System.out.println("3. Deactivate Member");
       System.out.println("4. Modify Memeber");
       System.out.println("5. exit");
    }
    
}
