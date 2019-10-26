package com.ceng.tutorial.factorymethod.service;

import com.ceng.tutorial.factorymethod.model.Document;
import com.ceng.tutorial.factorymethod.model.DocumentType;
import com.ceng.tutorial.factorymethod.model.Pdf;
import com.ceng.tutorial.factorymethod.model.Word;

/**
 * @author Cengizhan Ozcan
 */
public class DocumentFactory {

    public static Document createDocument(DocumentType documentType) {
        switch (documentType) {
            case PDF:
                return new Pdf();
            case WORD:
                return new Word();
            default:
                throw new RuntimeException("Unsupported DocumentType");
        }
    }

}
