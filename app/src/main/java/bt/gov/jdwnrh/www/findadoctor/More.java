package bt.gov.jdwnrh.www.findadoctor;

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
        Toast.makeText(this,"you are linking to Playstore",Toast.LENGTH_SHORT).show();
    }
    public void onImageClickError(View v){
        Toast.makeText(this,"App development is under process by CST",Toast.LENGTH_SHORT).show();
    }

}

