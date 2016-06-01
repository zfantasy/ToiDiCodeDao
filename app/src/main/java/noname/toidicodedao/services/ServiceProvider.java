package noname.toidicodedao.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zfant on 5/25/2016.
 */
public class ServiceProvider {
    public static final String BASE_URL = "https://public-api.wordpress.com/rest/v1.1/sites/";

    public static Retrofit instance;

    public static Retrofit getInstance(){
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
