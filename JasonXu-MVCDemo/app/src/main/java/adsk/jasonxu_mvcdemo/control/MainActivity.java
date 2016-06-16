package adsk.jasonxu_mvcdemo.control;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.VolleyError;

import adsk.jasonxu_mvcdemo.R;
import adsk.jasonxu_mvcdemo.model.WeatherListener;
import adsk.jasonxu_mvcdemo.model.WeatherModel;
import adsk.jasonxu_mvcdemo.model.WeatherModelImpl;

public class MainActivity extends AppCompatActivity implements WeatherListener{

    private Button mSearch;
    private EditText mName;
    private WeatherModel mWeatherModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        initEvents();
    }

    private void initViews(){
        mSearch = (Button)this.findViewById(R.id.btn_search);
        mName = (EditText)this.findViewById(R.id.edt_name);
    }

    private void initEvents(){
        mWeatherModel = new WeatherModelImpl();
        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(mName.getText()+"")) {
                    mWeatherModel.getWeatherInfo(mName.getText().toString(), MainActivity.this);
                }
            }
        });
    }

    @Override
    public void onSuccess(String data) {

    }

    @Override
    public void onFail(VolleyError error) {

    }
}
