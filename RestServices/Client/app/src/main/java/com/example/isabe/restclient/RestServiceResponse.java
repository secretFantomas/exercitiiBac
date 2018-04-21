package com.example.isabe.restclient;

/**
 * Created by isabe on 21.04.2018.
 */

public class RestServiceResponse {
    boolean errorEncountered;
    String returnMessage;
    String returnError;

    public RestServiceResponse(boolean errorEncountered, String returnMessage, String returnError) {
        this.errorEncountered = errorEncountered;
        this.returnMessage = returnMessage;
        this.returnError = returnError;
    }

    public boolean isErrorEncountered() {
        return errorEncountered;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public String getReturnError() {
        return returnError;
    }
}
