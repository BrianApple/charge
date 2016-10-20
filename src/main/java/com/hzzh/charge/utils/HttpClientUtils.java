package com.hzzh.charge.utils;
import org.springframework.web.client.RestTemplate;

/**
 * 测试工具类
 * Created by TaoRan on 2016/9/27.
 */
public class HttpClientUtils {
    //测试地址
    private static final String TEST_URL = "http://localhost:";
    //测试单口号
    private static String  port="8888";

    public static String testUrl(String url, Object object) {
        RestTemplate restTemplate = new RestTemplate();
        String fullUrl = TEST_URL + port + url;
        String result = restTemplate.postForObject(fullUrl, object, String.class);
        return result;
    }

}
