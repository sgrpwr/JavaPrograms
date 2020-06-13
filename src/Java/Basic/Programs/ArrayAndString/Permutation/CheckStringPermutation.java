package Java.Basic.Programs.ArrayAndString.Permutation;

public class CheckStringPermutation {

    private static boolean CheckPermutation(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;

        //boolean bArr[] = new boolean[256];
        int[] bArr = new int[256];

        for (int i=0; i<str1.length(); i++){
            bArr[str1.charAt(i)]++;
        }

        for (int i=0; i<str2.length(); i++){
            bArr[str2.charAt(i)]--;
            if(bArr[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "ABC", str2 = "CBA";
        if(CheckPermutation(str1,str2)) System.out.println("They are Permutation of each other!");
        else System.out.println("They aren't Fella!");
    }
}
