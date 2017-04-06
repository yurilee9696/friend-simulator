package kr.hs.emirim.wwhhoo0011.friendsimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onClick(View view){
        Toast.makeText(this, "5~~~~~사카", Toast.LENGTH_SHORT).show();
    }
}
