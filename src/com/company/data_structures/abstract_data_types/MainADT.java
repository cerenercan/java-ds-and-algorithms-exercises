package com.company.data_structures.abstract_data_types;

public class MainADT {

    public static void abstractDataTypes(){
        Counter counter = new Counter("Ceren");
        System.out.println("counter.getCurrentValue() called ->" + counter.getCurrentValue());
        counter.increment();
        System.out.println("counter.getCurrentValue() called -> " + counter.getCurrentValue());
        System.out.println("counter.toString() called -> " + counter.toString());

    }
}
