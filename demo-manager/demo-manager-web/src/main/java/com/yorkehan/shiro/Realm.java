package com.yorkehan.shiro;

import com.yorkehan.pojo.User;
import com.yorkehan.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class Realm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User principal = (User) SecurityUtils.getSubject().getPrincipal();
        return null;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = String.valueOf(token.getPassword());
        User dbuser=userService.getUserByName(username);
        if(dbuser==null){
            throw new UnknownAccountException("No account found [" + username + "]");
        }
        if(password.equals(dbuser.getUserPassword())){
            return new SimpleAuthenticationInfo(dbuser,dbuser.getUserPassword(),getName());
        }
        return null;
    }
}
