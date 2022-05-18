package com.frank.test.validator;

import com.frank.test.dto.CheckResult;
import com.frank.test.dto.UserData;
import com.frank.test.gateway.AccountsGateway;

@Component
public class AllAccountsAccessValidatorImpl implements Validator {
    private final AccountsGateway accountsGateway;

    public AllAccountsAccessValidatorImpl(AccountsGateway accountGateway) {
        this.accountsGateway = accountGateway;
    }

    @Override
    public CheckResult validate(UserData request) {
        var accounts = accountsGateway.getAccounts(request.getOrganizationId());

        for (var account : accounts) {
            if (account.getPermittedUsers().contains(request.getUserId())) {
                return new CheckResult(
                        CheckResult.Status.ERROR,
                        "user has not permissions for account " + account.getNumber()
                );
            }
        }

        return new CheckResult(CheckResult.Status.OK);
    }
}
