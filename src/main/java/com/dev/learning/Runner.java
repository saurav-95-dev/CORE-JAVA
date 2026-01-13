//Stack-Implementation -- Basic:
package com.dev.learning;

class Runner{
    public static void main(String[] args){
        System.out.println("Inside main function:");
        Stack stack = new Stack();
        System.out.println("Is Stack empty : " + stack.isEmpty());
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
        //Implementing size and isEmpty :
        System.out.println("Stack size : " + stack.size());
        System.out.println("After pushing 3 more elements:");
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.show();
        System.out.println();
        System.out.println("Stack size : " + stack.size());
        System.out.println("Is Stack empty : " + stack.isEmpty());
        stack.push(8);
        System.out.println();
        stack.show();
        System.out.println();
        stack.push(9);
        System.out.println("Poping elements:");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        System.out.println();
        stack.pop();
        System.out.println();

    }
}

