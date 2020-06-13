package Java.Basic.Programs.ArrayAndString.uniqueChar;


public class Unique {

    public static boolean isUnique(String str){
        char[] ch = str.toCharArray();
        int l1 = str.length();
        for (int i=0; i<l1; i++){
            for(int j=0;j<l1;j++){
                if(ch[i]==ch[j] & i!=j){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str="asdfgh ";
        if(isUnique(str)){
            System.out.println("Unique");
        }
        else{
            System.out.println("Not Unique");
        }
    }


}


