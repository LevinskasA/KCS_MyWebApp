package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Askew on 3/8/2017.
 */
@Path("/")
public class MyFirstRestExample {

    @GET
    @Path("/sayHello")
    public String sayHello() {
        return "Hello, man!";
    }

    @GET
    @Path("/sayHello/{name}")
    public String sayHello(@PathParam("name") String name){
        return "Hello, " + name + "!";
    }
}
