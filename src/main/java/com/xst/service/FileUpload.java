package com.xst.service;

import java.io.InputStream;

/**
 * @author GUO
 * @Classname FileUpload
 * @Description TODO
 * @Date 2020/11/16 20:39
 */
public interface FileUpload {
    String uploadFile(InputStream inputStream, long size, String extName);

}
