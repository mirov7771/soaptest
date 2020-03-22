package ru.armirov.springcourse.gates;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class SmsCheckGate {

    private final OkHttpClient httpClient = new OkHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private Map<String, SmsGate> smsGates;

    public void checkOperator(){
        String smsUrl = "https://smsc.ru/sys/info.php?get_operator=1&login=foodbooking&psw=foodyaka-100&phone=+79263932887&fmt=3";
        Request request = new Request.Builder()
                .url(smsUrl)
                .build();
        try(Response response = httpClient.newCall(request).execute()){
            if (response != null){
                String respBody = response.body().string();
                System.out.println(respBody);
                Operator operator = mapper.readValue(respBody, Operator.class);
                String tran = "smsc";
                String text = "test";
                String url = "https://smsc.ru/sys/send.php?login=foodbooking&psw=foodyaka-100&phones=+79645173535&mes=Код для подтверждения 1234&fmt=3";
                if (operator.getOperator().equalsIgnoreCase("мегафон")) {
                    tran = "prostor";
                    url = "http://api.prostor-sms.ru/messages/v2/send/?login=t79778732344&password=666449&phone=+79645173535&text=test";
                }
                SmsGate smsGate = smsGates.get(tran);
                int retInt = smsGate.sendSms(url, httpClient);
                System.out.println(retInt);
                System.out.println(tran);
            }
        } catch (IOException e){
            System.out.println("Error: "+e);
            e.printStackTrace();
        }
    }

    @Getter @Setter
    private static class Operator{
        String country;
        String operator;
        String region;
        String mcc;
        String mnc;
        String tz;
    }

}
