package live.mukeshtechlab.factory.assignment.abstractFactoryDocument;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser.DocumentParser;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer.DocumentPrinter;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentType supportsType();
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createDocumentProcessor(String documentName);
}