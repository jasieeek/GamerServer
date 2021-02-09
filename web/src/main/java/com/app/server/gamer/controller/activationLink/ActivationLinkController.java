package com.app.server.gamer.controller.activationLink;

import com.app.server.gamer.service.activationLink.ActivationLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivationLinkController {

    @Autowired
    private ActivationLinkService activationLinkService;

    @GetMapping(path = "app/activate/{activationLinkContent}")
    public ResponseEntity<?> activateClient(@PathVariable String activationLinkContent){
        activationLinkService.activateUser(activationLinkContent);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
