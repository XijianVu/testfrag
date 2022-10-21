package com.example.frag.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frag.R;
import com.example.frag.model.ItemList;
import com.example.frag.model.PlaceModel;

import java.util.ArrayList;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceRecyclerHolder>{

    Context context;
    ArrayList<PlaceModel> arrayList;
    RecyclerItemClick itemClick;

    public PlaceAdapter(Context context, ArrayList<PlaceModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public PlaceAdapter.PlaceRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder1, parent, false);
        return new PlaceRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceRecyclerHolder holder, int position) {
        PlaceModel item =arrayList.get(position);
        holder.categoryPic.setImageResource(item.getPic());
        holder.categoryName.setText(item.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface RecyclerItemClick {
        void itemClick(ItemList item);
    }


    public class PlaceRecyclerHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ImageView categoryPic;
        ConstraintLayout mainLayout;

        public PlaceRecyclerHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.categoryName);
            categoryPic = itemView.findViewById(R.id.categoryPic);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }

}
