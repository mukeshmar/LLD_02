package live.mukeshtechlab.factory.assignment.abstractFactoryDocument;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser.DocumentParser;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser.SpreadsheetDocumentParser;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer.DocumentPrinter;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer.SpreadsheetDocumentPrinter;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.DocumentProcessor;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }
}