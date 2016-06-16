package asdk.jasonxu_mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import asdk.jasonxu_mvpdemo.R;

public class MainActivity extends AppCompatActivity {

    private EditText cityNOInput;
    private TextView city;
    private TextView cityNO;
    private TextView temp;
    private TextView wd;
    private TextView ws;
    private TextView sd;
    private TextView wse;
    private TextView time;
    private TextView njd;
    private Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();
    }

    private void initViews(){

        cityNOInput = findView(R.id.et_city_no);
        city = findView(R.id.tv_city);
        cityNO = findView(R.id.tv_city_no);
        temp = findView(R.id.tv_temp);
        wd = findView(R.id.tv_WD);
        ws = findView(R.id.tv_WS);
        sd = findView(R.id.tv_SD);
        wse = findView(R.id.tv_WSE);
        time = findView(R.id.tv_time);
        njd = findView(R.id.tv_njd);
        btn_go = findView(R.id.btn_go);

    }

    private void initEvents(){
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private <T extends View> T findView(int id){
        return (T)findViewById(id);
    }
}
