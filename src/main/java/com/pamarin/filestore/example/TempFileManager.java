/*
 * Copyright 2018 Pamarin.com
 */

package com.pamarin.filestore.example;

import com.pamarin.filestore.FileManagerAdapter;
import org.springframework.stereotype.Component;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt;  
 * create : 2018/03/28
 */
@Component
public class TempFileManager extends FileManagerAdapter{

    @Override
    protected String getRootPath() {
        return "C:\\temp\\filestore";
    }

}
