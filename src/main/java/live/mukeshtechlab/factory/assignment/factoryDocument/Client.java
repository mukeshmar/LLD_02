package live.mukeshtechlab.factory.assignment.factoryDocument;

public class Client {
    public static void main(String[] args) {
        DocumentProcessor documentProcessor = DocumentProcessorFactory.createDocumentProcessor(
                DocumentType.TEXT, "Sample File"
        );
        System.out.println("Document Name: " + documentProcessor.getDocumentName());
        System.out.println("Document Type: " + documentProcessor.supportsType());
    }
}
