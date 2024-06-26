package tdtu.android.banglaib1;

import static tdtu.android.banglaib1.SlideDe1Activity.de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class XemKetQuaActivity extends AppCompatActivity {
    private ListView list;
    private List<Lythuyet> listSai;
    private Button lamlai,quayve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_ket_qua);
        list = (ListView) findViewById(R.id.listView);
        Bundle bundle = getIntent().getExtras();
        listSai=(List<Lythuyet>) bundle.getSerializable("listcausai");
        list.setAdapter(new XemKetQuaAdapter(this,listSai));
        lamlai =(Button) findViewById(R.id.button7);
        lamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quayvelamlai();
            }
        });
        quayve=(Button) findViewById(R.id.button8);
        quayve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quayvechonde();
            }
        });

    }
    public void quayvelamlai()
    {
        Intent intent;
        intent = new Intent(this,SlideDe1Activity.class);
        intent.putExtra("dethi",de);
        startActivity(intent);
    }
    public void quayvechonde()
    {
        Intent intent;
        intent = new Intent(this,ChooseThiActivity.class);
        startActivity(intent);
    }
}