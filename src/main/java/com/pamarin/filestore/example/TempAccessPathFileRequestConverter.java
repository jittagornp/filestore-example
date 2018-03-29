/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.AccessPathFileRequestConverterAdapter;
import org.springframework.stereotype.Component;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Component
public class TempAccessPathFileRequestConverter extends AccessPathFileRequestConverterAdapter {

    public static final String PREFIX = "/api/file/temp";

    @Override
    protected String getPrefix() {
        return PREFIX;
    }

}
