package Udemy.JDBC.DemoDaoJDBC.model.dao.impl;

import Udemy.JDBC.DemoDaoJDBC.db.DB;
import Udemy.JDBC.DemoDaoJDBC.db.DbException;
import Udemy.JDBC.DemoDaoJDBC.model.dao.DepartmentDao;
import Udemy.JDBC.DemoDaoJDBC.model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
    private final Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

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
        return List.of();
    }

    public Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        return dep;
    }
}
