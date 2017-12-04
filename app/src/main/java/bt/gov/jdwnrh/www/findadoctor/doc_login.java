package bt.gov.jdwnrh.www.findadoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class doc_login extends AppCompatActivity {
    EditText user,pass;
    String username,password;
    Button button;
    private RequestQueue requestQueue;
    private static final String URL = "http://172.23.23.86/fadapp/connect.php";
    private StringRequest request;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_login);
        user=(EditText)findViewById(R.id.editText4);
        pass=(EditText)findViewById(R.id.editText3);
        button=(Button)findViewById(R.id.button);
        requestQueue = Volley.newRequestQueue(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonobject = new JSONObject(response);
                            Intent i=new Intent(getApplication(),DoctorPage.class);
                            i.putExtra("doc_emp_id",user.getText().toString());
                            if(user.length()==0||pass.length()==0) {
                                Toast.makeText(getApplicationContext(),"Please enter User ID or Password",Toast.LENGTH_LONG).show();
                            } else {
                                if (jsonobject.names().get(0).equals("id")) {
                                    Toast.makeText(getApplicationContext(),"Welcome\n"+jsonobject.getString("name"),Toast.LENGTH_LONG).show();
                                    startActivity(i);
                                } else {
                                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put("editText4", user.getText().toString());
                        hashMap.put("editText3", pass.getText().toString());
                        return hashMap;
                    }
                };
                requestQueue.add(request);
            }
        });
    }
}
