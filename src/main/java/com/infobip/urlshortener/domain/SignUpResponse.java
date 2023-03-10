package com.infobip.urlshortener.domain;

import lombok.Data;

@Data
public class SignUpResponse {
  private boolean success;
  private String description;
  private String password;
}
