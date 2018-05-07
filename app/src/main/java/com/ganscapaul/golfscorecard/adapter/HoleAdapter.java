package com.ganscapaul.golfscorecard.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ganscapaul.golfscorecard.MainActivity;
import com.ganscapaul.golfscorecard.R;
import com.ganscapaul.golfscorecard.model.Hole;

import java.util.List;

public class HoleAdapter extends RecyclerView.Adapter<HoleAdapter.HoleViewHolder> {

    private List<Hole> mHoleList;

    public class HoleViewHolder extends RecyclerView.ViewHolder{

        public TextView holeNumber;
        public TextView strokesTaken;
        public Button decrementStroke;
        public Button incrementStroke;

        public HoleViewHolder(View itemView) {
            super(itemView);

            holeNumber = itemView.findViewById(R.id.holeNumber);
            strokesTaken = itemView.findViewById(R.id.strokesTaken);
            decrementStroke = itemView.findViewById(R.id.decrementStroke);
            incrementStroke = itemView.findViewById(R.id.incrementStroke);
        }


    }

    public HoleAdapter(List<Hole> mHoleList) {
        this.mHoleList = mHoleList;
    }

    @NonNull
    @Override
    public HoleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hole_list_item, parent, false);

        return new HoleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HoleViewHolder holder, int position) {
        Hole hole = mHoleList.get(position);
        holder.holeNumber.setText(hole.getHoleNumber()+"");
        holder.strokesTaken.setText(hole.getStrokesTaken()+"");
    }

    @Override
    public int getItemCount() {
        return mHoleList.size();
    }


}
