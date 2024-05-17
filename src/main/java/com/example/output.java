package com.example;
class Output
{
    public static void main(String args[])
    {
        int a,b,c,d;
        a=b=c=d=20;
        a+=b-=c*=d/=20;
        System.out.println(a+" "+b+" "+c+" "+d);

    }
}