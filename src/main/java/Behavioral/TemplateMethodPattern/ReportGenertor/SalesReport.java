package Behavioral.TemplateMethodPattern.ReportGenertor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This class represents a Sales Report, gathering and processing sales data.
public class SalesReport extends ReportTemplate {

    private static final Logger log = LoggerFactory.getLogger(SalesReport.class);

    @Override
    protected void gatherData() {
        log.info("Gathering Sales data ...");
    }

    @Override
    protected void processData() {
        log.info("Processing Sales data ...");
    }
}
