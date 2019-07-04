
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DBUtils {
    private Set<Account> accounts;
    private static final List<Account> ACCOUNTS = new ArrayList<Account>();

    static{
        initData();
    }

    private static void initData(){
        Account accountList1 = new Account(1,"Mai Van Hoan","20/0   8/1983","Ha Noi","file:///home/joker/CodeGym/11.Application/AccountList/web/avenger/102641116-avengers-ultron.530x298.jpg");
        Account accountList2 = new Account(2,"Nguyen Van Nam","21/08/1983","Bac Giang","file:///home/joker/CodeGym/11.Application/AccountList/web/avenger/A2.jpg");
        Account accountList3 = new Account(3, "Nguyen Minh Nhat","18/05/1999","Quang Binh","file:///home/joker/CodeGym/11.Application/AccountList/web/avenger/Avengers_Earth-199999_001.jpg");
        Account accountList4 = new Account(4, "Nguyen Thai Hoa","22/08/1983","Nam Dinh","file:///home/joker/CodeGym/11.Application/AccountList/web/avenger/the-avenger-age-of-ultron-2015-poster-movie.jpg");
        Account accountList5 = new Account(5,"Nguyen Dinh Thi","19/08/1983","Ha Noi","file:///home/joker/CodeGym/11.Application/AccountList/web/avenger/UF-Ws1MdvusPTYgNDPW5Iwm2Z_PwI8P6.jpg");
        ACCOUNTS.add(accountList1);
        ACCOUNTS.add(accountList2);
        ACCOUNTS.add(accountList3);
        ACCOUNTS.add(accountList4);
        ACCOUNTS.add(accountList5);
    }
    //Truy van bang Account
    public static List<Account> queryAccounts(){return  ACCOUNTS;}


}
