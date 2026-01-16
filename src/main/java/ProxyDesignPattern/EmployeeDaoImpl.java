package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void add(String client, Employee employee) throws RuntimeException{
        // add employee into database
        System.out.println("Employee added");
    }

    @Override
    public void delete(String client, String employeeId) throws RuntimeException{
        // remove employee from database
        System.out.println("Employee removed");
    }

    @Override
    public void get(String client, String employeeId) throws RuntimeException{
        // fetch employee detail from database
        System.out.println("Fetched Employee details");
    }
}
