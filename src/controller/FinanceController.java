package controller;

import model.Expense;
import model.User;
import repository.UserRepository;
import service.ExpneseService;

import java.util.Date;

public class FinanceController {
    private UserRepository userRepository; //kullanıcıları yöneten repository
    private ExpneseService expneseService; //harcamaları yöneten servis

    //constructor
    public FinanceController(){
        this.userRepository = new UserRepository();
        this.expneseService = new ExpneseService();
    }

    //yeni kullanıcı oluşturur
    public void createUser(String name) {
        User user = new User(name);
        userRepository.addUser(user); // yeni kullancıyı repository'e ekler

    }

    // kullanıcıya harcama ekler
    public void addExpenseToUser(String userName, double amount, String category, String description) {
     User user = userRepository.findUserByName(userName); // kullanıcıyı bulur
     if (user != null) {
        Expense expense = new Expense(amount, category, description, new Date());
        user.addExpense(expense);
     }  else {
        System.out.println("Kullanıcı bulunamadı.");
     }
    
    }
    
    //kullanıcının toplam harcamasını hesaplar ve yazdırır
    public void printTotalExpenses(String userName) {
        User user = userRepository.findUserByName(userName);
        if(user != null) {
            double total = expneseService.calculateTotalExpenses(user.getExpenses());
            System.out.println("Toplam harcama: " + total);

        } else {
            System.out.println("Kullanıcı bulunamadı.");
        }
    }

}
