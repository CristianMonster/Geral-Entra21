import java.util.Scanner;

public class logica_exercicio24 {

    public static String ArrayChallange(String[] strArr){
        strArr[0] = strArr[0].toLowerCase();
        strArr[1] = strArr[1].toLowerCase();
        String[] strArr2 = strArr[1].split(",");
        for(int i = 0; i < strArr[0].length(); i++){
            for(int j = 0; j < strArr2.length; j++){
                if(strArr[0].substring(0, i).equals(strArr2[j])){
                    for(int k = 0; k < strArr2.length; k++){
                        if(strArr[0].substring(i).equals(strArr2[k])){
                            return strArr[0].substring(0, i) + "," + strArr[0].substring(i);
                        }
                    }
                }
            }
        }
        return strArr[0];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(ArrayChallange(new String[]{"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"}));
    }
}