package com.company.data_structures.stacks;

public class SApp {

    public static void stackApp(){
        Stack stack = new Stack(3);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.println(value);
        }

        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str){
        int i = 0;
        int strLength = str.length();
        StringStack stringStack = new StringStack(strLength);
        while (i < strLength){
            stringStack.push(str.charAt(i));
            i++;
        }
        String reversedString = "";
        while (!stringStack.isEmpty()){
            reversedString += stringStack.pop();
        }
        return reversedString;
    }
}
