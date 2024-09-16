package service;

import model.Expense;
import java.util.List;
import java.util.ArrayList;

public class ExpneseService {
    
    // toplam harcamayı hesaplayan metod
    public double calculateTotalExpenses(List<Expense> expenses) {
        double total = 0;
        for(Expense expense : expenses) {
            total += expense.getAmount(); // harcama miktarını toplamına ekliyoruz

        }
        return total;
    }

    //kategoriye göre filtreleme metodu 
    public List<Expense> filterExpensesByCategory(List<Expense> expenses, String category) {
        List<Expense> filteredExpenses = new ArrayList<>();
        for(Expense expense : expenses){
            if(expense.getCategory().equalsIgnoreCase(category)){ //kategori karşılaştırması
                filteredExpenses.add(expense);

            }
        }
        return filteredExpenses;
    }
}
