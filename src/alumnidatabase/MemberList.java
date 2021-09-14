
package alumnidatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberList {

    Scanner in = new Scanner(System.in);
    ArrayList<Contact> memberList = new ArrayList<>();

    public MemberList() {
    }

    public void addMember() {

        //clear buffer
        in.nextLine();

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Company: ");
        String company = in.nextLine();

        System.out.println("Job Title: ");
        String jobTitle = in.nextLine();

        System.out.println("Email: ");
        String email = in.nextLine();

        System.out.println("Business Phone: ");
        String businessPhone = in.nextLine();

        System.out.println("Address: ");
        String address = in.nextLine();

        System.out.println("Graduating Major: ");
        String gradMajor = in.nextLine();

        System.out.println("Graduating Year: ");
        int gradYear = in.nextInt();

        System.out.println("Active Club Member: ");
        boolean isActive = in.nextBoolean();

        System.out.println("Is Club Employee: ");
        boolean isEmployee = in.nextBoolean();

        System.out.println("Paid Membership Fees: ");
        boolean hasPaidFees = in.nextBoolean();


        memberList.add(new Contact(name, company, jobTitle, email, businessPhone, address, gradMajor, gradYear, isActive, isEmployee, hasPaidFees));


    }

    public void formatContact(int i) {
        int position = i + 1;
        System.out.println("------------------------------");
        System.out.println("--- Position in List: " + position + " ---");
        System.out.println("Name: " + memberList.get(i).getName());
        System.out.println("Company: " + memberList.get(i).getCompany());
        System.out.println("Job Title: " + memberList.get(i).getJobTitle());
        System.out.println("Email: " + memberList.get(i).getEmail());
        System.out.println("Business Phone: " + memberList.get(i).getBusinessPhone());
        System.out.println("Address: " + memberList.get(i).getAddress());
        System.out.println("Graduate Major: " + memberList.get(i).getGradMajor());
        System.out.println("Graduation Year: " + memberList.get(i).getGradYear());
        //System.out.println("Is Active Member? " + memberList.get(i).getIsActive());
        System.out.println("Is Club Employee? " + memberList.get(i).getIsIsEmployee());
        System.out.println("Paid Membership Fees? " + memberList.get(i).getIsHasPaidFees());
    }

    public void printMemberList() {
        for (int i = 0; i < memberList.size(); i++ ) {
            formatContact(i);
            System.out.println("------------------------------");
        }
    }


    public void deactivateMember(){
        int toRemove = in.nextInt() - 1;
        System.out.println("--Change boolean--");
        boolean flip = in.nextBoolean();
        memberList.get(toRemove).setActive(flip);

    }
    public void modifyMember() {
        int toModify = in.nextInt() - 1;
        in.nextLine();
        System.out.println("What field would you like to modify?");
        String field = in.nextLine().toLowerCase();

        switch (field) {
            case "name" : {
                System.out.println("Enter New Name:");
                String newName = in.nextLine();
                memberList.get(toModify).setName(newName);

            } break;
            case "company" : {
                System.out.println("Enter New Compnay:");
                String newCompany = in.nextLine();
                memberList.get(toModify).setCompany(newCompany);
            } break;
            case "jobtitle" : {
                System.out.println("Enter New Job Title:");
                String newJob = in.nextLine();
                memberList.get(toModify).setJobTitle(newJob);
            } break;
            case "email" : {
                System.out.println("Enter New Email:");
                String newEmail = in.nextLine();
                memberList.get(toModify).setEmail(newEmail);
            } break;
            case "businessphone" : {
                System.out.println("Enter New Business Phone Number:");
                String newBusinessPhone = in.nextLine();
                memberList.get(toModify).setBusinessPhone(newBusinessPhone);
            } break;
            case "address" : {
                System.out.println("Enter New Address:");
                String newAddress = in.nextLine();
                memberList.get(toModify).setAddress(newAddress);
            } break;
            case "graduatemajor" : {
                System.out.println("Enter New Major:");
                String newMajor = in.nextLine();
                memberList.get(toModify).setGradMajor(newMajor);
            } break;
            case "graduationyear" : {
                System.out.println("Enter New Year:");
                int newYear = in.nextInt();
                memberList.get(toModify).setGradYear(newYear);
            } break;
            case "clubemployee" : {
                System.out.println("Set employment boolean:");
                boolean newStatus = in.nextBoolean();
                memberList.get(toModify).setIsEmployee(newStatus);
            } break;
            case "haspaidfees" : {
                System.out.println("Set Fee Payment boolean");
                boolean payment = in.nextBoolean();
                memberList.get(toModify).setHasPaidFees(payment);
            }
        }
    }


}
