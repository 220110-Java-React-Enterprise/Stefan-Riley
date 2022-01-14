import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

//        bankAccountClasses test = new bankAccountClasses();
//        test.deposit(100, 44);
//
//        test.withdraw(100, 44);
//        test.transactions();

        MenuStartup msh = new MenuStartup();

        msh.MenuShow();


    }

//    public static class bankAccountClasses {

    public static class bankAccountClasses {

        //add vinmo option for withdraw
        //negative conditions for depsite
        //do I include the user input here?????

        static int balance = 700;
//        static int depositUserInput;
        static int amount;
        String clientName;

        static void deposit(int balance, int amount) {
            balance = balance + amount;
            System.out.println("Deposite Complete. Current Balance : " + balance);
        }

        static void withdraw(int balance, int amount) {
            balance = balance - amount;
            System.out.println("Withdraw Complete. Current Balance : " + balance);
        }

        void transactions() {
            System.out.println("Bank Account of " + clientName);
            System.out.println("Current Account : " + balance);
        }

    }

    public static class MenuStartup {

        // CREATE USER / LOGIN MENU CONDITION

        public void MenuShow() {


            int mainMenuSelection;
            do {
                System.out.println("Welcome to Bank of DodgeCoin");
                //THIS IS WHERE TO ENTER IF TO CREATE AN ACCOUNT OR OR LOGIN WITH
                //I NEED TO LEARN HOW TO DO LIST SO SKIP THIS FOR NOW
                System.out.println("----------------------------------");
                System.out.println(" #1 For Deposite Activities");
                System.out.println(" #2 For Withdraw Activities");
                System.out.println(" #3 View your Current Account");
                System.out.println(" #4 Close application");
                System.out.println("Please choose an option");
                System.out.println("----------------------------------");

                Scanner sc = new Scanner(System.in);
                mainMenuSelection = sc.nextInt();

                //how to connect the user input to the switch condition

                if (mainMenuSelection == 1) {
                    System.out.println("You have selected the deposite option:");
                    System.out.println("Your current balance is : " + bankAccountClasses.balance);
                    System.out.println("How much do you want to deposit : ");
                    bankAccountClasses.amount = sc.nextInt();
                    //I'm trying to make this input equal balance
                    //am I better making balance a scope value but then how will that work with class
                    System.out.println("**********************************");
                    bankAccountClasses.deposit(bankAccountClasses.balance, bankAccountClasses.amount);
                    System.out.println("**********************************");
                    System.out.println("----------------------------------");
                } else if (mainMenuSelection == 2) {
                    System.out.println("You have selected the deposite option:");
                    System.out.println("Your current balance is : " + bankAccountClasses.balance);
                    System.out.println("How much do you want to withdaw : ");
                    bankAccountClasses.amount = sc.nextInt();
                    System.out.println("**********************************");
                    bankAccountClasses.withdraw(bankAccountClasses.balance, bankAccountClasses.amount);
                    System.out.println("**********************************");
                    System.out.println("----------------------------------");
                } else if (mainMenuSelection == 3) {
                    System.out.println("You have selected to view your Current balance:");
                    System.out.println("**********************************");
                    System.out.println("Your current balance is : " + bankAccountClasses.balance);
                    System.out.println("**********************************");
                    System.out.println("----------------------------------");
                } else {
                    System.out.println("You have selected to close the application.");
                    System.out.println("Thanks for banking with Dodgecoin.");
                    break;
                }
            } while (mainMenuSelection != 4);

        }


            }



    }


