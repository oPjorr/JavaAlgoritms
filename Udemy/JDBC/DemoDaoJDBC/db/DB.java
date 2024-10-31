package Udemy.JDBC.DemoDaoJDBC.db;

import Udemy.JDBC.jdbc5.db.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if(conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    private static Properties loadProperties() {
        try(FileInputStream fs = new FileInputStream("Udemy/JDBC/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static <T extends AutoCloseable> void close(T autoCloseable)  {
        if ( autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
