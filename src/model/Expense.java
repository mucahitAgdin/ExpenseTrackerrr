package model;

import java.util.Date;

public class Expense {
    private double amount;  // harcama miktari
    private String category; // harcama kategorisi
    private String description; // harcama aciklamasi
    private Date date; // harcama tarihi 

    // constructor
    public Expense(double amount, String category , String desctiption, Date date) {
        this.amount = amount;
        this.category = category;
        this.description = desctiption;
        this.date = date;
    }

    // getter ve setter metodları
    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        
        this.amount = amount;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
    
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //toString metodu : harcamanın okunabilir bir formatta döndürülmesini sağlar

    @Override
    public String toString(){
        return "Tarih: " + date + ", Miktar: " + amount + ", Kategori: " + category + ", Açıklama: " + description;
    }
    
}