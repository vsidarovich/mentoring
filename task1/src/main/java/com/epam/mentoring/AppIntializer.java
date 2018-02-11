package com.epam.mentoring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
import org.springframework.web.server.adapter.AbstractReactiveWebInitializer;

public class AppIntializer extends AbstractReactiveWebInitializer {

    //new AnnotationConfigApplicationContext(Class<> ...) includes an extra refresh action.
    @Override
    protected ApplicationContext createApplicationContext() {
        Class<?>[] configClasses = getConfigClasses();
        Assert.notEmpty(configClasses, "No Spring configuration provided.");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClasses);
        return context;
    }

    @Override
    protected Class<?>[] getConfigClasses() {
        /*return new Class[]{
                WebConfig.class,
                SecurityConfig.class
        };*/
        return null;
    }

}