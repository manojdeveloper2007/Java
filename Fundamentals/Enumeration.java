// enum => enumeration

enum DAY {
    MONDAY ,TUESDAY ,WEDNESDAY ,THURSDAY ,FRIDAY ,SATURDAY ,SUNDAY;
}

enum PaymentMode {
    // these are objects
    CASH(0) , UPI(5) , CARD(2);

    private int discount;

    // create constructor
    private PaymentMode(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}


public class Enumeration {
    
    public static void main(String[] args) {
        DAY[] d = DAY.values();

        for(DAY dd : d){

            switch(dd) {

            case SATURDAY,SUNDAY -> System.out.println("Weekend");

            default -> System.out.println("Weekday");

            }
        }

        System.out.println();
        PaymentMode pay = PaymentMode.UPI;
        int dis = pay.getDiscount();
        int price = 1000;
        double discountedPrice = (price * dis)/100 ;
        System.out.println("Discounted price : "+discountedPrice);
        
    }
}
