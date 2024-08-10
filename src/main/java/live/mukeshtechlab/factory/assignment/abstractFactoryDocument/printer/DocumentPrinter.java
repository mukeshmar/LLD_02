package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}