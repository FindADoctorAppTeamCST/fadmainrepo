package bt.gov.jdwnrh.www.findadoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShareApp extends AppCompatActivity {
    String uriString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_app);
    }

    public void facebookShare(View v) {
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        uriString="http://www.jdwnrh.gov.bt";
        share.putExtra(Intent.EXTRA_TEXT,uriString);
        share.setPackage("com.facebook.katana");
        startActivity(share);
    }

}
