package Behavioral.TemplateMethodPattern.ReportGenertor;

// This class represents a Employee Report, gathering and processing employee data.

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeReport extends ReportTemplate {

    @Override
    protected void gatherData() {
        log.info("Gathering Employee data ...");
    }

    @Override
    protected void processData() {
        log.info("Processing Employee data ...");
    }
}
