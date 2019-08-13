package com.rt.util;

import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author monkey_lwy@163.com
 * @date 2019-04-10 13:58
 * @desc
 */
@Component
public class PicDownload {

    //微信接口
    @Autowired
    private WxMpService wxMpService;

    /**
     * 根据文件id下载文件
     *
     * @param mediaId 媒体id
     * @throws IOException
     * @throws Exception
     */
    public InputStream getInputStream(String mediaId) throws WxErrorException {
        InputStream is = null;
        String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=" +  wxMpService.getAccessToken()+ "&media_id=" + mediaId; // 根据AccessToken获取media

        try {
            URL urlGet = new URL(url);
            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
            http.setRequestMethod("GET"); // 必须是get方式请求
            http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            http.setDoOutput(true);
            http.setDoInput(true);
            System.setProperty("sun.net.client.defaultConnectTimeout", "30000");// 连接超时30秒
            System.setProperty("sun.net.client.defaultReadTimeout", "30000"); // 读取超时30秒
            http.connect();
            is = http.getInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return is;
    }

    /**
     * 获取下载图片信息（jpg）
     *
     * @param mediaId 文件的id
     * @throws Exception
     */

    public void saveImageToDisk(String mediaId) throws Exception {
        InputStream inputStream = getInputStream(mediaId);
        byte[] data = new byte[1024];
        int len = 0;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("test1.jpg");
            while ((len = inputStream.read(data)) != -1) {
                fileOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
