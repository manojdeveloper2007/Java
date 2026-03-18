public class Conditional {
    public static void main(String[] args) {
        String festival = "Diwali Festival";

        // Check if the festival is Pongal then greet "Happy Pongal",Otherwise Not Greet

        if (festival == "Pongal Festival"){
            System.out.println("Happy Pongal to you all");
        }

        else if(festival == "Diwali Festival"){
            System.out.println("Happy Diwali to you all");
        }

        else{
            System.out.println("There is no Festival Today");
        }
    }
}
