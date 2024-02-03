package com.example.aadinclasscodechallange;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/api")
public class MyResource {
    @GET
    @Path("/endpoint/{value}")
    public Response handleEndpoint(
            @PathParam("value") String pathParamValue,
            @HeaderParam("custom-header1") String customHeader1,
            @HeaderParam("custom-header2") String customHeader2) {

        // Handle the endpoint logic here
        String result = "Path Param Value: " + pathParamValue + "\n"
                + "Custom Header 1: " + customHeader1 + "\n"
                + "Custom Header 2: " + customHeader2;

        return Response.status(Response.Status.OK).entity(result).build();
    }
}
