package com.company.data_structures.abstract_data_types;

public class Counter {

    private final String str;
    private int value;

    public Counter(String str) {
        this.str = str;
        this.value = 0;
    }

    public void increment(){
       value++;
       System.out.println("increment() called. New value is: " + value);
    }

    public int getCurrentValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "str='" + str + '\'' +
                ", value=" + value +
                '}';
    }
}
