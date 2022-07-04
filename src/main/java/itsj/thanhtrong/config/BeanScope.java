package itsj.thanhtrong.config;

import itsj.thanhtrong.application.Message;
import itsj.thanhtrong.request.RequestMessage;
import itsj.thanhtrong.session.SessionMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 10:20
 * Filename : BeanScope
 */
@Configuration
public class BeanScope {
    @Bean
    @ApplicationScope
    public Message applicationScopedBean(){
        return new Message();
    }
    @Bean
    @RequestScope
    public RequestMessage requestScopedBean() {
        return new RequestMessage();
    }
    @Bean
    @SessionScope
    public SessionMessage sessionScopedBean() {
        return new SessionMessage();
    }
}
