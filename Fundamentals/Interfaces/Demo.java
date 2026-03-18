package Interfaces;

// creating a camera interface
interface Camera {
    // in interface every method has default in public abstract ,so we dont create a object for interfaces
    void takePhoto();
}

class Canon implements Camera {
    
    public void takePhoto() {
        System.out.println("Taking Photo ....(canon)");
    }
}

class Epson implements Camera {

    public void takePhoto() {
        System.out.println("Taking Photo ....(epson)");
    }
}

class Photographer {
    public void photo(Camera obj) {
        // taking photo
        obj.takePhoto();
    }
}

public class Demo {
    public static void main(String[] args) {
        // creating object
        // we can assign refernce type as a interface
        Camera obj = new Canon();
        Camera obj2 = new Epson();
        Photographer pg = new Photographer();
        pg.photo(obj2);
    }
}
