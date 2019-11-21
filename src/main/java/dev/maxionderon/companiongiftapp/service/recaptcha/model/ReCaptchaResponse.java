package dev.maxionderon.companiongiftapp.service.recaptcha.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReCaptchaResponse {

    private Boolean success;
    private Date timestamp;
    private String hostname;
    @JsonProperty("error-codes")
    private List<String> errorCodes;

    public Boolean getSuccess() {

        return this.success;

    }

    public Date getTimeStamp() {

        return this.timestamp;

    }

    public String getHostname() {

        return this.hostname;

    }

    public List<String> getErrorCodes() {

        return this.errorCodes;

    }

    public void setSuccess( Boolean success ) {

        this.success = success;

    }

    public void setTimeStamp(Date timestamp ) {

        this.timestamp = timestamp;

    }

    public void setHostname( String hostname ) {

        this.hostname = hostname;

    }

    public void setErrorCodes( List<String> errorCodes ) {

        this.errorCodes = errorCodes;

    }

}