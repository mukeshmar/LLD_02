package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}