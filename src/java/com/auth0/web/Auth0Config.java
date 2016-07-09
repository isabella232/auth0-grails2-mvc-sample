package com.auth0.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * Holds the default configuration for the library
 * Taken from properties files
 * <p>
 * Also initialises the Filter Servlet (Auth0Filter) for
 * secured URL endpoint interception
 */
@Component
@Configuration
public class Auth0Config {


    public Auth0Config() {
        this.setDomain("{DOMAIN}");
        this.setClientId("{CLIENT_ID}");
        this.setClientSecret("{CLIENT_SECRET}");
        this.setOnLogoutRedirectTo("/login");
        this.setSecuredRoute("/portal/*");
        this.setLoginCallback("/callback");
        this.setLoginRedirectOnSuccess("/portal/home");
        this.setLoginRedirectOnFail("/login");
        this.setServletFilterEnabled(true);
    }


    private String clientId;
    private String clientSecret;
    private String domain;
    private String onLogoutRedirectTo;
    private String loginRedirectOnSuccess;
    private String loginRedirectOnFail;
    private String loginCallback;
    private Boolean servletFilterEnabled;

    private String securedRoute;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getOnLogoutRedirectTo() {
        return onLogoutRedirectTo;
    }

    public void setOnLogoutRedirectTo(String onLogoutRedirectTo) {
        this.onLogoutRedirectTo = onLogoutRedirectTo;
    }

    public String getLoginRedirectOnSuccess() {
        return loginRedirectOnSuccess;
    }

    public void setLoginRedirectOnSuccess(String loginRedirectOnSuccess) {
        this.loginRedirectOnSuccess = loginRedirectOnSuccess;
    }

    public String getLoginRedirectOnFail() {
        return loginRedirectOnFail;
    }

    public void setLoginRedirectOnFail(String loginRedirectOnFail) {
        this.loginRedirectOnFail = loginRedirectOnFail;
    }

    public String getSecuredRoute() {
        return securedRoute;
    }

    public void setSecuredRoute(String securedRoute) {
        this.securedRoute = securedRoute;
    }

    public String getLoginCallback() {
        return loginCallback;
    }

    public void setLoginCallback(String loginCallback) {
        this.loginCallback = loginCallback;
    }

    public Boolean getServletFilterEnabled() {
        return servletFilterEnabled;
    }

    public void setServletFilterEnabled(Boolean servletFilterEnabled) {
        this.servletFilterEnabled = servletFilterEnabled;
    }
}

