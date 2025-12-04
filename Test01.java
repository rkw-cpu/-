package 实训6自动贩卖机;

import java.util.Scanner;

public class Test01 {
//    static Drink cola, fenda, blacktea, greentea;
//    static Drink getDrink(int index) {
//        switch (index) {
//            case 1:
//                return cola;
//            case 2:
//                return fenda;
//            case 3:
//                return blacktea;
//            case 4:
//                return greentea;
//            default:
//                return null;
//        }
//    }
    static Drink[] drinks;
    static int money;

    public static void main(String[] args) {
        drinks = new Drink[4];
        drinks[0] = new Drink("可乐", 50, 2.0, 1);
        drinks[1] = new Drink("芬达", 40, 3.0, 2);
        drinks[2] = new Drink("红茶", 30, 4.0, 3);
        drinks[3] = new Drink("绿茶", 20, 5.0, 4);
        money = 500;
        for (; ; ) {
            System.out.println("  --- - -欢迎使用自动售货机- - ---");
            System.out.println("|\t商品名称\t单价\t\t\t剩余数量\t|");
//            cola.UserPrintDrinkInfo();
//            fenda.UserPrintDrinkInfo();
//            blacktea.UserPrintDrinkInfo();
//            greentea.UserPrintDrinkInfo();
            for (int i = 0;i < drinks.length;i++) {
                Drink value = drinks[i];
                value.UserPrintDrinkInfo();
            }
            System.out.println(" - - - - - - - - - - - - - - - - ");
            System.out.println("1.购买饮料");
            System.out.println("2.管理员查询");
            System.out.println("3.返回");
            System.out.println("请输入你的选择：");
            Scanner scanner = new Scanner(System.in);
            int indexScanner = scanner.nextInt();
            switch (indexScanner) {


                case 1:
                    System.out.println("请输入你要购买的饮料编号：");
                    int buyIndex = scanner.nextInt();
//                    Drink drink = getDrink(buyIndex);
                    Drink drink = drinks[buyIndex - 1];
                    System.out.println("请输入你要购买的数量：");
                    Scanner countScanner = new Scanner(System.in);
                    int buyCount = countScanner.nextInt();
                    if(buyCount > 0){
                        System.out.println("您选择了：" + buyCount +"瓶" + drink.getName()+
                                "，单价：" + drink.getPrice() + ".");
                        System.out.println("总价格：" + drink.getPrice() * buyCount +"元，" +
                                "请支付：");
                        System.out.println("确定购买？（1，确定，2，退款）");
                        Scanner sureScanner = new Scanner(System.in);
                        int sure = sureScanner.nextInt();

                        if(sure == 1){
                           drink.sellDrink(buyCount);
                           money += drink.getPrice() * buyCount;
                            System.out.println("您购买了"+buyCount+"瓶"+drink.getName()+"，交易成功！");
                        }
                        if(sure == 2){
                            System.out.println("交易取消，退款中...");
                        }
                        else {
                            System.out.println("输入的数量有误！");
                            break;

                        }

                    }
                case 2:
                    System.out.println("输入管理员密码：");
                    Scanner pwdScanner = new Scanner(System.in);
                    int password = pwdScanner.nextInt();
                    if (password == 123){
                        System.out.println("欢迎管理员");
                    }
                    break;
            }
        }

    }
}
