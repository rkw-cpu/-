package 实训6自动贩卖机;

public class Drink {
    private String name;//产品名称
    private int number; //数量
    private double price; //单价
    private double total; //总价
    private int index; //索引
    public Drink(String name,int number,double price,int index){
        this.name = name;
        this.number = number;
        this.price = price;
        this.index = index;
        this.total = number*price;
    }
    public int getNumber(){
            return this.number;
    }
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
    public void sellDrink(int count){
        this.number -= count;
        this.total += this.price * count;
    }


    public void UserPrintDrinkInfo(){
        System.out.println("|\t"+this.name+"\t\t"+this.price+"元\t\t"+this.number+"\t\t|");
    }
}
