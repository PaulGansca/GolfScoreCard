package com.ganscapaul.golfscorecard;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.ganscapaul.golfscorecard.adapter.HoleAdapter;
import com.ganscapaul.golfscorecard.model.Hole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private List<Hole> mHoleList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private HoleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        mAdapter = new HoleAdapter(mHoleList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        prepareHoleData();
    }

    private void prepareHoleData() {
        for (int i = 0; i  < 18; i++){
            Hole hole = new Hole(i+1, 0);
            mHoleList.add(hole);
        }
    }
}
