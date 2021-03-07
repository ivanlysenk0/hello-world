package com.company;

public class Main {

    public static void main(String[] args) {
        double m,n,a,b,d;
        m = 9.9;
        n = 11;
        d = 10;
        a = Math.abs(m-d);
        b = Math.abs(n-d);
        if(a<b) {
            System.out.println(m+" ближе ");
        } else if(a>b) {
            System.out.println(n+" ближе ");
        } else {
            System.out.println("растояние от "+m+" до 10 = растояние от "+n+" до 10");
        }
    }
}
