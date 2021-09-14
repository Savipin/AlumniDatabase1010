/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnidatabase;
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
        MemberList memberList = new MemberList();

        System.out.println("--- Welcome to the Alumni Database ---");
// todo figure out emptying the scanner
        while(run){
            printMenu();
            int choice = in.nextInt();
            switch (choice) {
                
                case 1: memberList.printMemberList(); break;
                case 2: memberList.addMember(); break;

                // need to display all of the contacts (with where they are in the list) and ask which peroson to change the setting on)
                case 3: {

                } break;
                // modify
                case 4: {

                } break;
                case 5: run = false;

            }
            System.out.println("------------------------------");
        }
    }
    
    
        
    public static void printMenu(){
       System.out.println("What would you like to do? ");
       System.out.println("1. Display Member Report");
       System.out.println("2. Add New Members");
       System.out.println("3. Deactivate Member");
       System.out.println("4. Modify Member");
       System.out.println("5. exit");
    }




    
}
