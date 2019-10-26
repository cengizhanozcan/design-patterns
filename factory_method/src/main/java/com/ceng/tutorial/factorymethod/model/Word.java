package com.ceng.tutorial.factorymethod.model;

/**
 * @author Cengizhan Ozcan
 */
public class Word extends Document {

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.WORD;
    }
}
