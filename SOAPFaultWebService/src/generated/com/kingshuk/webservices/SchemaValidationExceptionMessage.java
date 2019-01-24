package com.kingshuk.webservices;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-23T22:53:00.388-06:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "schemaValidationException", targetNamespace = "http://webservices.kingshuk.com/types")
public class SchemaValidationExceptionMessage extends Exception {

    private com.kingshuk.webservices.types.SchemaValidationExceptionType schemaValidationException;

    public SchemaValidationExceptionMessage() {
        super();
    }

    public SchemaValidationExceptionMessage(String message) {
        super(message);
    }

    public SchemaValidationExceptionMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SchemaValidationExceptionMessage(String message, com.kingshuk.webservices.types.SchemaValidationExceptionType schemaValidationException) {
        super(message);
        this.schemaValidationException = schemaValidationException;
    }

    public SchemaValidationExceptionMessage(String message, com.kingshuk.webservices.types.SchemaValidationExceptionType schemaValidationException, java.lang.Throwable cause) {
        super(message, cause);
        this.schemaValidationException = schemaValidationException;
    }

    public com.kingshuk.webservices.types.SchemaValidationExceptionType getFaultInfo() {
        return this.schemaValidationException;
    }
}
