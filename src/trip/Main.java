package trip;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("You are welcome Haydar Aliyev International Airport");

        String rules = "Travel abroad rules...\n"
                + "You dont have political ban...\n"
                + "Your budget have to 150 avro min....\n"
                + "You must have a Visa...";
        String message = "You have to provide all of the abroad conditions";


        while (true) {
            System.out.println("*******************************************");
            System.out.println(rules);
            System.out.println("*******************************************");


            Visitor visitor = new Visitor();

            System.out.println("Checking the Fee...");

            Thread.sleep(3000);
            if (!visitor.overseas_fee()) {

                System.out.println(message);
                continue;
            }

            System.out.println("Checking the Ban...");
            Thread.sleep(3000);

            if (!visitor.political_ban()) {
                System.out.println(message);
                continue;
            }
            System.out.println("Checking Visa status...");
            Thread.sleep(3000);

            if (!visitor.visa_status()) {
                System.out.println(message);
                continue;
            }
            System.out.println("Your transactions are OK! You can go abroad...");
            break;


        }

    }
}
