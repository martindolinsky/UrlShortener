package com.infobip.urlshortener.service;

import com.infobip.urlshortener.domain.UrlRequest;
import com.infobip.urlshortener.domain.UrlResponse;
import java.util.HashMap;

public interface UrlService {

  UrlResponse registerUrl(UrlRequest urlRequest);

  HashMap<String, Integer> getStatistics();

}
