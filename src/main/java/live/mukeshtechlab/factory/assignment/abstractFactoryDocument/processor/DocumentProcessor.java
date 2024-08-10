package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.processor;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}