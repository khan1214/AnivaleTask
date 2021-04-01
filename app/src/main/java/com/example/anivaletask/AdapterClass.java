package com.example.anivaletask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterClass  extends RecyclerView.Adapter<AdapterClass.Holder> {
    Context context;
    List<ItemModelclass> list;

    public AdapterClass(Context context, List<ItemModelclass> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.eachitemcell,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
    ItemModelclass itemModelclass = list.get(position);
    holder.setImageView(itemModelclass.getImageUrl());
    holder.setmLike(itemModelclass.getLike());
    holder.setTag(itemModelclass.getTags());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView mLike,mtag;
        View view;

        public Holder(@NonNull View itemView) {
            super(itemView);
            view = itemView;


        }

        public void setImageView(String url){
            imageView = view.findViewById(R.id.imageview);
            Glide.with(context).load(url).into(imageView);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position =getAdapterPosition();
//                    String message = "Name :"+list.get(position).getImageUrl();
//                    Toast.makeText(context,message,Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(context,DetailedActivity.class);
                    intent.putExtra("image",list.get(position).getImageUrl());
                    context.startActivity(intent);

                }
            });
        }

        public void setmLike(int like){
            mLike =view.findViewById(R.id.likes);
            mLike.setText(like+"Likes");
        }

        public void setTag(String tag){
            mtag = view.findViewById(R.id.tags);
            mtag.setText(tag);
        }


    }
}
