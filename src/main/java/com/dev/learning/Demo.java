//REV-String :
//Note : Strings --> Immutable in java by default

package com.dev.learning;

public class Demo{
    public static void main(String[] args) {
        //Strings in java are immutable by default.
        //Strings can be made mutable by -> StringBuffer and StringBuilder.
        StringBuffer sb  = new StringBuffer();
        System.out.println(sb.capacity());

    }
}