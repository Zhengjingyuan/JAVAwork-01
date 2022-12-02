public class Dog extends Animal{
    Boolean  isVaccineInjected(){
        return true;
    }
    public Dog(){

    }
    public Dog(String name,int age,String gender,double price,int num){
        super(name,age,gender,price,num);

    }
}
