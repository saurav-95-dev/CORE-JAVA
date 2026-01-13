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
        stack.show();
        System.out.println();
        int p = stack.pop();
        System.out.println("This value has been popped -> " + p);
        stack.show();
        System.out.println();
        int s = stack.peek();
        System.out.println("Current element in the top (Peek): " + s);

    }
}

