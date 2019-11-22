package dev.maxionderon.companiongiftapp.service.recaptcha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import dev.maxionderon.companiongiftapp.service.recaptcha.model.ReCaptchaResponse;

@Service
public class ReCaptchaService {

    private String googleRecaptchaURL = "https://www.google.com/recaptcha/api/siteverify";

    @Value("${google.recaptcha.secret}")
    private String reCaptchaSecret;

    public boolean validateRequestViaReCaptcha(String reCaptchaResponse) {

        RestTemplate restTemplate = new RestTemplate();

        LinkedMultiValueMap<String, String> requestMap = new LinkedMultiValueMap<>();

        requestMap.add("secret", this.reCaptchaSecret);
        requestMap.add("response", reCaptchaResponse);

        ReCaptchaResponse validationReCaptchaResponse = restTemplate.postForObject(this.googleRecaptchaURL, requestMap, ReCaptchaResponse.class);

        if( validationReCaptchaResponse == null) {

            return false;

        }
        
        if( validationReCaptchaResponse.getSuccess() == true ) {

            return true;

        } else {

            return false;

        }

    }

}