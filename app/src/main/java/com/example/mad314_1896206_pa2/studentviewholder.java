package com.example.mad314_1896206_pa2;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class studentviewholder extends RecyclerView.ViewHolder {

    public TextView name, ID;

    public studentviewholder(View itemView) {
        super(itemView);
        name  = itemView.findViewById(R.id.t1);
        ID = itemView.findViewById(R.id.t2);

    }

}
