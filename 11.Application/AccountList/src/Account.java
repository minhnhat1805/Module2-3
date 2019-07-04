import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private  int accountNo;
    private String accountName;
    private String birthDay;
    private  String  address;
    private  String image;
   // private  static final DateFormat day = new SimpleDateFormat("MM/dd/yyyy");

    public Account(int accountNo,String accountName,String birthDay,String address, String image){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.birthDay= birthDay;
        this.image =image;
        this.address = address;


      /*  try {
            this.birthDay= day.parse(birthDay);
        }
        catch (ParseException e){
            throw new RuntimeException(e);
        }
*/
    }
    public String getImage(){return image;}
    public void setImage(String image){
        this.image = image;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(int accountNo){
        this.accountNo= accountNo;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName){
        this.accountName= accountName;
    }
    public String getBirthDay(){
        return birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay= birthDay;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.birthDay= birthDay;
    }

}
