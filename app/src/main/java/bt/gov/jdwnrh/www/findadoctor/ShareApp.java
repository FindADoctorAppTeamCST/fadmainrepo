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
        uriString="https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en";
        share.putExtra(Intent.EXTRA_TEXT,uriString);
        share.setPackage("com.facebook.katana");
        startActivity(share);
    }

    public void messShare(View v) {
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        uriString="https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en";
        share.putExtra(Intent.EXTRA_TEXT,uriString);
        share.setPackage("com.facebook.orca");
        startActivity(share);
    }

    public void googleShare(View v) {
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        uriString="https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en";
        share.putExtra(Intent.EXTRA_TEXT,uriString);
        share.setPackage("com.google.android.apps.plus");
        startActivity(share);
    }

    public void hangoutsShare(View v) {
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        uriString="https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en";
        share.putExtra(Intent.EXTRA_TEXT,uriString);
        share.setPackage("com.google.android.talk");
        startActivity(share);
    }

    public void whatsappShare(View v) {
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        uriString="https://play.google.com/store/apps/details?id=com.g2c.jdw&hl=en";
        share.putExtra(Intent.EXTRA_TEXT,uriString);
        share.setPackage("com.whatsapp");
        startActivity(share);
    }
}
