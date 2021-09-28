package com.dj.pms.service.impl;

import com.dj.pms.service.SystemService;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class SystemServiceImpl implements SystemService {

    @Override
    public void msg(Integer level, String msg) {

    }

    @Override
    public void info(String msg) {
        push(msg);
    }

    @Override
    public void warn(String msg) {
    }

    @Override
    public void error(String msg) {

    }

    @Value("${tag:本地环境}")
    public String tag;


    @Value("${wechat.hook.url}")
    public String url;

    @Async
    public void push(Object msg) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS).build();

        RequestBody body = RequestBody.create("{ \"msgtype\": \"text\", \"text\": { \"content\": \""+tag+" "+(String)msg+"\" } }", MediaType.parse("application/json; charset=utf-8"));

        Request request = new Request.Builder()
                .header("Content-Type", "application/json")
                .url(url)
                .post(body)
                .build();

        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
