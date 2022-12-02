import java.time.LocalDate;
import java.util.Locale;



public class Test {


    public static void main(String[] args) {
        MyAnimalShop shop=new MyAnimalShop();
        Dog dog = new Dog("修母狗",2,"母",100,3);
        Dog dog1 = new Dog("修公狗",2,"公",100,2);
        Cat cat=new Cat("修母猫",2,"母",100,1);
        Cat cat1=new Cat("修公猫",2,"母",100,1);
        Pig pig=new Pig("GGboom",2,"母",100,1);
        Pig pig1=new Pig("CCboom",2,"公",100,1);
        shop.sellPet.add(dog);shop.sellPet.add(dog1);shop.sellPet.add(cat);shop.sellPet.add(cat1);
        shop.sellPet.add(pig);shop.sellPet.add(pig1);
        LocalDate l1= LocalDate.of(2022, 11, 21);
        Customers c1=new Customers("小橘",0,l1,666);
        if(shop.doingBusiness(c1)==true){
            try{
            shop.treat(c1);
            shop.bought(dog,c1,1);
            shop.bought(cat,c1,1);
            }
            catch(Exception err)
            {

            }

        }
        else{
            System.out.println("今天歇业！");
        }

        LocalDate l2= LocalDate.of(2022, 11, 22);
        Customers c2=new Customers("小鱼",0,l2,50);

        if(shop.doingBusiness(c2)==true){
            try {
                shop.treat(c2);
                shop.bought(dog, c2, 1);
                shop.bought(cat, c2, 1);
            }catch (Exception err){

            }
        }
        else{
            System.out.println("周末歇业！我们工作日上班哟~");
        }

        LocalDate l3= LocalDate.of(2022, 11, 23);
        Customers c3=new Customers("小紫",0,l3,500);
        if(shop.doingBusiness(c3)==true){
            try
            {
            shop.treat(c3);
            shop.bought(dog,c3,1);
            shop.bought(dog1,c3,1);
            }
            catch (Exception err)
            {

            }
        }
        else{
            System.out.println("周末歇业！我们工作日上班哟~");
        }

        LocalDate l4= LocalDate.of(2022, 11, 24);
        Customers c4=new Customers("小艾",0,l4,600);
        if(shop.doingBusiness(c4)==true){
            try
            {
                shop.treat(c4);
                shop.bought(pig,c4,1);
                shop.bought(pig1,c4,1);
            }
            catch (Exception err)
            {

            }
        }
        else{
            System.out.println("周末歇业！我们工作日上班哟~");
        }

        LocalDate l5= LocalDate.of(2022, 11, 25);
        Customers c5=new Customers("小紫",0,l5,500);
        if(shop.doingBusiness(c5)==true){
            try
            {
                shop.treat(c5);
                shop.bought(dog,c5,1);
                shop.bought(dog1,c5,1);
            }
            catch (Exception err)
            {

            }
        }
        else{
            System.out.println("周末歇业！我们工作日上班哟~");
        }


        System.out.println("本周利润："+shop.profit);
        System.out.println("顾客列表："+shop.getCustomers);

    }

}
