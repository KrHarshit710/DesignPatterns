package Structural.ProxyDesignPattern;

// Structural Design Pattern
public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDao employeeDao;

    public EmployeeDaoProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void add(String client, Employee employee) throws RuntimeException{
        if(client.equals("ADMIN")){
            employeeDao.add(client, employee);
            return;
        }
        throw new RuntimeException("Access denied!!!");
    }

    @Override
    public void delete(String client, String employeeId) throws RuntimeException{
        if(client.equals("ADMIN")){
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new RuntimeException("Access denied!!!");
    }

    @Override
    public void get(String client, String employeeId) throws RuntimeException{
        if(client.equals("ADMIN") || client.equals("USER")){
            employeeDao.get(client, employeeId);
            return;
        }
        throw new RuntimeException("Access denied!!!");
    }
}
