package noname.toidicodedao.adapters;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import noname.toidicodedao.R;
import noname.toidicodedao.activities.PostViewActivity;
import noname.toidicodedao.models.Post;
import noname.toidicodedao.utils.Constants;

/**
 * Created by zfant on 5/25/2016.
 */
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {


    private List<Post> postList;

    private Context context;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }

        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.card_post_review, parent, false);

        return new PostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        final Post post = postList.get(position);
        Picasso.with(context).load(post.getFeaturedImage())
                .fit()
//                .resize(200,300)
                .centerInside()
                .into(holder.img);
        holder.title.setText(Html.fromHtml(post.getTitle()));
        holder.date.setText(DateUtils.getRelativeTimeSpanString(post.getDate().getTime(),
                System.currentTimeMillis(), DateUtils.DAY_IN_MILLIS));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PostViewActivity.class);
                Bundle extra = new Bundle();
                extra.putSerializable(Constants.POST_STRING, post);
                intent.putExtras(extra);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        protected CardView cardView;
        protected ImageView img;
        protected TextView title;
        protected TextView date;

        public PostViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            img = (ImageView) itemView.findViewById(R.id.post_img);
            title = (TextView) itemView.findViewById(R.id.post_title);
            date = (TextView) itemView.findViewById(R.id.post_date);
        }
    }

}

