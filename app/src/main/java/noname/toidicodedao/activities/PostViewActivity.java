package noname.toidicodedao.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import org.sufficientlysecure.htmltextview.HtmlTextView;
import org.w3c.dom.Text;

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

        Post post = (Post) getIntent().getSerializableExtra(Constants.POST_STRING);

        TextView titleTextView = (TextView) findViewById(R.id.post_title);
        titleTextView.setText(post.getTitle());

        HtmlTextView textView = (HtmlTextView ) findViewById(R.id.post_content);
        textView.setHtmlFromString(post.getContent(), new HtmlTextView.RemoteImageGetter());
    }


}
