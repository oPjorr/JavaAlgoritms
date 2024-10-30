package Udemy.JDBC.DemoDaoJDBC.model.dao;

import Udemy.JDBC.DemoDaoJDBC.model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
