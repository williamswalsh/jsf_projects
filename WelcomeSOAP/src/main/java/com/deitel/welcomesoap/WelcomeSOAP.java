package com.deitel.welcomesoap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "WelcomeSOAP")
public class WelcomeSOAP {

    @WebMethod(operationName = "welcome")
    public String welcome(@WebParam(name = "name") String name) {
        return "Welcome to JAX-WS web services with SOAP, " + name + " !";
    }
}
