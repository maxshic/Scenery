package cn.teng520.scenery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;

public class PhotoActivity extends Activity {
    private String[] names;
    private String[] intros;
    private int[] photos;
    private TextView nameTextView;
    private ImageView photoImageView;
    private TextView introTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.photo_activity);
        names=getResources().getStringArray(R.array.photo_names);
        intros=getResources().getStringArray(R.array.intro_names);
        photos=new int[]{
                R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,
                R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10
        };

        int photoIndex=getIntent().getIntExtra("photoIndex",0);
        nameTextView=(TextView)findViewById(R.id.name_text);
        photoImageView=(ImageView)findViewById(R.id.photo_image);
        introTextView=(TextView)findViewById(R.id.intro_text);
        nameTextView.setText(names[photoIndex]);
        photoImageView.setImageResource(photos[photoIndex]);
        introTextView.setText(intros[photoIndex]);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
            return true;
        }else{
            return false;
        }
    }
}
