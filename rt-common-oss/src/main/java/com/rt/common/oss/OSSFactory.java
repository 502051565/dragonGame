package com.rt.common.oss;

import com.rt.common.oss.impl.AliyunCloudStorageService;
import com.rt.common.oss.impl.QcloudCloudStorageService;
import com.rt.common.oss.impl.QiniuCloudStorageService;

/**
 * @ClassName: OSSFactory
 * @Description: 文件上传Factory
 * @author: <a href="edeis@163.com">edeis</a>
 * @version: V1.0.0
 * @date: 2017-8-1
 */
public  class OSSFactory {

    public static CloudStorageService build(CloudStorageProperties config){

        if(config.getType() == CloudServerType.QINIU.getValue()){
            return new QiniuCloudStorageService(config);
        }else if(config.getType() == CloudServerType.ALIYUN.getValue()){
            return new AliyunCloudStorageService(config);
        }else if(config.getType() == CloudServerType.QCLOUD.getValue()){
            return new QcloudCloudStorageService(config);
        }

        return null;
    }

}
