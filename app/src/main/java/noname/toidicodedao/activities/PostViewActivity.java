package noname.toidicodedao.activities;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import noname.toidicodedao.R;
import noname.toidicodedao.models.Post;
import noname.toidicodedao.utils.Constants;

public class PostViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Post post = (Post) getIntent().getSerializableExtra(Constants.POST_STRING);

        TextView titleTextView = (TextView) findViewById(R.id.post_title);
        titleTextView.setText(Html.fromHtml(post.getTitle()));

        HtmlTextView textView = (HtmlTextView) findViewById(R.id.post_content);
        textView.setHtmlFromString(post.getContent(), new HtmlTextView.RemoteImageGetter());

        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        collapsingToolbar.setTitle(post.getTitle());

        ImageView imageView = (ImageView) findViewById(R.id.post_image);
        Picasso.with(this).load(post.getFeaturedImage())
                .fit()
                .into(imageView);
    }


}
