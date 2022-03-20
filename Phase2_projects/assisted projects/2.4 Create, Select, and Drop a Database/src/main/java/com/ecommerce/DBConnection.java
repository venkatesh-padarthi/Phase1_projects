package com.ecommerce;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

        private Connection connection;
        
        public DBConnection(String URL, String userid, String password) throws ClassNotFoundException, SQLException{
                
                Class.forName("com.mysql.jdbc.Driver");
                this.connection = DriverManager.getConnection(URL, userid, password);
        }
        
        public Connection getConnection(){
                return this.connection;
        }
        
        public void closeConnection() throws SQLException {
                if (this.connection != null)
                        this.connection.close();
        }
}
