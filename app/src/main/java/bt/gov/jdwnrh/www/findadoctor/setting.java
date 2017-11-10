package bt.gov.jdwnrh.www.findadoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class setting extends AppCompatActivity {
    private Button btn,bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btn=(Button)findViewById(R.id.bt2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(setting.this,Help.class);
                startActivity(intent);
            }
        });
        bt1=(Button)findViewById(R.id.bt3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(setting.this,feature.class);
                startActivity(intent);
            }
        });
    }


}
