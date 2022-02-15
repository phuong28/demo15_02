/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connecttosqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;


public class Connecttosqlserver {

    /**
     * @param args the command line arguments
     */
    public static Connection JDBC() throws SQLException{
        final String user = "sa";
        final String password = "2810phuong";
        final String url="jdbc:sqlserver://localhost:1433;databaseName=addsv;user="+user+";password="+password;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return  (Connection) DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
        }
     return null;
}
    public static void main(String[] args) throws SQLServerException, SQLException {
        Connection con = JDBC();
        if(con!=null){
            System.out.println("ok");
        }
        else{
            System.out.println("1");
        }
        
        
    }
    //b xem cái này đi
    

}
