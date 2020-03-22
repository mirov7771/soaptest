package ru.armirov.springcourse.gates;

import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("okhttpasync")
public class OkhttpAsyncImpl implements OkhttpInterface {

    private final OkHttpClient httpClient = new OkHttpClient();

    @Override
    public void call() {
        System.out.println("Start async call");
        String url = "http://37.228.117.30:8009/foodws/v1/fb?method=delorder";
        String field = "orderid";
        String value = "84";
        String json = "{\""+field+"\":\""+value+"\"}";
        System.out.println("body: "+json);
        RequestBody body = RequestBody.create(MediaType.parse("application/json"),json);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .header("X-AUTH-TOKEN", "B0UYaNBpWbKyV0Wq1Qo1V1ZDwX85afmb")
                .build();

        httpClient.newCall(request).enqueue(new CallbackImpl());
        System.out.println("End async call");
    }
}
