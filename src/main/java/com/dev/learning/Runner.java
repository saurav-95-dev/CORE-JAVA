//Stack-Implementation -- Basic:
package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        DynamicStackNew stack = new DynamicStackNew();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.show();
        System.out.println("Popping top element:" +  stack.pop());
        System.out.println("After popping:");
        stack.show();
        System.out.println("Current sz:" + stack.getSize());
        System.out.println("Peek:" + stack.peek());
        System.out.println("Popping top element:" +  stack.pop());
        System.out.println("After popping:");
        stack.show();
        System.out.println("Current sz:" + stack.getSize());
        System.out.println("Peek:" + stack.peek());
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Stack capacity now:" +  stack.capacity);
        System.out.println("Stack sz now : " + stack.getSize());

    }
}
