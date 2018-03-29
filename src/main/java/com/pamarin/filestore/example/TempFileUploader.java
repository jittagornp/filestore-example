/*
 * Copyright 2018 Pamarin.com
 */
package com.pamarin.filestore.example;

import com.pamarin.filestore.FileManager;
import com.pamarin.filestore.FileUploaderAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.pamarin.filestore.AccessPathFileRequestConverter;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/03/28
 */
@Component
public class TempFileUploader extends FileUploaderAdapter {

    @Autowired
    private TempFileManager fileManager;

    @Autowired
    private TempAccessPathFileRequestConverter accessPathFileRequestConverter;

    @Override
    public FileManager getFileManager() {
        return fileManager;
    }

    @Override
    public AccessPathFileRequestConverter getAccessPathFileRequestConverter() {
        return accessPathFileRequestConverter;
    }
}
