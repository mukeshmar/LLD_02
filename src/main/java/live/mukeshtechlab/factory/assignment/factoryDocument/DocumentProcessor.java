package live.mukeshtechlab.factory.assignment.factoryDocument;

public abstract class DocumentProcessor {
    protected String documentName;

    public DocumentProcessor(String documentName){
        this.documentName = documentName;
    }
    public abstract String getDocumentName();
    public abstract void processDocument();
    public abstract DocumentType supportsType();
}