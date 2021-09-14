
package alumnidatabase;

import alumnidatabase.Contact;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberList {

    Scanner in = new Scanner(System.in);
    ArrayList<Contact> memberList = new ArrayList<>();

    public MemberList() {
        System.out.println("New Member");
    }

    public void addMember() {

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Company: ");
        String company = in.nextLine();

        System.out.print("Job Title: ");
        String jobTitle = in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();

        System.out.print("Business Phone: ");
        String businessPhone = in.nextLine();

        System.out.println("Address: ");
        String address = in.nextLine();

        System.out.print("Graduating Major: ");
        String gradMajor = in.nextLine();

        System.out.print("Graduating Year: ");
        int gradYear = in.nextInt();

        System.out.print("Active Club Member: ");
        boolean isActive = in.nextBoolean();

        System.out.print("Is Club Employee: ");
        boolean isEmployee = in.nextBoolean();

        System.out.print("Paid Membership Fees: ");
        boolean hasPaidFees = in.nextBoolean();


        memberList.add(new Contact(name, company, jobTitle, email, businessPhone, address, gradMajor, gradYear, isActive, isEmployee, hasPaidFees));


    }

    public void formatContact(int i) {

        System.out.println("Name: " + memberList.get(i).getName());
        System.out.println("Company: " + memberList.get(i).getCompany());
        System.out.println("Job Title: " + memberList.get(i).getJobTitle());
        System.out.println("Email: " + memberList.get(i).getEmail());
        System.out.println("Business Phone: " + memberList.get(i).getBusinessPhone());
        System.out.println("Address: " + memberList.get(i).getAddress());
        System.out.println("Graduate Major: " + memberList.get(i).getGradMajor());
        System.out.println("Graduation Year: " + memberList.get(i).getGradYear());
        System.out.println("Is Active Member? " + memberList.get(i).getIsActive());
        System.out.println("Is Club Employee? " + memberList.get(i).getIsIsEmployee());
        System.out.println("Paid Membership Fees? " + memberList.get(i).getIsHasPaidFees());
    }

    public void printMemberList() {
        for (int i = 0; i < memberList.size(); i++ ) {
            int position = i + 1;
            System.out.println("Position in List:" + position );
            formatContact(i);
            System.out.println("------------------------------");
        }
    }


    public void deactivateMember(){

    }
    public void modifyMember(int i) {
        // memberList.set(i, );
    }


}
