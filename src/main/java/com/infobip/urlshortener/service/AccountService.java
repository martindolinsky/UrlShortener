package com.infobip.urlshortener.service;

import com.infobip.urlshortener.domain.Account;
import com.infobip.urlshortener.domain.SignUpResponse;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

  SignUpResponse createAccount(Account account);
}
