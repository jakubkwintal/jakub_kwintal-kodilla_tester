package com.kodilla.soap.ws;

import com.kodilla.library.soap.GetBookRequest;
import com.kodilla.library.soap.GetBookResponse;
import com.kodilla.soap.repository.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/library/soap";

    private Library library;

    @Autowired
    public LibraryEndpoint(Library library) {
        this.library = library;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(library.findBook(request.getSignature()));

        return response;
    }
}