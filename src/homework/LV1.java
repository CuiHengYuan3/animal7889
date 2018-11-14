package homework;

import java.util.Arrays;

public class LV1 {
    public static boolean IsNumber(String A) {
        for (int i = 0; i < A.length(); i++) {
            if (!Character.isDigit(A.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsupperCase(String A) {
        for (int i = 0; i < A.length(); i++) {
            if (!Character.isUpperCase(A.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void TurnUperCase(String A) {
        if (IsupperCase(A) || IslowerCase(A)) {
            A.toUpperCase();
            System.out.println(A);
        }

    }

    public static boolean IslowerCase(String A) {
        for (int i = 0; i < A.length(); i++) {
            if (!Character.isLowerCase(A.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a='1';
        System.out.println(a);
        String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String[] strings = str.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + "\t");
        }
        for (int i = 0; i < strings.length; i++) {
            if (IsNumber(strings[i])) {
                System.out.println("第" + (i + 1) + "个字符串全是数字");
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (IsupperCase(strings[i])) {
                System.out.println("第" + (i + 1) + "个字符串全是大写字母");
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (IslowerCase(strings[i])) {
                System.out.println("第" + (i + 1) + "个字符串全是小写字母");
            }
        }
        for (int i = 0; i < strings.length; i++) {
            TurnUperCase(strings[i]);
        }

        for (int i = 0; i < strings.length; i++) {
            if (IsNumber(strings[i])) {
                char [] storeNumber = new char [strings[i].length()];
                for (int j = 0; j < strings[i].length(); j++) {
                    storeNumber[j] = strings[i].charAt(j);
                }
                Arrays.sort(storeNumber);
                for (int j = 0; j < storeNumber.length; j++) {
                    System.out.print(storeNumber[j]);
                }
                System.out.println();
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (IsupperCase(strings[i]) || IslowerCase((strings[i]))) {
                char [] storeNumber = new char [strings[i].length()];
                for (int j = 0; j < strings[i].length(); j++) {
                    storeNumber[j] = strings[i].charAt(j);
                }
                Arrays.sort(storeNumber);
                for (int j = 0; j < storeNumber.length; j++) {
                    System.out.print(storeNumber[j]);
                }
            }
        }
    }

}