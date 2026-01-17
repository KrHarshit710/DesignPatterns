package Structural.ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {

        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
            employeeDao.add("ADMIN", new Employee("12345", "Harshit", 1000000));
            employeeDao.get("ADMIN", "12345");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
