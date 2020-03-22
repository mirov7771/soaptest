package ru.armirov.springcourse.gates;


import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import org.asynchttpclient.AsyncCompletionHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Response;
import org.springframework.stereotype.Component;

@Component("httptest")
public class HttpTest {

    private final AsyncHttpClient client = Dsl.asyncHttpClient();

    public void callAsync(){
        System.out.println("Start async http");
        String url = "http://37.228.117.30:8009/foodws/v1/fb?method=delorder";
        String field = "orderid";
        String value = "85";
        String json = "{\""+field+"\":\""+value+"\"}";
        HttpHeaders headers = new DefaultHttpHeaders();
        headers.add("Content-Type","application/json");
        headers.add("X-AUTH-TOKEN","B0UYaNBpWbKyV0Wq1Qo1V1ZDwX85afmb");
        client
                .preparePost(url)
                .setBody(json)
                .setHeaders(headers)
                .execute();
        System.out.println("End async http");
    }

}
