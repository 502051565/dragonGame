package com.rt.common.oss.impl;

import com.aliyun.oss.OSSClient;
import com.rt.common.oss.CloudStorageProperties;
import com.rt.common.oss.CloudStorageService;
import com.rt.common.oss.OssException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @ClassName: AliyunCloudStorageService
 * @Description: 阿里云存储
 * @author: <a href="edeis@163.com">edeis</a>
 * @version: V1.0.0
 * @date: 2017-8-1
 */
public class AliyunCloudStorageService extends CloudStorageService {
    private OSSClient client;

    public AliyunCloudStorageService(CloudStorageProperties config){
        this.config = config;

        //初始化
        init();
    }

    private void init(){
        client = new OSSClient(config.getEndPoint(), config.getAccessKey(),
                config.getSecretKey());
    }

    @Override
    public String upload(byte[] data, String path) {
        return upload(new ByteArrayInputStream(data), path);
    }

    @Override
    public String upload(InputStream inputStream, String path) {
        try {
            client.putObject(config.getBucketName(), path, inputStream);
        } catch (Exception e){
            throw new OssException("上传文件失败，请检查配置信息", e);
        }

        return config.getDomain() + "/" + path;
    }

    @Override
    public String upload(byte[] data) {
        return upload(data, getPath(config.getPrefix()));
    }

    @Override
    public String upload(InputStream inputStream) {
        return upload(inputStream, getPath(config.getPrefix()));
    }
}
