/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.FileManagerAdapter;
import com.pamarin.filestore.StorePathFileRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Component
public class TempFileManager extends FileManagerAdapter {

    @Autowired
    private TempStorePathFileRequestConverter storePathFileRequestConverter;

    @Override
    protected String getRootPath() {
        return "C:\\filestore";
    }

    @Override
    protected StorePathFileRequestConverter getStorePathFileRequestConverter() {
        return storePathFileRequestConverter;
    }

}
