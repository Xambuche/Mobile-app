package tdtu.android.banglaib1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class De1Activity extends AppCompatActivity {
    private Button button;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de1);
        button = findViewById(R.id.button2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("dethi");
            //The key argument here must match that used in the other activity
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSlidede1();
            }
        });

    }
    public void openSlidede1()
    {
        Intent intent;
        intent = new Intent(this,SlideDe1Activity.class);
        intent.putExtra("dethi",value);
        startActivity(intent);
    }

}