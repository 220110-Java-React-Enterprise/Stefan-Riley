public class MainInitialMenu extends View { //WHY IS A CLASS NAME BEING A METHOD OR COULD IT BE IT NAMED ANTYING ELSE

    public MainInitialMenu() {
        viewName = "MainInitialMenu";
        viewManager = ViewManager.getViewManager();
    }

    public void renderView() {
        System.out.println("************* WELCOME TO BANK OF AMERICA ************* ");
        System.out.println("How may we help you today?");
        System.out.println("________________________________________________________");
        System.out.println("1 - Login into an account");
        System.out.println("2 - Create an account");
        int intialMenuInput = viewManager.getScanner().nextInt();
        System.out.println("Please enter number here: " + intialMenuInput);
        System.out.println("________________________________________________________");

        //STORE THE RESPONSE INTO THE A DATA STORE

        //GET THE CODE WORKIGN THEN ADD THE DATA STORE
        if (intialMenuInput == 1) {
            viewManager.navigator("MainInitialLoginMenu");
        } else if (intialMenuInput == 2) {
            viewManager.navigator("MainInitialCreateMenu");
        }


    }
}
