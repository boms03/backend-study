package org.delivery.api.account;

import lombok.RequiredArgsConstructor;
import org.delivery.api.account.model.AccountResponse;
import org.delivery.api.common.api.Api;
import org.delivery.api.common.error.UserErrorCode;
import org.delivery.db.account.AccountEntity;
import org.delivery.db.account.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountApiController {
    private final AccountRepository accountRepository;
    @GetMapping("")
    public Api<AccountResponse> save(){
        var response = AccountResponse.builder()
                .name("유범수")
                .email("hi@gmail.com")
                .registeredAt(LocalDateTime.now())
                .build();
        var str = "안녕";
        var age = Integer.parseInt(str);

        return Api.OK(response);
    }
}
