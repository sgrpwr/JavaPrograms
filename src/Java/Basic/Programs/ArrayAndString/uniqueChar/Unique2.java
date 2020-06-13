package Java.Basic.Programs.ArrayAndString.uniqueChar;

public class Unique2 {
    
    public static boolean isUnique(String str){
        boolean barr[] = new boolean[256];
        if(str.length()>128) return false;
        for(int i = 0; i<str.length(); i++){
            if(barr[str.charAt(i)]) return false;
            barr[str.charAt(i)] = true;
        }
        return true;
    }
    
    public static void main(String[] args){
        String string = "asdfgh";
        if(isUnique(string)) System.out.println("Unique");
        else System.out.println("It is not unique Fella!!");
    }
}
