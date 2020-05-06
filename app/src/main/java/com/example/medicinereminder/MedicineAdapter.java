package com.example.medicinereminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.Viewholder>
{

    private ArrayList<MedicineModel> modelArrayList  ;
    private Context context ;

    public MedicineAdapter(ArrayList<MedicineModel> modelArrayList, Context context)
    {
        this.modelArrayList = modelArrayList;
        this.context = context ;
     }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false) ;
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position)
    {

        MedicineModel currentItem = modelArrayList.get(position) ;
        holder.etxMedicineName.setText(currentItem.getMedicineName());
        holder.etxMedicineDate.setText(currentItem.getMedicineDate());
        holder.imgMedicine.setImageResource(currentItem.getMedicineImage());
        holder.imgDelete.setImageResource(R.drawable.ic_delete);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        ImageView imgMedicine, imgDelete   ;
        EditText etxMedicineName , etxMedicineDate ;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
           imgDelete = itemView.findViewById(R.id.imgDelete) ;
            imgMedicine = itemView.findViewById(R.id.imgMedicine) ;
            etxMedicineName = itemView.findViewById(R.id.etxMedicineName) ;
            etxMedicineDate = itemView.findViewById(R.id.etxMedicineDate) ;

        }
    }
}
