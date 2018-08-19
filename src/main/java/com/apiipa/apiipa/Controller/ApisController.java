package com.apiipa.apiipa.Controller;

import com.apiipa.apiipa.Service.ApisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApisController {

    //sudo -u solr ./bin/solr delete -c apis

    @Autowired
    ApisService service;

    @GetMapping("/")
    public String defaultRoute() {
        return service.getApis();
    }
}
