package model;
import java.util.ArrayList;

public class User {
    private String name; // Kullanıcının adı
    private ArrayList<Expense> expenses; // Kullanıcının harcamalarını tutan liste

    //constructor
    public User(String name) {
        this.name = name;
        this.expenses = new ArrayList<>(); // boş bir harcama listesi ile başlar
    }

    //harcama ekleme metodu
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    //kullanıcının adı döndürlür
    public String getName() {
        return name;
    }

    //kullanıcının harcamalarını döndürür
    public ArrayList<Expense> getExpenses(){
        return expenses;
    }

    //kullanıcının tüm harcamalrını string formatında döndürür
    @Override
    public String toString() {
        return "Kullanıcı: " + name;
    }
}
