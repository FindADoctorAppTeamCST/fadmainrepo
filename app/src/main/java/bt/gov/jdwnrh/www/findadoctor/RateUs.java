package bt.gov.jdwnrh.www.findadoctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;


public class RateUs extends AppCompatActivity {
Button btn;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        btn=(Button) findViewById(R.id.button);
        ratingBar = (RatingBar) findViewById(R.id.idratingBar);
    }

    public void onBtnClick(View v){
        float ratingvalue=ratingBar.getRating();
        Intent load= new Intent (Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en"));
        Toast.makeText(getApplicationContext(),"Rating is: "+ratingvalue,Toast.LENGTH_SHORT).show();
        startActivity(load);

    }
}
