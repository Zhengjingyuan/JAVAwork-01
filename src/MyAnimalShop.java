import java.time.DayOfWeek;
import java.util.*;

public class MyAnimalShop implements AnimalShop{
    Boolean doingBusiness=true;
    ArrayList <Animal>getPet=new ArrayList<>();
    ArrayList <Animal>sellPet=new ArrayList<>();

    ArrayList <Customers>getCustomers=new ArrayList<>();
    double profit;


    Boolean doBusiness(){
        return true;
    }


    @Override
    public void bought(Animal pet, Customers customers,int num) {
        System.out.println("交易进行中。。。");
        customers.remaining-=pet.getPrice()*num;
        if(pet.count==0){
            System.out.println(pet+"已卖光");
        }
        else
        {
            if(customers.remaining<0)
            {
                System.out.println("抱歉，余额不足！");
                throw new InsufficientBalanceException();
            }
            else
            {
                System.out.println(pet.getName()+"购买成功！");
                pet.count--;
                getPet.add(pet);
                sellPet.remove(pet);
                profit+=num*pet.getPrice();
            }
        }




    }

    @Override
    public void treat(Customers customers) {
        getCustomers.add(customers);
        customers.times++;
        if(sellPet.size()==0){
            System.out.println("本店卖光了所有宠物！");
            throw new AnimalNotFoundException();
        }


    }

    @Override
    public boolean doingBusiness(Customers customers) {
        Calendar cal = Calendar.getInstance();
        DayOfWeek week=customers.date.getDayOfWeek();

        if(week==DayOfWeek.SATURDAY||week==DayOfWeek.SUNDAY) {
            return false;
        }
        return true;
    }
}
