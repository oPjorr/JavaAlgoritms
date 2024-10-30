package Udemy.JDBC.DemoDaoJDBC.application;

import Udemy.JDBC.DemoDaoJDBC.model.dao.DaoFactory;
import Udemy.JDBC.DemoDaoJDBC.model.dao.SellerDao;
import Udemy.JDBC.DemoDaoJDBC.model.entities.Department;
import Udemy.JDBC.DemoDaoJDBC.model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===== Test 1: seller findById =====");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println();

        System.out.println("===== Test 2: seller findByDepartment =====");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for(Seller item : list) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("===== Test 3: findAll =====");
        list = sellerDao.findAll();
        for(Seller item : list) {
            System.out.println(item);
        }
    }
}
