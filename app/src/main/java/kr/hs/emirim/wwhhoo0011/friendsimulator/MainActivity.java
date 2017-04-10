package kr.hs.emirim.wwhhoo0011.friendsimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "이석민";
    private ImageView mimageViewFreindVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        mimageViewFreindVisual=(ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG,"activity_main 레이아웃 세팅");
    }
    void onClick(View view){
        Log.d(TAG,"onClick 메소드 호출");
        Log.d(TAG,"클릭된 뷰 ");
        switch(view.getId()){
            case R.id.button1:
                Log.d(TAG,"버튼1클릭");
                Toast.makeText(this, "5~~~~~사카", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(TAG,"버튼2 클릭");
                Toast.makeText(this, "석순톡 순석톡 카카오톡 에브리바디톡", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG,"버튼3 클릭");
                Toast.makeText(this, "아침에 모닝 콜필수던 내가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Log.e(TAG,"버튼 잘못 클릭");
                Toast.makeText(this, "요즘 말야 내가 말야 생각이 많아 댓!댓!댓!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Log.d(TAG,"버튼5클릭");
                Toast.makeText(this, "서공예 졸업식 박제", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "다시 선택하세요", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
