class Computer{
    private String CPU;
    private String RAM;
    private String storage;
    //Private Constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }
}
