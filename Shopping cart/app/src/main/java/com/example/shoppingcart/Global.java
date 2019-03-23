package com.example.shoppingcart;

import java.util.ArrayList;

public class Global{

    static ArrayList<CartProduct>  cart=new ArrayList<>() ;
    static double s1=0;

    public static  ArrayList<CartProduct> getCart() {
        return cart;
    }

    public static double getS1() {
        return s1;
    }

}
