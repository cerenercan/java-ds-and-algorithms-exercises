package com.company.data_structures.queues;

public class QApp {

    public static void queueApp(){
        Queue queue = new Queue(5);
        queue.insert(100);
        queue.insert(1000);
        queue.insert(14);
        queue.insert(12);
        queue.insert(44);
        queue.view();
    }
}
