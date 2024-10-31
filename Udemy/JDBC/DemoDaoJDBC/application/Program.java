package Udemy.JDBC.DemoDaoJDBC.application;

import Udemy.JDBC.DemoDaoJDBC.model.dao.DaoFactory;
import Udemy.JDBC.DemoDaoJDBC.model.dao.DepartmentDao;
import Udemy.JDBC.DemoDaoJDBC.model.dao.SellerDao;
import Udemy.JDBC.DemoDaoJDBC.model.entities.Department;
import Udemy.JDBC.DemoDaoJDBC.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Scanner leitura = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("""
                =========================================
                |Em qual tabela você quer fazer um CRUD?|
                |=======================================|
                |              1. Seller                |
                |              2. Department            |\s
                ========================================""");

        int opcaoTable = leitura.nextInt();

        if(opcaoTable == 1) {
            while (true) {
                System.out.println("""
                        =========================================
                        |  Qual operação você deseja fazer?     |
                        |=======================================|
                        |  1. Listar Seller(s) por ID           |
                        |  2. Listar Seller(s) por Departament  |
                        |  3. Listar todos os Sellers           |
                        |  4. Adicionar um novo Seller          |
                        |  5. Atualizar o nome de um Seller     |
                        |  6. Apagar um seller                  |
                        |  7. Sair                              |
                        =========================================""");

                int opcaoCrud = leitura.nextInt();

                if (opcaoCrud == 1) {
                    System.out.println("Digite o ID do seller que você deseja ver");
                    int id = leitura.nextInt();
                    Seller seller = sellerDao.findById(id);
                    System.out.println(seller);
                } else if (opcaoCrud == 2) {
                    System.out.println("Digite o ID do Department que você deseja ver");
                    int id = leitura.nextInt();
                    List<Seller> list = sellerDao.findByDepartment(new Department(id, null));
                    for (Seller item : list) {
                        System.out.println(item);
                    }
                } else if (opcaoCrud == 3) {
                    System.out.println();
                    List<Seller> list = sellerDao.findAll();
                    for (Seller item : list) {
                        System.out.println(item);
                    }
                } else if (opcaoCrud == 4) {
                    System.out.println("Informe os dados do novo Seller: ");
                    System.out.println("Nome: ");
                    String name = leitura.next();
                    System.out.println("Email: ");
                    String email = leitura.next();
                    System.out.println("Salário");
                    double baseSalary = leitura.nextDouble();
                    System.out.println("ID do departamento ao qual ele pertence: ");
                    int id = leitura.nextInt();

                    Seller newSeller = new Seller(null, name, email, new Date(), baseSalary, new Department(id, null));
                    sellerDao.insert(newSeller);
                    System.out.println("Inserted! New id = " + newSeller.getId());
                } else if (opcaoCrud == 5) {
                    System.out.println("Digite o ID do seller que você deseja alterar: ");
                    int id = leitura.nextInt();
                    Seller seller = sellerDao.findById(id);

                    System.out.println("Agora, digite o novo nome que ele vai receber: ");
                    String name = leitura.next();
                    seller.setName(name);
                    sellerDao.update(seller);
                    System.out.println("Update Completed!");
                } else if (opcaoCrud == 6) {
                    System.out.println("Enter id for delete test: ");
                    int id = leitura.nextInt();
                    sellerDao.deleteById(id);
                    System.out.println("Delete Completed!");
                } else if (opcaoCrud == 7) {
                    break;
                } else {
                    System.out.println("Número Inválido!");
                }
            }
        } else if(opcaoTable == 2) {
            System.out.println();
        } else {
            System.out.println("Número Inválido!");
        }
    }
}
