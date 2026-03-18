// Given Input => 112.442.4.10
// Expected Output => 112[.]442[.]4[.]10

public class DefangingIP {

    public static String defangingIP(String IP){
        StringBuilder newIP = new StringBuilder();
        for(int i=0;i<IP.length();i++){
            char ch = IP.charAt(i);
            if(ch == '.'){
                newIP.append("[.]");
            }
            else{
                newIP.append(ch);
            }
        }
        return new String(newIP);
    }

    public static void main(String[] args) {
        String result = defangingIP("112.442.4.10");
        System.out.println(result);
    }
    
}
