package ca.kgb.stackoverflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //overflow();
    }
    public void overflow(){
        double something = 1000000000;
        while(something > -1000000000){
            something--;
            overflow();
        }
    }
}
