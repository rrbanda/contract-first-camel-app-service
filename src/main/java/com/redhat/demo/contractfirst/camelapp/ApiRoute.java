package com.redhat.demo.contractfirst.camelapp;

import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

@ApplicationScoped
public class ApiRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration().bindingMode(RestBindingMode.json)
                .bindingPackageScan("com.redhat.demo.contractfirst.camelapp");
        
        
        rest().openApi().specification("openapi-api.json").missingOperation("ignore");
        

        
    }
}
