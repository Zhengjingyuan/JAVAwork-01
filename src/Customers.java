import java.time.LocalDate;

public class Customers {
    String name;
    int times;
    LocalDate date;

    double remaining;

    public Customers() {
    }


    public Customers(String name, int times, LocalDate date, double remaining) {
        this.name = name;
        this.times = times;
        this.date = date;
        this.remaining = remaining;
    }



    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * 获取
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String toString() {
        return "{客户姓名：" + name + "到店次数：" + times + "最新到店时间：" + date + "}";
    }

    /**
     * 获取
     * @return remaining
     */
    public double getRemaining() {
        return remaining;
    }

    /**
     * 设置
     * @param remaining
     */
    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }




}
