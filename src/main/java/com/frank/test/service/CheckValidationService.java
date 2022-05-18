package com.frank.test.service;

import com.frank.test.dto.CheckResult;
import com.frank.test.dto.UserData;
import com.frank.test.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class CheckValidationService {
    @Autowired
    private List<Validator> validators;

    public LinkedList<CheckResult> validate(UserData request) {
        LinkedList<CheckResult> result = new LinkedList<>();

        validators.forEach(
                validator -> result.add(validator.validate(request))
        );

        return result;
    }
}
