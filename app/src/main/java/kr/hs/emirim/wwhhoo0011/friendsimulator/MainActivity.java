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
        switch(view.getId()){
            case R.id.button1:
                Toast.makeText(this, "5~~~~~사카", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "석순톡 순석톡 카카오톡 에브리바디톡", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "아침에 모닝 콜필수던 내가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "서공예 졸업식 박제", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "요즘 말야 내가 말야 생각이 많아 댓!댓!댓!", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "다시 선택해주세요!", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
