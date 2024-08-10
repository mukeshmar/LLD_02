package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}