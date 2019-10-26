package com.ceng.tutorial.factorymethod.model;

/**
 * @author Cengizhan Ozcan
 */
public class Pdf extends Document {

    public DocumentType getDocumentType() {
        return DocumentType.PDF;
    }
}
