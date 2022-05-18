package com.frank.test.gateway;

import com.frank.test.dto.Account;

import java.util.List;

@FeignClient(
        name = "AccountsGateway",
        url = "\${accounts-api.url}"
)
public interface AccountsGateway {
    @GetMapping("/{organizationId}")
    List<Account> getAccounts(@PathVariable String organizationId);
}
