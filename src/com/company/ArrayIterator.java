package com.company;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer>{
    private MyStructure arr;
    private int cursor = 0;

    ArrayIterator(MyStructure arr){
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return cursor < arr.length();
    }

    @Override
    public Integer next() {
        return arr.getItem(cursor++);
    }
}
