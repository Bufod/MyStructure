package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class MyStructure implements Iterable<Integer>{
    private int arr[] = new int[10];

    public int getItem(int index){
        if (index >= 0 && index < arr.length)
            return arr[index];
        else
            return 0;
    }

    public void setItem(int index, int el){
        if (index >= 0 && index < arr.length)
            arr[index] = el;
    }

    public int length(){
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator(this);
    }
}
