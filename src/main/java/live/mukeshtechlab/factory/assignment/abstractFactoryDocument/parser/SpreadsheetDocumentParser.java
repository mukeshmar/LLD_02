package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}