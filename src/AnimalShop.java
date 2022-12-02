import java.time.LocalTime;
import java.util.Scanner;

public interface AnimalShop {
    //接口不能实现
   public abstract void bought( Animal pet, Customers customers,int num);
    public abstract void treat(Customers customers);
    public abstract boolean  doingBusiness(Customers customers);

}
