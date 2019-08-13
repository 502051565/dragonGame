package com.rt.common.oss;

/**
 * Created with IntelliJ IDEA.
 *
 * @author <a href="edeis@163.com">edeis</a>
 * @version V1.0.0
 * @date 2017-8-1
 */
public enum  CloudServerType {
    /**
     * 七牛云
     */
    QINIU(1),
    /**
     * 阿里云
     */
    ALIYUN(2),
    /**
     * 腾讯云
     */
    QCLOUD(3);

    private int value;

    private CloudServerType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
