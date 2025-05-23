package CoreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class5march {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db","root","8207");
           Statement st=con.createStatement();
           st.executeUpdate("create database ashu");
           st.close();
           con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
