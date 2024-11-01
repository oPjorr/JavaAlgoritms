package Udemy.JDBC.jdbc6.application;

import Udemy.JDBC.jdbc6.db.DB;
import Udemy.JDBC.jdbc6.db.DbException;
import Udemy.JDBC.jdbc6.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            conn.setAutoCommit(false);

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 3");

            int x = 1;
            if(x < 2) {
                throw new SQLException("Fake error");
            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 6");

            conn.commit();
            System.out.println("rows 1" + rows1);
            System.out.println("rows 2" + rows2);
        } catch (SQLException e) {
            try{
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused By: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused By: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
