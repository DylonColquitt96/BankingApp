import java.util.Collection;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank chaseBank = new Bank();
        Account account1 = new Account("777", "Checking",1000);
        Account account2 = new Account("333","Savings",10000);

        chaseBank.addAccount(account1);
        chaseBank.addAccount(account2);
        //Above we are adding the account numbers into the map. The .addAccount had been defined in the **Bank** class
        //under line 8.
        String action = "0";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Which account do you wish to access?");
            String choice = input.nextLine();

            Account currentAccount = chaseBank.getAccount(choice);
            //for the above, we are using the chaseBank.getAccount to call on the getAccount method on **Bank** class
            //We then place in the parameter that the choice input the user types it will pull up the account

            if (currentAccount!=null){
                //If the user enters the right account number, meaning it doesn't equate to null, then it will print the
                //info below
                System.out.println("What do you want to do?");
                System.out.println("1. to withdraw");
                System.out.println("2. to deposit");
                System.out.println("3. to get account balance");
                System.out.println("4. to exit");

            }

                action = input.nextLine();
                if(action.equals("1")){
                    System.out.println("How much do you want to withdraw?");
                    double amount = input.nextDouble();
                    input.nextLine(); //Put a next line auto in to avoid an error if you are using an nextDouble or
                    // nextInt.

                    currentAccount.withdrawal(amount);
                    //Above we are using the method found in **Account** class on line 24

                    System.out.println(currentAccount.checkAccountBalance());
                    //Above we are using the method found in **Account** class on line 32
                } else if(action.equals("2")){
                System.out.println("How much do you want to deposit?");
                double amount = input.nextDouble();
                input.nextLine(); //Put a next line auto in to avoid an error if you are using an nextDouble or
                // nextInt.


                currentAccount.deposit(amount);
                //Above we are using the method found in **Account** class on line 28

                System.out.println(currentAccount.checkAccountBalance());
                //Above we are using the method found in **Account** class on line 32
            } else if(action.equals("3")){
                System.out.println(currentAccount.checkAccountBalance());
                //Above we are using the method found in **Account** class on line 32

            } else{
                //if user enters in the incorrect account number, it will return null and it will skip to the else
                //section here.
                System.out.println("incorrect account number!");
            }
        } while (!action.equals("4"));

    }
}
