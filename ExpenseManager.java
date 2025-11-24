import java.util.*;

public class ExpenseManager{
    ArrayList<Expense> list = new ArrayList<>();

    ExpenseManager(){}

    void addExpense(Expense e){
        list.add(e);
    }
    
    void showAllExpenses() {
        for(int i=0; i<list.size();i++){
            Expense e = list.get(i);
            e.display();
        }
    }

    void showTotalExpenses() {
        double sum = 0;
        for(int i=0; i<list.size(); i++){
            Expense e = list.get(i);
            sum += e.amount;
        }
        System.out.println("Total expenses: "+ sum);
    }

    void showByCategory(String cat){
       for(int i=0; i<list.size(); i++){
            Expense e = list.get(i);
            if(e.category.equals(cat)){
              e.display();
            }
        }
    }

    void deleteExpense(int id) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).id == id) {
            list.remove(i);
            System.out.println("Deleted!");
            return;
        }
    }
    System.out.println("ID not found");
   }

   void searchExpense(String keyword) {
    for (Expense e : list) {
        if (e.description.toLowerCase().contains(keyword.toLowerCase())) {
            e.display();
        }
    }
}

}