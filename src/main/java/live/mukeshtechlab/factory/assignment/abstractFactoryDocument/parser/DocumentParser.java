package live.mukeshtechlab.factory.assignment.abstractFactoryDocument.parser;

import live.mukeshtechlab.factory.assignment.abstractFactoryDocument.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}