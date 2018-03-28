/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.ApiPathFileRequestConverterAdapter;
import org.springframework.stereotype.Component;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Component
public class TempApiPathFileRequestConverter extends ApiPathFileRequestConverterAdapter {

    public static final String API_PREFIX = "/file/temp";

    @Override
    protected String getApiPrefix() {
        return API_PREFIX;
    }

}
