public class Expense{
    double amount;
    String category;
    String description;
    String date;
    static int count = 0;
    int id;

    Expense(double amt, String cat, String desc, String dt){
        id = ++count;
        amount = amt;
        category = cat;
        description = desc;
        date = dt;
    }

    void display(){
        System.out.println("The ID is: "+ id );
        System.out.println("The expense is: "+ amount );
        System.out.println("The category is: "+ category );
        System.out.println("The description is: "+ description );
        System.out.println("The date is: "+ date );
    }
}
