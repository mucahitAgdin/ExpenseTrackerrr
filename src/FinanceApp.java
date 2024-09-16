import controller.FinanceController;

public class FinanceApp {
    public static void main(String[] args) throws Exception {
        FinanceController controller = new FinanceController(); //kontrolcü nesnesi oluşturur

        // yeni kullanıcı oluşturma 
        controller.createUser("Ali");

        //harcama ekleme 
        controller.addExpenseToUser("Ali", 50.0, "Gıda", "Market alişverişi");
        controller.addExpenseToUser("Ali", 20.0, "eglence", "sinema bileti");

        //toplam harcamayı yazdırma
        controller.printTotalExpenses("Ali");
    }
}
