public class Strings {
    public static void main(String[] args) {
        // Sequence of Characters is known as Strings and it is immutable
        // It is a Non primitive Data type

        String name = "Viraj";
        // The name 'viraj' stored in a string constant pool in heap memory
        System.out.println(name);

        String nickname = new String("Mahi");
        // it creates a new object in heap memory
        System.out.println(nickname);

        // StringBuilders and StringBuffer are mutable
        StringBuffer greet = new StringBuffer("Hello Buddy !");
        System.out.println(greet);
        greet.append("Manoj");
        System.out.println(greet);
        System.out.println(greet.charAt(6));
        System.out.println(greet.substring(0,5));
        System.out.println(greet.insert(2, " Bro "));

        // Almost StringBuffer and Stringbuilder are same

    }
}
