package com.ceng.tutorial.factorymethod;

import com.ceng.tutorial.factorymethod.model.Document;
import com.ceng.tutorial.factorymethod.model.DocumentType;
import com.ceng.tutorial.factorymethod.service.DocumentFactory;

/**
 * @author Cengizhan Ozcan
 */
public class Main {

    public static void main(String[] args) {
        Document pdfDocument = DocumentFactory.createDocument(DocumentType.PDF);
        Document wordDocument = DocumentFactory.createDocument(DocumentType.WORD);

        System.out.println(pdfDocument.getDocumentType());
        System.out.println(wordDocument.getDocumentType());
    }
}
