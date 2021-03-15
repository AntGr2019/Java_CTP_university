//Класс, содержащий метод main, определяющий принадлежность каждого аргумента командной строки
//к словам-палиндромам, а также методы reverseString (для поворота строки) и
//isPalindrome (определяющий, является ли строка палиндромом)
public class Palindrome {
    //метод определяет принадлежность каждого аргумента командной строки к словам-палиндромам
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            String s = args[i];
            if(isPalindrome(s)){
                System.out.println("\nWord "+ s + " is palindrome. \n");
            }
        }
    }
    //метод поворота строки
    public static boolean isPalindrome(String s){
        String reverseS = reverseString(s);
        //System.out.println("Compare 2 words: " + s + " and " + reverseS + ".");
        return s.equals(reverseS);
    }

    //метод, определяющий, является ли строка палиндромом
    public static String reverseString(String str){
        String reverseString = "";
        for(int i = str.length()-1; i>=0; i--){
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
}
