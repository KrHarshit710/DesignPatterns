package Behavioral.TemplateMethodPattern.ReportGenertor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Abstract class defining the template for report generation, enforcing the structure while allowing
// specific implementations for each report type.
@Slf4j
public abstract class ReportTemplate {
    private static final Logger log = LoggerFactory.getLogger(ReportTemplate.class);

    // Template method defining the skeleton of the report generation
    public final void generateReport() {
        gatherData(); // Specific to each report
        processData(); // Specific to each report
        formatReport(); // Common across all reports
        printReport(); // Common across all reports
    }

    // Steps to be implemented by subclasses
    protected abstract void gatherData();
    protected abstract void processData();

    // Default methods that can be common across all reports
    protected void formatReport() {
        log.info("Formatting the report with appropriate layout and style.");
    }

    protected void printReport() {
        log.info("Printing the report for final review and distribution.");
    }
}