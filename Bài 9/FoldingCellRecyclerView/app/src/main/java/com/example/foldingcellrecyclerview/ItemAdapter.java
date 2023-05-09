package com.example.foldingcellrecyclerview;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewFolder> {

    private List<ItemObject> mListItems;
    public void setData(List<ItemObject> list) {
        this.mListItems = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewFolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false);
        return new ItemViewFolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewFolder holder, int position) {
        final ItemObject itemObject = mListItems.get(position);
        if (itemObject == null) {
            return;
        }
        holder.tvOpen.setText(itemObject.getOpen());
        holder.tvContent.setText(itemObject.getContent());

        holder.foldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            holder.foldingCell.toggle(false);
            }
        });
        holder.tvOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),itemObject.getOpen(),Toast.LENGTH_SHORT ).show();
            }
        });

        holder.tvContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),itemObject.getContent(),Toast.LENGTH_SHORT ).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListItems != null) {
            return mListItems.size();
        }
        return 0;
    }


    public class ItemViewFolder extends RecyclerView.ViewHolder {

        private FoldingCell foldingCell;
        private TextView tvOpen;
        private TextView tvContent;

        public ItemViewFolder(@NonNull View itemView) {
            super(itemView);

            foldingCell = itemView.findViewById(R.id.folding_cell);
            tvOpen = itemView.findViewById(R.id.tv_open);
            tvContent = itemView.findViewById(R.id.tv_content);
        }
    }
}
