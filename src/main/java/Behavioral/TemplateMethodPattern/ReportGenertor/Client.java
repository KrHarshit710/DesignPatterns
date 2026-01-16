package Behavioral.TemplateMethodPattern.ReportGenertor;

public class Client {
    public static void main(String[] args) {
        // Generate Sales Report
        ReportTemplate salesReport = new SalesReport();

        // TODO: Generate the Sales Report by calling the generateReport() method.
        salesReport.generateReport();

        // Generate Employee Report
        ReportTemplate employeeReport = new EmployeeReport();

        // TODO: Generate the Employee Report by calling the generateReport() method.
        salesReport.generateReport();
    }
}
