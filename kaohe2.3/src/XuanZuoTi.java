import java.util.Arrays;
import java.util.concurrent.locks.LockSupport;

public class XuanZuoTi {
    private static Thread t1;
    private static Thread t2;

    public static void sout(int[] arr1, int[] arr2){

         t1 = new Thread(() ->{
             for(int num : arr1){
                 System.out.print(num + " ");
                 LockSupport.unpark(t2);  //唤醒t2线程
                 LockSupport.park();  //将本线程阻塞
             }
         });

         t2 = new Thread(() ->{
             for(int let : arr2){
                 LockSupport.park();  //防止t2线程先执行从而先输出A
                 System.out.print(let + " ");
                 LockSupport.unpark(t1);  //唤醒t1线程
             }
         });

         t1.start();
         t2.start();

    }
    //条件1：输入的只能是字母、数字、下划线、@以及.五种
//条件2：@前后只能是字母或者数字
//隐藏条件：必须含@，不然非法格式
//条件3：.后只能是com
//隐藏条件：必须含.，且字符串后四位为.com
    public static boolean mail(String mail){ //邮箱
        if((mail.indexOf("@")>=0 && mail.indexOf("@")==mail.lastIndexOf("@"))
                && mail.substring(mail.length()-4,mail.length()).equals(".com")
                || mail.substring(mail.length()-3,mail.length()).equals(".cn")){
            System.out.println("啊对");
            return true;

        }
        System.out.println("no~");
        return false;
    }

}


