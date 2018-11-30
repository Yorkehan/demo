package com.yorkehan.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

        // all other paths require a logged in user
        Map<String, String> filterChainDefinitionMap = chainDefinition.getFilterChainMap();
        filterChainDefinitionMap.put("/**", "anon");
        filterChainDefinitionMap.put("/login", "anon");
        return chainDefinition;
    }
    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager(myRealm());
        return defaultWebSecurityManager;
    }

    @Bean
    public Realm myRealm() {
        Realm myRealm = new Realm();
        return myRealm;
    }


}
