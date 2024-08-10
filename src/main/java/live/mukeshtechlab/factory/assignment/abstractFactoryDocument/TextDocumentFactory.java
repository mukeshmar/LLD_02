package live.mukeshtechlab.factory.assignment.abstractFactoryDocument;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser.DocumentParser;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser.TextDocumentParser;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer.DocumentPrinter;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.printer.TextDocumentPrinter;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.DocumentProcessor;
import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }
}