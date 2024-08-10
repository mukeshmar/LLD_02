package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}