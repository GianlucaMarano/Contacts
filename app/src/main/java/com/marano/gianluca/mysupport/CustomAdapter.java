package com.marano.gianluca.mysupport;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gianluca Marano on 09/03/2017.
 */
class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomVh>{


    @Override
    public CustomVh onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CustomVh holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomVh extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnCreateContextMenuListener{


        public CustomVh(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        }
    }
}
