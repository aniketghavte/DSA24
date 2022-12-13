package InventoryManagement;

import java.util.Scanner;
class manage {

    String prd1 = "Mi";String phone1 = "Xiaomi 12 Pro";int price1 = 56000;String processor1 = "Snapdragon 8 gen1";int QNT1=10; int cost1= 50000;

    String prd2 = "realme";int price2 = 67000;int QNT2=12;String phone2 = "Realme GT 2 Pro";String processor2 = " Snapdragon 8 gen 1 "; int cost2= 60000;

    String prd3 = "oppo";int price3 = 46000;int QNT3=8;String phone3 ="OPPO Reno8 Pro 5G";String processor3 ="Mediatek dimensity 8100 max"; int cost3= 40000;

    String prd4 = "Vivo";int price4 = 44000;int QNT4=18;String phone4 ="Vivo V25 Pro";String processor4 ="MediaTek Dimensity 1300"; int cost4= 40000;

    String prd5 = "iQOO";int price5 = 55000;int QNT5=15;String phone5 ="iQOO 9T 5G";String processor5 = "SD 8 gen1"; int cost5= 50000;

    void display(String k,int p,int q,String ph,String pro)
    {
        System.out.println(" PHONE COMPANY name is = "+k);
        System.out.println(" PHONE Name is = "+ph);

        System.out.println(" Phone  price is = "+p);
        System.out.println(" PHONE Processor is = "+pro);
        System.out.println(" PHONE Quantity is = "+q);
        System.out.println("                                   ");
    }

    void cash(int p,int Q,int sale,String Ph){
        int j=((p*Q)-(sale*p));
        System.out.println("Payment of phone \""+Ph+"\"  = "+j);
    }
    int profit(int price, int cost,int q){
        int h =((price - cost)* q);
        return h;
    }




}



class  Main1 extends manage {


    void List(){
        System.out.println(" List of product\n");



        System.out.println(" product name is ="+prd1);
        System.out.println(" product name is ="+prd2);
        System.out.println(" product name is ="+prd3);
        System.out.println(" product name is ="+prd4);
        System.out.println(" product name is ="+prd5);
        System.out.println("                                  ");
    }

    void Detail(){
        // Main Obj1 = new Main();
        // Main Obj2 = new Main();
        // Main Obj3 = new Main();
        // Main Obj4 = new Main();
        // Main Obj5 = new Main();


        System.out.println(" Details of product -:");
        display(prd1,price1,QNT1,phone1,processor1);
        display(prd2,price2,QNT2,phone2,processor2);

        //System.out.println(" Details of product -:"+ prd2);
        display(prd3,price3,QNT3,phone3,processor3);

        //System.out.println(" Details of product -:"+ prd3);
        display(prd4,price4,QNT4,phone4,processor4);

        // System.out.println(" Details of product -:"+ prd4);
        display(prd5,price5,QNT5,phone5,processor5);
    }

    void available(int a,int b,int c,int d,int f){
        Main Obj1 = new Main();
        Main Obj2 = new Main();
        Main Obj3 = new Main();
        Main Obj4 = new Main();
        Main Obj5 = new Main();


        System.out.println(Obj1.prd1+" ="+(Obj1.QNT1 - a));
        System.out.println(Obj2.prd2+" ="+(Obj2.QNT2-b));
        System.out.println(Obj3.prd3+" ="+(Obj3.QNT3-c));
        System.out.println(Obj4.prd4+" ="+(Obj4.QNT4-d));
        System.out.println(Obj5.prd5+" ="+(Obj5.QNT5-f));


    }

    void sale(int a,int b,int c,int d,int f){
        Main Obj1 = new Main();
        Main Obj2 = new Main();
        Main Obj3 = new Main();
        Main Obj4 = new Main();
        Main Obj5 = new Main();

        System.out.println(Obj1.prd1+" ="+a);
        System.out.println(Obj2.prd2+" ="+b);
        System.out.println(Obj3.prd3+" ="+c);
        System.out.println(Obj4.prd4+" ="+ d);
        System.out.println(Obj5.prd5+" ="+f);
    }
}

class Main extends Main1{
    public static void main(String[] args)
    {
        Main1 Obj1 = new Main1();
        Main1 Obj2 = new Main1();
        Main1 Obj3 = new Main1();
        Main1 Obj4 = new Main1();
        Main1 Obj5 = new Main1();

        Main k = new Main();
        k.List();
        k.Detail();
        System.out.println("Available product -:");
        System.out.println("               ");
        k.available(0,0,0,0,0);
        System.out.println("                ");
        System.out.println("YOUR CART -:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of 1st phone  (Available -:"+Obj1.QNT1+")");
        int s1 = sc.nextInt();
        System.out.println("Enter No of 2nd phone  (Available -:"+Obj2.QNT2+")");
        int s2 = sc.nextInt();
        System.out.println("Enter No of 3rd phone  (Available -:"+Obj3.QNT3+")");
        int s3 = sc.nextInt();
        System.out.println("Enter No of 4th phone  (Available -:"+Obj4.QNT4+")");
        int s4 = sc.nextInt();
        System.out.println("Enter No of 5th phone  (Available -:"+Obj5.QNT5+")");
        int s5 = sc.nextInt();


        k.sale(s1,s2,s3,s4,s5);

        System.out.println("        ");
        System.out.println("Available product -:");


        k.available(s1,s2,s3,s4,s5);
        System.out.println("        ");

        System.out.println("TOTAL BILL -: ");
        k.cash(Obj1.price1,Obj1.QNT1,s1,Obj1.phone1);
        k.cash(Obj2.price2,Obj2.QNT2,s2,Obj2.phone2);
        k.cash(Obj3.price3,Obj3.QNT3,s3,Obj3.phone3);
        k.cash(Obj4.price4,Obj4.QNT4,s4,Obj4.phone4);
        k.cash(Obj5.price5,Obj5.QNT5,s5,Obj5.phone5);

        System.out.println("PROFIT ISS::::");
        int i1 = k.profit(Obj1.price1, Obj1.cost1, s1);
        int i2 =k.profit(Obj2.price2, Obj2.cost2, s2);
        int i3 =k.profit(Obj3.price3, Obj3.cost3, s3);
        int i4 =k.profit(Obj4.price4, Obj4.cost4, s4);
        int i5 =k.profit(Obj5.price5, Obj5.cost5, s5);



        System.out.println("OverAll Profit");
        System.out.println(i1 +i2+i3+i4+i5);

    }
}