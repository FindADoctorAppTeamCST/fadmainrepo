package bt.gov.jdwnrh.www.findadoctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import  android.widget.Toast;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

    }

    public void onImageClick(View v){
        Intent download= new Intent (Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en"));
        Toast.makeText(this,"You are linking to Playstore",Toast.LENGTH_SHORT).show();
        startActivity(download);
    }
    public void onImageClickError(View v){
        Toast.makeText(this,"App development is under process by CST",Toast.LENGTH_SHORT).show();
    }

}

