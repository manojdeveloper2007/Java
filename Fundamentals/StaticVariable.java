// static variables are common for all objects

class Computer {
    
    String brand;
    String processor;
    int RAM;
    // This is static variable
    static String operatingSystem = "Windows";

    public void showDetails(String brand,String processor,String operatingSystem){
        System.out.println("Brand : "+brand);
        System.out.println("Processor : "+processor);
        System.out.println("Operating System : "+operatingSystem);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        
        Computer obj1 = new Computer();
        obj1.brand = "Acer";
        obj1.processor = "AMD Ryzon 9";
        obj1.RAM = 12;

        Computer obj2 = new Computer();
        obj2.brand = "Mac";
        obj2.processor = "Intel i9 core";
        obj2.RAM = 12;

        obj1.showDetails(obj1.brand, obj1.processor, Computer.operatingSystem);
        System.out.println();
        obj2.showDetails(obj2.brand, obj2.processor, Computer.operatingSystem);
    }
}
