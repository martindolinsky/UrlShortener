package com.infobip.urlshortener.controller;

import com.infobip.urlshortener.domain.Account;
import com.infobip.urlshortener.domain.SignUpResponse;
import com.infobip.urlshortener.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

  public final AccountService accountService;

  public ResponseEntity<SignUpResponse> createAccount(@RequestBody Account account) {

    return null;
  }

}
