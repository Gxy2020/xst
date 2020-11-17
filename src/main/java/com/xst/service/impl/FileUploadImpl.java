package com.xst.service.impl;

import com.xst.configuration.property.QnConfig;
import com.xst.configuration.property.SystemConfig;
import com.xst.service.FileUpload;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.security.auth.login.Configuration;
import java.io.InputStream;

/**
 * @author GUO
 * @Classname FileUploadImpl
 * @Description TODO
 * @Date 2020/11/16 21:29
 */
@Service
@AllArgsConstructor
public class FileUploadImpl implements FileUpload {

    private final Logger logger = LoggerFactory.getLogger(FileUpload.class);
    private final SystemConfig systemConfig;

    @Override
    public String uploadFile(InputStream inputStream, long size, String extName) {
//        QnConfig qnConfig = systemConfig.getQn();
//        Configuration cfg = new Configuration(Region.region2());
//        UploadManager uploadManager = new UploadManager(cfg);
//        Auth auth = Auth.create(qnConfig.getAccessKey(), qnConfig.getSecretKey());
//        String upToken = auth.uploadToken(qnConfig.getBucket());
//        try {
//            Response response = uploadManager.put(inputStream, null, upToken, null, null);
//            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
//            return qnConfig.getUrl() + "/" + putRet.key;
//        } catch (QiniuException ex) {
//            logger.error(ex.getMessage(), ex);
//        }
        return null;
    }
}