import java.util.HashSet;
import java.util.Set;

public class ClassObject {
    private Set<Account> accounts;
    public ClassObject(){}
    public  void addAccount(Account account){
        if(this.accounts==null){
            this.accounts =new HashSet<Account>();
        }
        this.accounts.add(account);
    }
}