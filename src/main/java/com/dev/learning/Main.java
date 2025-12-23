package com.dev.learning;

class Demo {
    static int x = 12;

    static{
        System.out.println("Static block executed");
    }

    int y = 11;

    Demo(){
        System.out.println("Constructor executes");
    }
    void show(){
        System.out.println("Show block executed");
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println("Main started");
        Demo demo = new Demo();
        demo.show();
        System.out.println("Main ended");
    }
}

//LIFE-CYCLE :
//Class loading -> Linking(Verification , Preparation , Resolution) -> Initialization -> main() -> Object creation(Triggers : instance variable initialization, constructor execution) -> Method Execution -> Program Ends -> Class unload(done by garbage collector)

//In-short :
//Loading -> Linking -> initialization -> method execution -> unloading