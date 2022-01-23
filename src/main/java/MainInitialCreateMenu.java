
public class MainInitialCreateMenu extends View {

    public MainInitialCreateMenu() {
        viewName = "MainInitialCreateMenu";
        viewManager = ViewManager.getViewManager();
    }


    public void renderView() {
        System.out.println("************* Thanks for your interest in registrating for an account ************* ");
        System.out.println("Providing information now needed to sign up Today!");
        System.out.println("Let's get you started today with some quick details");
        System.out.println("________________________________________________________");
        //PART 1 OF THE CREATING AN ACCOUNT
        String firstName = viewManager.getScanner().nextLine();
        System.out.println("Enter your first name : ");

        String lastName = viewManager.getScanner().nextLine();
        System.out.println("Enter your last name : ");
        String email = viewManager.getScanner().nextLine();
        System.out.println("Enter your email: ");
        //ADD EMAIL FORMATING / VALIDATING MEASURES
        //I need to validate all this information given to validate if the program can go futher
        System.out.println("________________________________________________________");
        System.out.println("Thanks " + firstName + " " + lastName );
        System.out.println("We are almost finished. Just a bits of information more....");

        String country = viewManager.getScanner().nextLine();
        System.out.println("Country (For example : UK or US) : ");
            //if they enter a UK account --- store that in a variable for the zipcode
        String addressStreet = viewManager.getScanner().nextLine();
        System.out.println("Stree Address : ");
        String addressState = viewManager.getScanner().nextLine();
        System.out.println("State( For example : LA) ");
        String addressZipCode = viewManager.getScanner().nextLine();
        System.out.println("Zipcode : ");
            //USE THE UK CODE TO ALLOW FOR kt2 ph zipcode
        String gender = viewManager.getScanner().nextLine();
        System.out.println("what is your gender : MALE / FEMALE / TO NO SAY");

        System.out.println("Thank for filling out the form. Processing the information now");
        //THE FINAL VALIDATION -- CHECK INFORMATION IS VALIDE BFOFER PASSING EVERYTHIGN ALONG
        //WITH EACH CONDITIONAL OF THE SECTIONS WITH A STAMP OF APPROVE VALUE (RETURN TRUE) THING
        //TEMP GOING TO TO LET IS PASS FOR NOW AUTOMATIICLAY
        System.out.println("You account has been created! ");
        System.out.println("________________________________________________________");

        //STORE THE RESPONSE INTO THE A DATA STORE

        //GET THE CODE WORKIGN THEN ADD THE DATA STORE
        viewManager.navigator("BankAppMenu");
    }


//    public void renderView() {
//        System.out.println("************* Thanks choosing the login in options ************* ");
//        System.out.println("Accessing your account now...");
//        System.out.println("________________________________________________________");
//        String firstName = viewManager.getScanner().nextLine();
//        System.out.println("Enter your first name : " + firstName);
//        String lastName = viewManager.getScanner().nextLine();
//        System.out.println("Enter your last name : " + lastName);
//        int intialMenuInput = viewManager.getScanner().nextInt();
//        System.out.println("Please enter number here: " + intialMenuInput);
//        System.out.println("________________________________________________________");



}
