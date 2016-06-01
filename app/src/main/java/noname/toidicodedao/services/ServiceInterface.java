package noname.toidicodedao.services;

import java.util.List;

import noname.toidicodedao.models.Post;
import noname.toidicodedao.models.PostWraper;
import noname.toidicodedao.models.Site;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by zfant on 5/25/2016.
 */
public interface ServiceInterface {

    // Site id
    static String SITE_ID = "81976675"; // toidicodedao.com

    @GET(SITE_ID)
    Call<Site> getSite();

    @GET(SITE_ID + "/posts")
    Call<PostWraper> getNewest(@Query("number") int number);
}
