package Behavioral.TemplateMethodPattern.FileParser;

public class Client {
    public static void main(String[] args) {
        ParserTemplate csvParser = new CsvParser();
        csvParser.parse();

        ParserTemplate jsonParser = new JsonParser();
        jsonParser.parse();
    }
}
