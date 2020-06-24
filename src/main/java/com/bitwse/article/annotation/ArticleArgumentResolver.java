package com.bitwse.article.annotation;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.annotation.Annotation;

public class ArticleArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
       return findParameterAnnotation(Article.class, parameter) != null;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        com.bitwse.article.domain.Article article = new com.bitwse.article.domain.Article();
        article.setTitle("Hello World");
        return article;
    }

    private <T extends Annotation> T findParameterAnnotation(Class<T> annotationClass, MethodParameter parameter) {
        T parameterAnnotation = parameter.getParameterAnnotation(annotationClass);
        if (parameterAnnotation != null)
            return parameterAnnotation;
        System.out.println("Annotation not found");
        return null;
    }
}
