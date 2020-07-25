package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        MyStructure arr = new MyStructure();

        for(int i = 0; i < arr.length(); i++)
            arr.setItem(i, i+1);


        for(int item : arr){
            System.out.print(item + " ");
        }

    }
}

