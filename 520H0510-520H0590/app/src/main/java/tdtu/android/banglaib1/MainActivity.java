package tdtu.android.banglaib1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = "B1";
    private ImageButton buttonHocLythuyet,buttonThi,butttonMeo, buttonBien;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Khởi tạo SDK quảng cáo trên thiết bị di động
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        buttonBien = findViewById(R.id.imageButton4);
        buttonBien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBienBao();
            }
        });
        buttonHocLythuyet =(ImageButton) findViewById(R.id.imageButton2);
        buttonHocLythuyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHoclythuyet();

            }
        });
        buttonThi =(ImageButton) findViewById(R.id.imageButton3);
        buttonThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThi();

            }
        });
        butttonMeo =(ImageButton) findViewById(R.id.imageButton5);
        butttonMeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeo();

            }
        });


    }
    public void openMeo()
    {
        Intent intent;
        intent = new Intent(this,MeoActivity.class);
        startActivity(intent);
    }
    public void openHoclythuyet()
    {
        Intent intent;
        intent = new Intent(this,ChooseLTActivity.class);
        startActivity(intent);
    }
    public void openThi()
    {
        Intent intent;
        intent = new Intent(this,ChooseThiActivity.class);
        startActivity(intent);
    }
    public void openBienBao()
    {
        Intent intent;
        intent = new Intent(this,LoaiBienBaoActivity.class);
        startActivity(intent);
    }
    //dang ky option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }
    //cac thành phần trong menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder alertDialog;
        switch (item.getItemId()) {
            case R.id.about:
                alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("About");
                alertDialog.setMessage("Bang lai xe B1");

                alertDialog.show();

                return true;
            case R.id.help:
                alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Help");
                alertDialog.setMessage("Hướng dẫn sử dụng");

                alertDialog.show();
                return true;
            case R.id.exit:
                alertDialog = new
                        AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Confirm?");
                alertDialog.setMessage("Are you sure you want to exit the app");
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //...
                    }
                });
                alertDialog.show();
                return true;



            default:
                return super.onOptionsItemSelected(item);

        }

    }

}