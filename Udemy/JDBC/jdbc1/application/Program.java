package Udemy.JDBC.jdbc1.application;

import Udemy.JDBC.jdbc1.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
