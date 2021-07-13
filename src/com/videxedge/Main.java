package com.videxedge;

import java.util.Scanner;

public class Main {

    public static void q1(){
        Scanner input = new Scanner(System.in);
        double h1, h2;
        System.out.println ("Enter 1st height:");
        h1 = input.nextDouble();
        System.out.println ("Enter 2nd height:");
        h2 = input.nextDouble();
        System.out.println ("The diff is: "+Math.abs(h1-h2));
    }

    public static void q2(){
        Scanner input = new Scanner(System.in);
        int grade1, grade2, grade3, grade4;
        System.out.println ("Enter 1st grade:");
        grade1 = input.nextInt();
        System.out.println ("Enter 2nd grade:");
        grade2 = input.nextInt();
        System.out.println ("Enter 3rd grade:");
        grade3 = input.nextInt();
        System.out.println ("Enter 4th grade:");
        grade4 = input.nextInt();
        System.out.println ("The max grade is: "+Math.max(Math.max(grade1,grade2),Math.max(grade3,grade4)));
        double average = (grade1+grade2+grade3+grade4)/4;
        System.out.println ("The average grade is: "+average);
        System.out.println ("The grade1 diff is: "+Math.abs(grade1-average));
        System.out.println ("The grade2 diff is: "+Math.abs(grade2-average));
        System.out.println ("The grade3 diff is: "+Math.abs(grade3-average));
        System.out.println ("The grade4 diff is: "+Math.abs(grade4-average));
    }

    public static void q3(){
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.println ("Enter the x value:");
        x = input.nextDouble();
        y = Math.pow(x,3)+6*Math.pow(x,2)-10;
        System.out.println ("The y is: "+y);
    }

    public static void q4(){
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.println ("Enter the x value:");
        x = input.nextDouble();
        y = Math.sqrt(Math.pow(x,2)-4*x-12);
        System.out.println ("The y is: "+y);
    }

    public static void q5(){
        Scanner input = new Scanner(System.in);
        int number;
        double num;
        System.out.println ("Enter number:");
        number = input.nextInt();
        num = (double)number;
        System.out.println ("Round 1st method is: "+100*Math.round(num/100));
        System.out.println ("Round 2nd method is: "+(100*(number/100)+100*((number%100)/50)));
    }

    public static void q6(){
        System.out.println (Math.min(7,Math.min(2,Math.min(3,Math.min(4,6)))));
    }

    public static void q7(){
        Scanner input = new Scanner(System.in);
        double price;
        int shekel, agora;
        System.out.println ("Enter price:");
        price = input.nextDouble();
        shekel = (int)Math.floor(price);
        agora = (int) ((100*price)%100);
        System.out.println ("Amount of shekels is: "+shekel);
        System.out.println ("Amount of agorot is: "+agora);
    }

    public static void q8(){
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println ("Enter radius:");
        radius = input.nextDouble();
        System.out.println ("Circumference of the circle: "+2*radius*Math.PI);
        System.out.println ("Circle area: "+Math.PI*Math.pow(radius,2));
        System.out.println ("Surface of the ball: "+4*Math.PI*Math.pow(radius,2));
        System.out.println ("Volume of the ball: "+4*Math.PI*Math.pow(radius,3)/3);
    }

    public static void q9(){
        Scanner input = new Scanner(System.in);
        double a, b, c, p;
        System.out.println ("Enter 1st side:");
        a = input.nextDouble();
        System.out.println ("Enter 2nd side:");
        b = input.nextDouble();
        System.out.println ("Enter 3rd side:");
        c = input.nextDouble();
        p = (a+b+c)/2;
        System.out.println ("Area of the triangle: "+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    public static void q10(){
        Scanner input = new Scanner(System.in);
        int time1, time2, diff;
        System.out.println ("Enter 1st time:");
        time1 = input.nextInt();
        System.out.println ("Enter 2nd time:");
        time2 = input.nextInt();
        time1 = 60*(time1/100)+time1%100;
        time2 = 60*(time2/100)+time2%100;
        diff = Math.abs(time1-time2);
        System.out.println ("Diff time is: "+diff/60+":"+diff%60);
    }

    public static void main(String[] args) {
        q1();
//        q2();
//        q3();
//        q4();
//        q5();
//        q6();
//        q7();
//        q8();
//        q9();
//        q10();
    }
}
