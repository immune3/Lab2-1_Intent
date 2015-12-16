package embedded.kookmin.ac.kr.lab2_1_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent in = this.getIntent();

        // getStringExtra는 putExtra로 넣어준 "name"이라는 key를통해 "kookmin"이라는 value를 찾음
        Toast.makeText(this.getApplicationContext(), "name : "+ in.getStringExtra("name"), Toast.LENGTH_LONG ).show();

    }
}