public class TypeCasting {
    public static void main(String[] args) {
        // Type Conversion  (Smaller Size to Bigger Size)
        byte b=120;
        int num=b;
        System.out.println("Byte to Integer : "+num);
        float fl=num;
        System.out.println("Integer to Float : "+fl);

        // TypeCasting
        // We cannot convert float to int (Bigger Size to Smaller Size)
        double ph_num=97911124;
        int number=(int)ph_num;
        System.out.println("Double to Integer : "+number);
        byte ph=(byte)number;
        System.out.println("Integer to Byte : "+ph);
    }
}
