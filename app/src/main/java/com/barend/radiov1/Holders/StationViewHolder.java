package com.barend.radiov1.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.barend.radiov1.Model.Station;
import com.barend.radiov1.R;

/**
 * Created by Barend on 2017/02/12.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;

    private TextView titleTextView;

    public StationViewHolder(View itemView) {
        super(itemView);
        this.mainImage = (ImageView) itemView.findViewById(R.id.main_image);
        this.titleTextView = (TextView) itemView.findViewById(R.id.main_text);
    }

    public void updateUI(Station station){
        String uri = station.getImageUri();
        int resource = mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());

        //Sets Image and Title per card
        mainImage.setImageResource(resource);
        titleTextView.setText(station.getStationTitle());
    }

}
