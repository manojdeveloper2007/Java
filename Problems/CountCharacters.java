public class CountCharacters {

    public static void countCharacters(String str){
        char[] ch = str.toCharArray();

        int letter = 0;
        int space= 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < ch.length; i++) {
            
            if(Character.isLetter(ch[i])){
                letter++;
            }

            else if(Character.isDigit(ch[i])){
                digits++;
            }

            else if(Character.isSpaceChar(ch[i])){
                space++;
            }

            else {
                others++;
            }

        }
        System.out.println("Letters : "+letter);
        System.out.println("Digits : "+digits);
        System.out.println("Spaces : "+space);
        System.out.println("Others : "+others);
    }
    public static void main(String[] args) {
        String str = "Hello , Iam Manoj ! How are you ? Age is 27";
        countCharacters(str);
    }
}
