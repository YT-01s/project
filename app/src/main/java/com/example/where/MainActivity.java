package com.example.where;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ViewGroup;
import net.daum.mf.map.api.MapView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapView mapView = new MapView(this);
        //mapView.bringToFront(); 최상단으로 뷰 올리기
        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }
}
