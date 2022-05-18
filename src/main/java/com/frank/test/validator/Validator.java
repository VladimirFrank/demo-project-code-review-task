package com.frank.test.validator;

import com.frank.test.dto.CheckResult;
import com.frank.test.dto.UserData;

public interface Validator {
    CheckResult validate(UserData request);
}
