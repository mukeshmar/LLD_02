package live.mukeshtechlab.factory.assignment.factoryDocument;

public class DocumentProcessorFactory {
    public static DocumentProcessor createDocumentProcessor(DocumentType documentType, String documentName){
        if(documentType.equals(DocumentType.PRESENTATION)){
            return new PresentationDocumentProcessor(documentName);
        }
        else if (documentType.equals(DocumentType.SPREAD_SHEET)){
            return new SpreadsheetDocumentProcessor(documentName);
        }
        else if (documentType.equals(DocumentType.TEXT)){
            return new TextDocumentProcessor(documentName);
        }
        return null;
    }
}