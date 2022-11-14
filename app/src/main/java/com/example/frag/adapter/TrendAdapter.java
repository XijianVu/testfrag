package com.example.frag.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frag.R;
import com.example.frag.model.ItemList;

import java.util.ArrayList;

public class TrendAdapter extends RecyclerView.Adapter<TrendAdapter.TrendRecyclerHolder>{

    Context context;
    ArrayList<ItemList> arrayList;
    RecyclerItemClick itemClick;

    public TrendAdapter(Context context, ArrayList<ItemList> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public TrendAdapter.TrendRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new TrendRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendAdapter.TrendRecyclerHolder holder, int position) {
        ItemList item =arrayList.get(position);
        holder.imgItem.setImageResource(item.getImgResource());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvDescripcion.setText(item.getDescripcion());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick.itemClick(item);


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


    public class TrendRecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;
        private TextView tvTitulo;
        private TextView tvDescripcion;

        public TrendRecyclerHolder(@NonNull View itemView) {
            super(itemView);

            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }

}
