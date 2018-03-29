/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.FileHandlerAdapter;
import com.pamarin.filestore.FileManager;
import com.pamarin.filestore.FileUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pamarin.filestore.AccessPathFileRequestConverter;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Controller
@RequestMapping(TempAccessPathFileRequestConverter.PREFIX)
public class TempFileHandlerCtrl extends FileHandlerAdapter {

    @Autowired
    private TempFileManager fileManager;

    @Autowired
    private TempFileUploader fileUploader;
    
    @Autowired
    private TempAccessPathFileRequestConverter accessPathFileRequestConverter;

    @Override
    protected FileManager getFileManager() {
        return fileManager;
    }

    @Override
    protected FileUploader getFileUploader() {
        return fileUploader;
    }

    @Override
    protected String getUserId() {
        return "1";//TODO : may be get value from SecurityContext
    }

    @Override
    protected AccessPathFileRequestConverter getAccessPathFileRequestConverter() {
        return accessPathFileRequestConverter;
    }

}
