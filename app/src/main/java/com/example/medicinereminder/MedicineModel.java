package com.example.medicinereminder;

public class MedicineModel
{
    String medicineName;
    int medicineDate ;
    int medicineImage ;

    public MedicineModel(String medicineName, int medicineDate, int medicineImage) {
        this.medicineName = medicineName;
        this.medicineDate = medicineDate;
        this.medicineImage = medicineImage;
    }

    public String getMedicineName() {
        return medicineName;
    }



    public int getMedicineDate() {
        return medicineDate;
    }



    public int getMedicineImage() {
        return medicineImage;
    }


}
