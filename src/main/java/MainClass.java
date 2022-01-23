public class MainClass {

   public static void main(String ...args){

      ViewManager viewManager = ViewManager.getViewManager();

      viewManager.registerView(new MainInitialMenu());
      viewManager.registerView(new MainInitialLoginMenu());
      viewManager.registerView(new MainInitialCreateMenu());
      viewManager.registerView(new BankAppMenu());

      viewManager.navigator("MainInitialMenu");

//      viewManager.registerView(new MainInitialMenu());
//      viewManager.registerView(new MainInitialLoginMenu());
//      viewManager.registerView(new MainInitialCreateMenu());
//      viewManager.registerView(new BankAppMenu());

//      viewManager.navigator("BankAppMenu");

      while(viewManager.isRunning()) {
         viewManager.render();
      }


   }

}
