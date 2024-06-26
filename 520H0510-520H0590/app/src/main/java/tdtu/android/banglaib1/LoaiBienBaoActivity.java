package tdtu.android.banglaib1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoaiBienBaoActivity extends AppCompatActivity {
    private ImageView a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loai_bien_bao);
        a= (ImageView) findViewById(R.id.imageView);
        b= (ImageView) findViewById(R.id.imageView2);
        c= (ImageView) findViewById(R.id.imageView4);
        d= (ImageView) findViewById(R.id.imageView5);
        e= (ImageView) findViewById(R.id.imageView6);
        f= (ImageView) findViewById(R.id.imageView7);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencam();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openchidan();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhieulenh();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvachkeduong();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencaotoc();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennguyhiem();
            }
        });

    }
    public void opencam(){
        Intent intent;
        intent = new Intent(this,ShowBienBaoActivity.class);
        intent.putExtra("key","cam");
        startActivity(intent);

    }
    public void openchidan(){
        Intent intent;
        intent = new Intent(this,ShowBienBaoActivity.class);
        intent.putExtra("key","chidan");
        startActivity(intent);

    }
    public void openhieulenh(){
        Intent intent;
        intent = new Intent(this,ShowBienBaoActivity.class);
        intent.putExtra("key","hieulenh");
        startActivity(intent);

    }
    public void openvachkeduong(){
        Intent intent;
        intent = new Intent(this,ShowBienBaoActivity.class);
        intent.putExtra("key","keduong");
        startActivity(intent);

    }
    public void opencaotoc(){
        Intent intent;
        intent = new Intent(this,ShowBienBaoActivity.class);
        intent.putExtra("key","caotoc");
        startActivity(intent);

    }
    public void opennguyhiem(){
        Intent intent;
        intent = new Intent(this,ShowBienBaoActivity.class);
        intent.putExtra("key","nguyhiem");
        startActivity(intent);

    }


}