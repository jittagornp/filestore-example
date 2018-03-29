/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.StorePathFileRequestConverterAdapter;
import org.springframework.stereotype.Component;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/29
 */
@Component
public class TempStorePathFileRequestConverter extends StorePathFileRequestConverterAdapter {

    @Override
    protected String getContextPath() {
        return "/temp";
    }

}
