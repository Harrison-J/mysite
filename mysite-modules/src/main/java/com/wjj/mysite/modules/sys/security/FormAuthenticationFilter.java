package com.wjj.mysite.modules.sys.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * User: WJJ
 * Date: 2018/1/19/019
 * Time: 11:31
 */
@Service
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {
    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        return super.createToken(request, response);
    }

    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        super.issueSuccessRedirect(request, response);
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        return super.onLoginFailure(token, e, request, response);
    }
}
