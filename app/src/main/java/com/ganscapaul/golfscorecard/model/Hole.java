package com.ganscapaul.golfscorecard.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Hole {
    private int holeNumber;
    private int strokesTaken;

    // add constructor and getter and setter


    public Hole(int holeNumber, int strokesTaken) {
        this.holeNumber = holeNumber;
        this.strokesTaken = strokesTaken;
    }

    public int getHoleNumber() {
        return holeNumber;
    }

    public void setHoleNumber(int holeNumber) {
        this.holeNumber = holeNumber;
    }

    public int getStrokesTaken() {
        return strokesTaken;
    }

    public void setStrokesTaken(int strokesTaken) {
        this.strokesTaken = strokesTaken;
    }
}
