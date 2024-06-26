package tdtu.android.banglaib1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MeoActivity extends AppCompatActivity {
    private ImageButton meo1, meo2, meo3, meo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meo);
        meo1 = (ImageButton) findViewById(R.id.imageButton11);
        meo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeo1();
            }
        });
        meo2 = (ImageButton) findViewById(R.id.imageButton13);
        meo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeo2();
            }
        });
        meo3 = (ImageButton) findViewById(R.id.imageButton14);
        meo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeo3();
            }
        });
        meo3 = (ImageButton) findViewById(R.id.imageButton16);
        meo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeo4();
            }
        });


    }

    public void openMeo1() {
        Intent intent;
        intent = new Intent(this, Meo1.class);
        startActivity(intent);
    }

    public void openMeo2() {
        Intent intent;
        intent = new Intent(this, Meo2.class);
        startActivity(intent);
    }

    public void openMeo3() {
        Intent intent;
        intent = new Intent(this, Meo3.class);
        startActivity(intent);
    }

    public void openMeo4() {
        Intent intent;
        intent = new Intent(this, Meo4.class);
        startActivity(intent);
    }
}