package cs3750.fall21;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpClient {

    final OkHttpClient client = new OkHttpClient();

    String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            //Log.d("test", "httpClient: " + response.body());
            //Log.d("test", "httpClient to string: " + response.body().string());
            return response.body().string();
        }
    }

    public String insertOrder(Order orderItems) throws IOException {
        String json = new Gson().toJson(orderItems);
        Log.d("test", "json convert: " + json);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), json);

        Request request = new Request.Builder()
                .url("https://cs3750-foodtruck.azurewebsites.net/Control/insertOrder.php")
                .post(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        return response.body().string();
    }

    public String insertOrderItems(Order orderItems) throws IOException {
        String json = new Gson().toJson(orderItems);
        Log.d("test", "json convert: " + json);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), json);

        Request request = new Request.Builder()
                .url("https://cs3750-foodtruck.azurewebsites.net/Control/insertOrderItem.php")
                .post(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        return response.body().string();
    }
}
