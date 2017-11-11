package bt.gov.jdwnrh.www.findadoctor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dialler extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialler);
        }

    public void btnCall(View view) {
        Intent intent=new Intent(Intent.ACTION_DIAL);
        String num1="+97517804011";
        intent.setData(Uri.parse("tel:"+num1));
        startActivity(intent);
    }

    public void play(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en"));
        startActivity(intent);
    }
}
