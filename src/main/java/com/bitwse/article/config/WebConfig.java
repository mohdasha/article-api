package com.bitwse.article.config;

import com.bitwse.article.annotation.ArticleArgumentResolver;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.BeanResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

//@Configuration
//public class WebConfig implements WebMvcConfigurer, ApplicationContextAware {
//    private BeanResolver beanResolver;
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//        ArticleArgumentResolver articleArgumentResolver = new ArticleArgumentResolver();
//        articleArgumentResolver.
//        resolvers.add(new ArticleArgumentResolver());
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        beanResolver = new BeanFactoryResolver(applicationContext.getAutowireCapableBeanFactory());
//    }
//}
