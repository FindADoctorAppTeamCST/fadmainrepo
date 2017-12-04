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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class   MainActivity extends AppCompatActivity {
    ImageView den,car,ane,der,ent,gyn,mic,msp,onc,opd,opt,ped,psy,rad,sur;
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
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                startActivity(new Intent(getApplication(),Dialler.class));
            }
        });
        ane=(ImageView)findViewById(R.id.anes);
        den=(ImageView)findViewById(R.id.dent);
        car=(ImageView)findViewById(R.id.card);
        der=(ImageView)findViewById(R.id.derm);
        ent=(ImageView)findViewById(R.id.ent);
        gyn=(ImageView)findViewById(R.id.gyna);
        mic=(ImageView)findViewById(R.id.micr);
        msp=(ImageView)findViewById(R.id.meds);
        onc=(ImageView)findViewById(R.id.onco);
        opd=(ImageView)findViewById(R.id.opd);
        opt=(ImageView)findViewById(R.id.opth);
        ped=(ImageView)findViewById(R.id.pedt);
        psy=(ImageView)findViewById(R.id.psyc);
        rad=(ImageView)findViewById(R.id.radi);
        sur=(ImageView)findViewById(R.id.surg);
        Intent i=new Intent(getApplication(),Cardiologist.class);
        den.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        ane.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),Anesthesiology.class);
                startActivity(i);
            }
        });
        der.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        ent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        gyn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        mic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        msp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        onc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        opd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        opt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        ped.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        psy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        rad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        sur.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Under Development. Coming soon...",Toast.LENGTH_LONG).show();
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),Cardiologist.class);
                startActivity(i);
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
        if (id == R.id.news) {
            startActivity(new Intent(getApplication(), Notification.class));
            return true;
        }

        if (id == R.id.login) {
            startActivity(new Intent(getApplication(), doc_login.class));
            return true;
        }

        if(id == R.id.about_us) {
            startActivity(new Intent(getApplication(), AboutUs.class));
            return true;
        }

        if(id == R.id.help) {
            startActivity(new Intent(getApplication(), Help.class));
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

        if(id == R.id.share_app) {
            startActivity(new Intent(getApplication(), ShareApp.class));
            return true;
        }

        if(id == R.id.more) {
            startActivity(new Intent(getApplication(), More.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
