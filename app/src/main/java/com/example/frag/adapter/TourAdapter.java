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
import com.example.frag.model.TourModel;

import java.util.ArrayList;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.TourRecyclerHolder> {

    Context context;
    ArrayList<TourModel> arrayList;
    PlaceAdapter.RecyclerItemClick itemClick;

    public TourAdapter(Context context, ArrayList<TourModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public TourAdapter.TourRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder2, parent, false);
        return new TourAdapter.TourRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TourAdapter.TourRecyclerHolder holder, int position) {
        TourModel item =arrayList.get(position);

        holder.pic.setImageResource(item.getPic());
        holder.title.setText(item.getTitle());
        holder.fee.setText(String.valueOf(item.getFee()));

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


    public class TourRecyclerHolder extends RecyclerView.ViewHolder {
        TextView title, fee;
        ImageView pic;


        public TourRecyclerHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            pic = itemView.findViewById(R.id.pic);
            fee = itemView.findViewById(R.id.fee);
        }
    }
}
