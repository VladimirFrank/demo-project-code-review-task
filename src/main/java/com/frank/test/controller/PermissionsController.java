package com.frank.test.controller;

import com.frank.test.dto.CheckResult;
import com.frank.test.dto.UserData;
import com.frank.test.service.CheckValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {
    private static final Logger log = Logger.getLogger("MainLogger");

    @Autowired
    private CheckValidationService checkValidationService;

    @GetMapping(value = "/validateClient")
    public List<CheckResult> validateUserClient(@RequestBody UserData request) {
        log.info("validateClient(): request = " + request);
        var response = checkValidationService.validate(request);
        log.info("validateClient(): response = " + response);

        return response;
    }
}
