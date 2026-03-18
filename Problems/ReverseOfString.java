public class ReverseOfString {

    public static String reverseString(String str){
        char[] charArr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            char tem = charArr[i];
            charArr[i] = charArr[j]; 
            charArr[j] = tem;
            i++;
            j--;
        }
        // for (char c : charArr) {
        //     System.out.print(c+"");
        // }
        return new String(charArr);
    }
    public static void main(String[] args) {
        String res = reverseString("Manoj");
        System.out.println(res);
    }
}
