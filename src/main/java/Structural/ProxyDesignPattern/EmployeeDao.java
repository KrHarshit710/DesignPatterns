package Structural.ProxyDesignPattern;

public interface EmployeeDao {
    void add(String client, Employee employee) throws RuntimeException;
    void delete(String client, String employeeId) throws RuntimeException;
    void get(String client, String employeeId) throws RuntimeException;
}
