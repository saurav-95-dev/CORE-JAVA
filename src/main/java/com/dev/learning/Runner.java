//Stack-Implementation -- Basic:
package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.show();
        System.out.println("Popping top element:" +  stack.pop());
        System.out.println("After popping:");
        stack.show();
    }
}
