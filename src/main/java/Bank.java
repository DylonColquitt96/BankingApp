import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class Bank {
    Map<String, Account> accounts = new HashMap<String, Account>();

    public void addAccount(Account inNewAccount){
        accounts.put(inNewAccount.getAccountNumber(), inNewAccount);
        //Key is inNewAccount.getAccountNumber()
        //Value inNewAccount
    }

    //below, we are asking to get the account number. As such in the parameter (), we ask it to get account number
    //Which is in the form of a string shown in our **Account** class
    public Account getAccount(String accountNumber){
        return accounts.get(accountNumber);
        //the return above allows it to look for the account number and return it.
    }

    public Collection<Account> getAllAccounts(){
        return accounts.values();
    }

    public void closeAccount (String accountNumber){
        accounts.remove(accountNumber);
        //.remove allows us to remove something from the map.
        //within the parameter () we place what we want the value to be that we want to be removed. Which in this case
        //we will be asking it to remove a specific accountNumber.
    }
}
