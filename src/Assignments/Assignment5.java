package Assignments;

import java.util.*;
abstract class shape {

    private double dimen1,dimen2;

    double getDimen1(){
        return dimen1;
    }

    double getDimen2(){
        return dimen2;
    }

    shape(){};

    shape(double a,double b){
        dimen1=a;
        dimen2=b;
    }

    abstract double compute_area();

    void read() {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER  FIRST  DIMENSION :  ");
        dimen1=sc.nextDouble();
        System.out.print("ENTER SECOND  DIMENSION :  ");
        dimen2=sc.nextDouble();
    }

}

//======================= CLASS triangle =======================//
class triangle extends shape{

    double area;

    triangle(){

    }

    triangle(double base, double height){
        super(base,height);
    }


    double compute_area() {
        area=(getDimen1()*getDimen2())/2;
        return area;
    }
}


//======================= CLASS rectangle =======================//
class rectangle extends shape {

    double area;

    rectangle(){}

    rectangle (double length, double breadth) {
        super(length,breadth);
    }

    double compute_area() {
        area=(getDimen1()*getDimen2());
        return area;
    }

}


//======================= CLASS Main =======================//
public class Assignment5 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int x;			//switch case variable
        shape s;		//reference variable of super class shape
        do {
            System.out.print("\n\t  MENU\n\t1.Triangle\n\t2.Rectangle \n\t3.Exit\n\tChoice ::");

            x=sc.nextInt();
            System.out.println();
            switch(x)
            {
                case 1:			//area of triangle by parameterized constructor

                    double a,b;
                    System.out.print("ENTER BASE OF TRIANGLE:  ");
                    a=sc.nextDouble();		//read dimension 1 from user
                    System.out.print("ENTER HEIGHT OF TRIANGLE:  ");
                    b=sc.nextDouble();		//read dimension 2 from user

                    triangle t= new triangle(a,b);
                    //reference variable of shape and object type of triangle
                    s=t;
                    System.out.println("AREA OF TRIANGLE IS  :  "+ s.compute_area());
                    //displaying area of triangle
                    System.out.println("=======================================================");
                    break;


                case 2:		//area of rectangle by default constructor

                    rectangle r= new rectangle();
                    //reference variable of shape and object type of rectangle class
                    s=r;
                    s.read();		//call to read function
                    System.out.println("AREA OF RECTANGLE IS  :  "+ s.compute_area());
                    System.out.println("=======================================================");
                    break;


                case 3:			//Exited
                    System.out.println("   EXITED SUCCESSFULLY  ");
                    System.out.println("=======================================================");
                    break;


                default:		//default case
                    System.out.println("  INVALID  INPUT  ");
                    System.out.println("=======================================================");

            }
        }while(x!=3);	//loop breaks when input x=3

        sc.close();		//closing of scanner class
    }
}