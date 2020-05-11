package com.mekimsc.myapp.evasuebiblestudy.Adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mekimsc.myapp.evasuebiblestudy.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class simpleAdapter extends RecyclerView.Adapter<simpleAdapter.simpleViewHolder> {

    List<String> datasource;
    private myClickListener myClick;

    public simpleAdapter(myClickListener myClick) {
        this.myClick=myClick;
        datasource = new ArrayList<>();
        String chapterList[] = {"ጥናት 1 : ህልውናውን መናፈቅ \n Entering in to God’s presence", "ጥናት 2 : ትጋት \n Diligence ", "ጥናት 3 : ትህትና\n Humility", "ጥናት 4 :ፌዘኝነት\n Mockery", "ጥናት 5 : ግብዝነት \n Hypocrisy", "ጥናት 6 : ራስን መግዛት  \n Self discipline ", "ጥናት 7 : ፍቅር\n Love", "ጥናት 8 : ታማኝነት \nHonest ", "ጥናት 9 :ስርአተ ጾታ\n Sexuality I", "ጥናት 10 :ስርአተ ጾታ \n Sexuality II ", "ጥናት 11 : ፍሬያማ ህይወት\n Fruitful life ","ጥናት 12 :አጋጣሚን ለወንጌል\nUsing Opportunity","ጥናት 13 :እውነተኛ አምልኮ \nTrue worship ","ጥናት 14 :ትርፋማነት\nMultiplying our talent","ጥናት 15 :ቤተክርስቲያን\nThe Church "};
        datasource.addAll(Arrays.asList(chapterList));
    }

    @NonNull
    @Override
    public simpleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_items, viewGroup, false);
        return new simpleViewHolder(view,myClick);
    }

    @Override
    public void onBindViewHolder(@NonNull simpleViewHolder simpleViewHolder, int i) {
        simpleViewHolder.textView.setText(String.valueOf(datasource.get(i)));
    }

    @Override
    public int getItemCount() {
        return datasource.size();
    }

    public static class simpleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView textView;
        myClickListener myListner;

        public simpleViewHolder(@NonNull View itemView, myClickListener myListner) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textview);
            itemView.setOnClickListener(this);
            this.myListner = myListner;
        }

        @Override
        public void onClick(View v) {
            myListner.onClickListener(getAdapterPosition());
        }
    }

    public interface myClickListener {
        void onClickListener(int position);
    }


}
