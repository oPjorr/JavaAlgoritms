package Udemy.JDBC.DemoDaoJDBC.model.dao.impl;

import Udemy.JDBC.DemoDaoJDBC.db.DB;
import Udemy.JDBC.DemoDaoJDBC.db.DbException;
import Udemy.JDBC.DemoDaoJDBC.model.dao.DepartmentDao;
import Udemy.JDBC.DemoDaoJDBC.model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
    private final Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO department " +
                    "(Name) " +
                    "VALUES " +
                    "(?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());
            int rowsAffected = st.executeUpdate();
            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.close(rs);
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(st);
        }
    }

    @Override
    public void update(Department obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("UPDATE department " +
                    "SET Name = ? " +
                    "WHERE Id = ?");

            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.close(st);
        }
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("SELECT * FROM department WHERE Id = ?");
            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                return instantiateDepartment(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(st);
        }
        return null;
    }

    @Override
    public List<Department> findAll() {
        Statement st = null;
        ResultSet rs = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM department");

            List<Department> list = new ArrayList<>();
            HashMap<Integer, Department> departments = new HashMap<>();
            while(rs.next()) {
                Department department = departments.get(rs.getInt("Id"));
                if(department == null) {
                    department = instantiateDepartment(rs);
                    departments.put(rs.getInt("Id"), department);
                }
                list.add(department);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.close(st);
            DB.close(rs);
        }
        return null;
    }

    public Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        return dep;
    }
}
