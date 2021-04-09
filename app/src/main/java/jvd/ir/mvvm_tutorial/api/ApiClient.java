package jvd.ir.mvvm_tutorial.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static String endPoint = "http://www.javadcooker.ir/maps/";
    private static Retrofit retrofit;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(endPoint)
                    .build();
        }
        return retrofit;
    }
}
