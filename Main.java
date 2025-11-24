import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        while (true) {
         System.out.println("Expense Tracker Menu");
         System.out.println("1. Add Expense");
         System.out.println("2. Show All Expenses");
         System.out.println("3. Show Total Expenses");
         System.out.println("4. Show By Category");
         System.out.println("5. Search Expense");
         System.out.println("6. Delete Expense");
         System.out.println("7. Exit");

         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();
         sc.nextLine(); 
         
         switch (choice) {

          case 1:
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter category: ");
            String cat = sc.nextLine();

            System.out.print("Enter description: ");
            String desc = sc.nextLine();

            System.out.print("Enter date: ");
            String date = sc.nextLine();

            Expense e = new Expense(amt, cat, desc, date);
            manager.addExpense(e);

            System.out.println("Expense Added!");
            break;

          case 2:
            manager.showAllExpenses();
            break;

          case 3:
            manager.showTotalExpenses();
            break;

          case 4:
            System.out.print("Enter the category: ");
            String c = sc.nextLine();
            manager.showByCategory(c);
            break;

          case 5:
            System.out.print("Enter keyword to search: ");
            String key = sc.nextLine();
            manager.searchExpense(key);
            break;

          case 6:
            System.out.print("Enter ID to delete: ");
            int did = sc.nextInt();
            manager.deleteExpense(did);
            break;

          case 7:
           System.out.println("Exiting");
           return;

          default:
           System.out.println("Invalid choice!");
}
        }

        

    }
}
