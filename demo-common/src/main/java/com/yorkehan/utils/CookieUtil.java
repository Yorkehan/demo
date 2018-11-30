package com.yorkehan.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class CookieUtil {
    public void setUserToken(HttpServletResponse response,String tokenKey,String token){
        Cookie cookie = new Cookie(tokenKey,token);
        cookie.setPath("/");
        cookie.setMaxAge(7200);
        response.addCookie(cookie);
    }
    public String getTocken(HttpServletRequest request,String tokenKey) {
        Cookie[] cookies = request.getCookies();
        String token = null;
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                if (tokenKey.equals(cookie.getName())) {
                    token = cookie.getValue();
                    break;
                }
            }
            return token;
        }
        return null;
    }
}
