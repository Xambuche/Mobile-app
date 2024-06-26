package tdtu.android.banglaib1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShowBienBaoActivity extends AppCompatActivity {
    private TextView text;
    private ImageView image;
    private String value;
    private List<Bienbao> mData;
    private DataHelper mDbHelper;
    private Bienbao now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bien_bao);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
            //The key argument here must match that used in the other activity
        }
            if(value.equals("cam")) {
                mDbHelper = new DataHelper(this);
                mDbHelper.createDefaultBienbao();
                mData = mDbHelper.getAllBienBao();
                for (Bienbao b:mData
                     ) {
                    if(b.getLoai().equals("cam"))
                    {
                        now=b;
                        break;
                    }

                }
                text= (TextView) findViewById(R.id.textView44);
                text.setText(now.getNoidung());
                image=(ImageView) findViewById(R.id.imageView8);
                String src = now.getHinh();
                int drawableId = this.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
                image.setImageResource(drawableId);
            }
            if(value.equals("chidan")) {
                mDbHelper = new DataHelper(this);
                mDbHelper.createDefaultBienbao();
                mData = mDbHelper.getAllBienBao();
                for (Bienbao b:mData
                ) {
                    if(b.getLoai().equals("chi"))
                    {
                        now=b;
                        break;
                    }

                }
                text= (TextView) findViewById(R.id.textView44);
                text.setText(now.getNoidung());
                image=(ImageView) findViewById(R.id.imageView8);
                String src = now.getHinh();
                int drawableId = this.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
                image.setImageResource(drawableId);
            }
            else if(value.equals("hieulenh")) {
                mDbHelper = new DataHelper(this);
                mDbHelper.createDefaultBienbao();
                mData = mDbHelper.getAllBienBao();
                for (Bienbao b:mData
                ) {
                    if(b.getLoai().equals("lenh"))
                    {
                        now=b;
                        break;
                    }

                }
                text= (TextView) findViewById(R.id.textView44);
                text.setText(now.getNoidung());
                image=(ImageView) findViewById(R.id.imageView8);
                String src = now.getHinh();
                int drawableId = this.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
                image.setImageResource(drawableId);
            }
            else if(value.equals("keduong")) {
                mDbHelper = new DataHelper(this);
                mDbHelper.createDefaultBienbao();
                mData = mDbHelper.getAllBienBao();
                for (Bienbao b:mData
                ) {
                    if(b.getLoai().equals("duong"))
                    {
                        now=b;
                        break;
                    }

                }
                text= (TextView) findViewById(R.id.textView44);
                text.setText(now.getNoidung());
                image=(ImageView) findViewById(R.id.imageView8);
                String src = now.getHinh();
                int drawableId = this.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
                image.setImageResource(drawableId);
            }
            else if(value.equals("caotoc")) {
                mDbHelper = new DataHelper(this);
                mDbHelper.createDefaultBienbao();
                mData = mDbHelper.getAllBienBao();
                for (Bienbao b:mData
                ) {
                    if(b.getLoai().equals("cao"))
                    {
                        now=b;
                        break;
                    }

                }
                text= (TextView) findViewById(R.id.textView44);
                text.setText(now.getNoidung());
                image=(ImageView) findViewById(R.id.imageView8);
                String src = now.getHinh();
                int drawableId = this.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
                image.setImageResource(drawableId);
            }
            else if(value.equals("nguyhiem")) {
                mDbHelper = new DataHelper(this);
                mDbHelper.createDefaultBienbao();
                mData = mDbHelper.getAllBienBao();
                for (Bienbao b:mData
                ) {
                    if(b.getLoai().equals("nguy"))
                    {
                        now=b;
                        break;
                    }

                }
                text= (TextView) findViewById(R.id.textView44);
                text.setText(now.getNoidung());
                image=(ImageView) findViewById(R.id.imageView8);
                String src = now.getHinh();
                int drawableId = this.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
                image.setImageResource(drawableId);
            }



    }
}