package ru.armirov.springcourse.gates;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import java.io.IOException;

public class CallbackImpl implements Callback {

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        System.out.println(response.body().string());
        response.close();
        System.out.println(Thread.activeCount());
    }

    @Override
    public void onFailure(Call call, IOException e) {
        System.out.println("Error:"+e);
    }
}
