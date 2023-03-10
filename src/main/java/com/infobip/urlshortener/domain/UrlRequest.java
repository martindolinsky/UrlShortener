package com.infobip.urlshortener.domain;

import lombok.Data;

@Data
public class UrlRequest {
  private String url;
  private int redirectType;
}
