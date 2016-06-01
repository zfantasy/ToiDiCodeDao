package noname.toidicodedao.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zfant on 5/25/2016.
 */
public class PostWraper {

    @SerializedName("found")
    @Expose
    private int count;

    @SerializedName("posts")
    @Expose
    private List<Post> postList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
