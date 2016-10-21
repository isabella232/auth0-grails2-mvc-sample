package com.auth0.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@Configuration
@PropertySource("classpath:auth0.properties")
public class Auth0Config {


    @Bean(name = "auth0Filter")
    public Auth0Filter auth0Filter() {
        return new Auth0Filter(this);
    }

    @Value(value = "${auth0.domain}")
    protected String domain;

    @Value(value = "${auth0.issuer}")
    protected String issuer;

    @Value(value = "${auth0.clientId}")
    protected String clientId;

    @Value(value = "${auth0.clientSecret}")
    protected String clientSecret;

    @Value(value = "${auth0.onLogoutRedirectTo}")
    protected String onLogoutRedirectTo;

    @Value(value = "${auth0.loginRedirectOnSuccess}")
    protected String loginRedirectOnSuccess;

    @Value(value = "${auth0.loginRedirectOnFail}")
    protected String loginRedirectOnFail;

    @Value(value = "${auth0.loginCallback}")
    protected String loginCallback;

    /**
     * default to HS256 for backwards compatibility
     */
    @Value(value = "${auth0.signingAlgorithm:HS256}")
    protected String signingAlgorithm;

    /**
     * default to empty string as HS256 is default
     */
    @Value(value = "${auth0.publicKeyPath:}")
    protected String publicKeyPath;


    public String getDomain() {
        return domain;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getOnLogoutRedirectTo() {
        return onLogoutRedirectTo;
    }

    public String getLoginRedirectOnSuccess() {
        return loginRedirectOnSuccess;
    }

    public String getLoginRedirectOnFail() {
        return loginRedirectOnFail;
    }

    public String getLoginCallback() {
        return loginCallback;
    }

    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public String getPublicKeyPath() {
        return publicKeyPath;
    }

}
