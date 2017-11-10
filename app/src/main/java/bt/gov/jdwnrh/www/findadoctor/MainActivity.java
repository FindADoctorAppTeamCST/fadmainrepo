package bt.gov.jdwnrh.www.findadoctor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class   MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.settings_menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.login) {
            startActivity(new Intent(getApplication(), doc_login.class));
            return true;
        }

        if(id == R.id.help) {
            return true;
        }

        if(id == R.id.share_app) {
            return true;
        }

        if(id == R.id.about_us) {
            startActivity(new Intent(getApplication(), AboutUs.class));
            return true;
        }

        if(id == R.id.feedback) {
            startActivity(new Intent(getApplication(), Feedback.class));
            return true;
        }

        if(id == R.id.rate_app) {
            startActivity(new Intent(getApplication(), RateUs.class));
            return true;
        }

        if(id == R.id.more) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //changing page RateUs
    public void Click(View view){
        Intent intent=new Intent(this,RateUs.class);
        startActivity(intent);
    }
    //changing page Feedback
    public void onBtnClick(View view){
        Intent intent=new Intent(this,Feedback.class);
        startActivity(intent);
    }
}
