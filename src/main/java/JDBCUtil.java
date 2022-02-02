//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class JDBCUtil {
//    String className, URL, user, password;
//    Connection connection;
//    public JDBCUtil(String className, String URL, String user, String password) throws SQLException {
//        this.className = className;
//        this.URL = "jdbc:mariadb://localhost:3306/project0Database";
//        this.user = "admin";
//        this.password = "WhyDoSuckAsThis1412"; //I MISPELLED MY PASSWORD: WHYDOISUCKATTHIS1412 ** PLEASE IGNORE
//        this.connection = DriverManager.getConnection(URL, user, password);
//        System.out.println("SUCCESSFULLY CONNECTED TO DATABASE");
//    }
//    public void getConnection() {
//        //Load the driver class
//        try {
//            Class.forName(className);
//        } catch (ClassNotFoundException ex) {
//            System.out.println("Unable to load the class. Terminating the program");
//            System.exit(-1);
//        }
//        //get the connection
//        try {
//            connection = DriverManager.getConnection(URL, user, password);
//        } catch (SQLException ex) {
//            System.out.println("Error getting connection: " + ex.getMessage());
//            System.exit(-1);
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//            System.exit(-1);
//        }
//    }
//}
