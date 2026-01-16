package Behavioral.TemplateMethodPattern.FileParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsvParser extends ParserTemplate {
    private static final Logger log = LoggerFactory.getLogger(CsvParser.class);
    @Override
    protected void parseFile() {
        log.info("Parsing Json file ...");
    }
}
