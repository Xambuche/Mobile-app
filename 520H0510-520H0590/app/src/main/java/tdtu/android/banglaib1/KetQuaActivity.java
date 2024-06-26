package tdtu.android.banglaib1;

import static tdtu.android.banglaib1.SlideDe1Activity.de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class KetQuaActivity extends AppCompatActivity {
    private int value;
    private TextView text,text2;
    private ImageView anh;
    private Button lamlai,xemketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getInt("causai");
            //The key argument here must match that used in the other activity
        }
        text= (TextView) findViewById(R.id.textketqua3);
        anh= (ImageView) findViewById(R.id.imageView5);
        text2= (TextView) findViewById(R.id.textketqua4);
        if(value==-1)
        {
            text.setText("Không đạt" +"\n"+"vì làm sai câu liệt");
            anh.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_24);
            text2.setText("Học lại nha !!!");
        }
        else if(value>2) {
            text.setText("Không đạt: "+"\n" + (30-value) + "/30 câu");
            anh.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_24);
            text2.setText("Học lại nha !!!");
        }
        else {
            text.setText("Đạt: "+"\n" + (30-value) + "/30 câu");
            anh.setImageResource(R.drawable.ic_baseline_sentiment_very_satisfied_24);
            text2.setText("Chúc mừng !!!");
        }

        lamlai= (Button) findViewById(R.id.button3);
        lamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                backDe1Slide();
            }
        });
        xemketqua=findViewById(R.id.button4);
        xemketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextxemketqua();
            }
        });

        }
        public void backDe1Slide()
        {
            Intent intent;
            intent = new Intent(this,SlideDe1Activity.class);
            intent.putExtra("dethi",de);
            startActivity(intent);
        }
        public void nextxemketqua()
        {
            List<Lythuyet> list = new ArrayList<>();
            Intent intent;
            intent = new Intent(this,XemKetQuaActivity.class);
            Bundle bundle = getIntent().getExtras();
            list = (List<Lythuyet>) bundle.getSerializable("listcausai");
            Bundle bundle1 =new Bundle();
            bundle1.putSerializable("listcausai",(Serializable)list);
            intent.putExtras(bundle1);

            startActivity(intent);
        }



}