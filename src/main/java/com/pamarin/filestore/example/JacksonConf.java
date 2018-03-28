/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Configuration
public class JacksonConf implements Jackson2ObjectMapperBuilderCustomizer {

    @Autowired
    private JacksonJava8DateTimeConf jacksonJava8DateTimeConf;

    @Override
    public void customize(Jackson2ObjectMapperBuilder builder) {
        jacksonJava8DateTimeConf.customize(builder);
    }

}
