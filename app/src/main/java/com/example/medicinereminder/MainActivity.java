package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView mRecyclerView ;
    private RecyclerView.Adapter mAdapter ;
    private RecyclerView.LayoutManager mLayoutManger ;
    private ArrayList<MedicineModel> medicineArrayList = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        medicineArrayList.add(new MedicineModel("باى ألكوفان" , 5 , R.drawable.ic_launcher_background));
        medicineArrayList.add(new MedicineModel("باى ألكوفان" , 6 , R.drawable.ic_launcher_background));
        medicineArrayList.add(new MedicineModel("باى ألكوفان" , 7 , R.drawable.ic_launcher_background));
        medicineArrayList.add(new MedicineModel("باى ألكوفان" , 8 , R.drawable.ic_launcher_background));
        medicineArrayList.add(new MedicineModel("باى ألكوفان" , 9 , R.drawable.ic_launcher_background));
        medicineArrayList.add(new MedicineModel("باى ألكوفان" , 10 , R.drawable.ic_launcher_background));

        mRecyclerView = findViewById(R.id.recyclerviewList) ;
      //  mRecyclerView.setHasFixedSize(true) ;
        mLayoutManger =new LinearLayoutManager(this) ;
        mAdapter = new MedicineAdapter(medicineArrayList,this) ;
        mRecyclerView.setLayoutManager(mLayoutManger);
        mRecyclerView.setAdapter(mAdapter);


    }
}
