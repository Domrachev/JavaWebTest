/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import java.sql.*;
/**
 *
 * @author Миша
 */

public class test {
    private String name;
    private String password;
    private static String username = "test";
    private static String pass = "test";
    private static String URL = "jdbc:derby://localhost:1527/test";
    private static Connection con = null;
    public test() throws SQLException {
        name = null;
        password = null;
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        con = DriverManager.getConnection(URL, username, pass);
    }

    /**
     * @return the name
     */
    public String getName() throws SQLException {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) throws SQLException {
        Statement st = con.createStatement();
    //Statement позволяет отправлять запросы базе данных
        st.executeUpdate("insert into LOGIN(NAME) values('"+name+"')");
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
