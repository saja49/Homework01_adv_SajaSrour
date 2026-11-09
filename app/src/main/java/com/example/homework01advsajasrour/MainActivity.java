package com.example.homework01advsajasrour;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.rv);


        productArrayList = new ArrayList<>();
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$48.89", R.drawable.camera1));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$55.89", R.drawable.camera2));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$78.89", R.drawable.camera3));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$88.55", R.drawable.camera4));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$23.67", R.drawable.camera5));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$44.89", R.drawable.camera6));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$65.00", R.drawable.camera7));
        productArrayList.add(new Product("Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$99.99", R.drawable.camera1));

        productAdapter = new ProductAdapter(this, productArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(productAdapter);
    }
}