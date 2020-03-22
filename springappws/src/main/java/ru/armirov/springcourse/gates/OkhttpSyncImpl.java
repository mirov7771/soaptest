package ru.armirov.springcourse.gates;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component("okhttpsync")
public class OkhttpSyncImpl implements OkhttpInterface {

    private final OkHttpClient httpClient = new OkHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void call(){
        System.out.println("Start sync call");
        String url = "http://37.228.117.30:8009/foodws/v1/fb?method=points";
        Request request = new Request.Builder()
                .url(url)
                .get()
                .header("X-AUTH-TOKEN", "B0UYaNBpWbKyV0Wq1Qo1V1ZDwX85afmb")
                .build();
        try(Response response = httpClient.newCall(request).execute()){
            if (response != null){
                ResponseBody body = response.body();
                String answer = body.string();
                List<Map<String, Object>> list = mapper.readValue(answer, List.class);
                Map<String, Object> map = list.get(0);
                Iterator<Map.Entry<String, Object>> entries = map.entrySet().iterator();
                while (entries.hasNext()){
                    Map.Entry<String, Object> item = entries.next();
                    System.out.println("Key: "+item.getKey()+" Value: "+item.getValue());
                }
            }
        } catch (IOException e){
            System.out.println("Error "+e);
            e.printStackTrace();
        }
        System.out.println("End sync call");
    }

}
