/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.ApiPathFileRequestConverter;
import com.pamarin.filestore.FileManager;
import com.pamarin.filestore.FileUploaderAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Component
public class TempFileUploader extends FileUploaderAdapter {

    @Autowired
    private TempFileManager fileManager;

    @Autowired
    private TempApiPathFileRequestConverter apiPathFileRequestConverter;

    @Override
    protected FileManager getFileManager() {
        return fileManager;
    }

    @Override
    protected String getUserId() {
        return "1";//TODO : may be get value from SecurityContext
    }

    @Override
    protected ApiPathFileRequestConverter getApiPathFileRequestConverter() {
        return apiPathFileRequestConverter;
    }

}
