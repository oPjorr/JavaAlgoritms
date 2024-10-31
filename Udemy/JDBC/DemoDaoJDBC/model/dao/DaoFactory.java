package Udemy.JDBC.DemoDaoJDBC.model.dao;

import Udemy.JDBC.DemoDaoJDBC.db.DB;
import Udemy.JDBC.DemoDaoJDBC.model.dao.impl.DepartmentDaoJDBC;
import Udemy.JDBC.DemoDaoJDBC.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
