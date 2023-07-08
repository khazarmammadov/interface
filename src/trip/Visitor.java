package trip;

import java.util.Scanner;

public class Visitor implements abroadRules {
    private int budget;
    private boolean politicalBan;
    private boolean visaStatus;

    Visitor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your budget: ");
        budget = sc.nextInt();

        System.out.print("Do you have political ban? ( Answer: 'Yes' or 'No' ): ");
        String ans = sc.next();

        if (ans.equals("Yes")) {
            politicalBan = false;
        } else {
            politicalBan = true;
        }

        System.out.print("Do you have Visa ? ( Answer: 'Yes' or 'No' ): ");
        String ans2 = sc.next();

        if (ans2.equals("Yes")) {
            visaStatus = true;
        } else {
            visaStatus = false;
        }

    }

    @Override
    public boolean overseas_fee() {

        if (budget < 150) {
            System.out.println("Your budget not enough....");
            return false;
        } else {
            System.out.println("Your budget is okayy....");
            return true;
        }
    }

    @Override
    public boolean political_ban() {

        if (politicalBan) {
            System.out.println("You can leave country.....");
            return true;
        } else {
            System.out.println("You cant leave country....");
            return false;
        }
    }

    @Override
    public boolean visa_status() {

        if (visaStatus) {
            System.out.println("You have a Visa in System.....");
            return true;
        } else {
            System.out.println("You havent a Visa in System....");
            return false;
        }
    }
}
