package com.hospital.davs.hospitalback.aleaList;

public enum Area {
    Dermatology("Dermatology"),
    Pediatrics("Pediatrics"),
    Nutrition("Nutrition"),
    generalMedicine("General Medicine"),
    Pharmacy("Pharmacy");
    private final String area;

    Area(Area area){
        this.area = area;
    }

    public String getArea(){
        return this.area;
    }
}
