package Behavioral.TemplateMethodPattern.FileParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ParserTemplate {

    private static final Logger log = LoggerFactory.getLogger(ParserTemplate.class);

    protected void parse(){
        openFile();
        parseFile();
        closeFile();
    }

    protected void openFile() {
        log.info("Opening file ....");
    }

    private void closeFile() {
        log.info("Closing file ...");
    }

    protected abstract void parseFile();
}
