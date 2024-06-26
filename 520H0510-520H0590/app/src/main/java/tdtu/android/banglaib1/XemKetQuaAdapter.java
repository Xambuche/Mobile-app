package tdtu.android.banglaib1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class XemKetQuaAdapter extends BaseAdapter {
    private List<Lythuyet> listData;

    public void setListData(List<Lythuyet> listData) {
        this.listData = listData;
    }

    public List<Lythuyet> getListData() {
        return listData;
    }

    private LayoutInflater layoutInflater;

    private Context context;

    public XemKetQuaAdapter() {
    }

    public XemKetQuaAdapter(Context aContext, List<Lythuyet> listData) {
        this.context = aContext;
        this.listData = listData;
        this.layoutInflater = LayoutInflater.from(aContext);
    }


    @Override
    public int getCount() {
        return this.listData.size();
    }

    @Override
    public Object getItem(int i) {
        return this.listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Lythuyet items = this.listData.get(i);
        view = layoutInflater.inflate(R.layout.activity_xem_ket_qua_adapter, null);
        TextView cau = view.findViewById(R.id.textView15);
        String src = listData.get(i).getHinh();
        int drawableId = view.getResources().getIdentifier(src, "drawable", "tdtu.android.banglaib1");
        ImageView hinh= view.findViewById(R.id.imageView6);
        hinh.setImageResource(drawableId);
        TextView a = view.findViewById(R.id.textView19);
        TextView b = view.findViewById(R.id.textView20);
        TextView c = view.findViewById(R.id.textView22);
        TextView d = view.findViewById(R.id.textView23);
        TextView liet = view.findViewById(R.id.textView24);
        if(items.getSocau()==2)
        {
            cau.setText(items.getDe());
            a.setText("a. "+items.getA());
            b.setText("b. "+items.getB());
            c.setVisibility(View.INVISIBLE);
            d.setVisibility(View.INVISIBLE);

//
            if(items.getA().equals(items.getCaudung()))
            {
                a.setBackgroundColor(Color.rgb(87,255,51));

            }
            else if(items.getB().equals(items.getCaudung()))
            {
                b.setBackgroundColor(Color.rgb(87,255,51));
            }

            if(items.getA().equals(items.getTraloi()))
            {
                a.setBackgroundColor(Color.rgb(255,87,51));
            }
            else if(items.getA().equals(items.getTraloi()))
            {
                b.setBackgroundColor(Color.rgb(255,87,51));
            }
            else
            {
                ;
            }
            if(items.getCauliet()==1)
            {
                liet.setText("ĐÂY LÀ CÂU LIỆT");

            }
            else
            {
                liet.setVisibility(View.INVISIBLE);
            }

        }
        else if(items.getSocau()==3) {
            cau.setText(items.getDe());
            a.setText("a. " + items.getA());
            b.setText("b. " + items.getB());
            c.setText("c. " + items.getC());
            d.setVisibility(View.INVISIBLE);
            if (items.getA().equals(items.getTraloi())) {
                a.setBackgroundColor(Color.rgb(255,87,51));
            }
            else if (items.getC().equals(items.getTraloi()))
                c.setBackgroundColor(Color.rgb(255,87,51));
            else if (items.getB().equals(items.getTraloi()))
                b.setBackgroundColor(Color.rgb(255,87,51));
            else {
                ;
            }

            if (items.getA().equals(items.getCaudung())) {
                a.setBackgroundColor(Color.rgb(87,255,51));
            }
            else if (items.getC().equals(items.getCaudung())) {
                c.setBackgroundColor(Color.rgb(87,255,51));
            } else {
                b.setBackgroundColor(Color.rgb(87,255,51));
            }

            if (items.getCauliet() == 1) {
                liet.setText("ĐÂY LÀ CÂU LIỆT");

            } else {
                liet.setVisibility(View.INVISIBLE);
            }
        }


        else
        {
            if(items.getA().equals(items.getCaudung()))
            {
                a.setBackgroundColor(Color.rgb(87,255,51));

            }
            else if(items.getB().equals(items.getCaudung()))
            {
                b.setBackgroundColor(Color.rgb(87,255,51));
            }
            else if(items.getC().equals(items.getCaudung()))
            {
                c.setBackgroundColor(Color.rgb(87,255,51));
            }
            else if(items.getD().equals(items.getCaudung())){
                d.setBackgroundColor(Color.rgb(87,255,51));
            }


            cau.setText(items.getDe());
            a.setText("a. "+items.getA());
            b.setText("b. "+items.getB());
            c.setText("c. "+items.getC());
            d.setText("d. "+items.getD());
            if(items.getA().equals(items.getTraloi()))
            {
                a.setBackgroundColor(Color.rgb(255,87,51));
            }
            if(items.getC().equals(items.getTraloi()))
                c.setBackgroundColor(Color.rgb(255,87,51));
            if(items.getD().equals(items.getTraloi()))
                d.setBackgroundColor(Color.rgb(255,87,51));
            if(items.getB().equals(items.getTraloi()))
            {
                b.setBackgroundColor(Color.rgb(255,87,51));
            }
            else
            {
                ;
            }

            if(items.getCauliet()==1)
            {
                liet.setText("ĐÂY LÀ CÂU LIỆT");

            }
            else
            {
                liet.setVisibility(View.INVISIBLE);
            }


        }
        return view;
    }

}