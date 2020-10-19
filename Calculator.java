import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        String num1  = null ;
        String num2  = null;
        String operation = null;
        int value1 = 0;
        int value2 = 0;
        System.out.println("Введите 2  целых числа  и операцию через пробел в одну строчку");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.next();
        operation = scanner.next();
        num2 = scanner.next();
        ArabicNumbers arab=new ArabicNumbers();
        value1 = arab.toArabic(num1);
        value2 = arab.toArabic(num2);
        RomInArab arab2=new RomInArab();
        boolean k1=false;
        boolean k2=false;
        String[] arab3=new String[]  {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (int i = 0; i < arab3.length; i++) {
            if(num1.equals(arab3[i])) {
                k1 = true;
                break;
            }
        }
        
        for (int i = 0; i < arab3.length; i++) {
            if(num2.equals(arab3[i])) {
                k2 = true;
                break;
            }
        }
        boolean s1=false;
        boolean s2=false;
        String[] roman=new String[]  {"1","2","3","4","5","6","7","8","9","10"};
        for (int i = 0; i < roman.length; i++) {
            if(num1.equals(roman[i])) {
                s1 = true;
                break;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if(num2.equals(roman[i])) {
                s2 = true;
                break;
            }
        }
        boolean t1=false;
        String[] oper=new String[]  {"+","-","*","/"};
        for (int i = 0; i < oper.length; i++) {
            if(operation.equals(oper[i])) {
                t1 = true;
                break;
            }
        }
        boolean t2=false;
        t2 = (((s1  && s2 ) || (k1  && k2 )) && t1 ) == true ? true : false;
        try {
            if ( t2 == false) {
                throw new Exception("Непонятно что введено");
            }

            if (operation.equals("+")) {
                if (s1 && s2) {
                    System.out.println(value1 + value2);
                } else if (k1 && k2) {
                    System.out.println(arab2.itoArabic(value1 + value2));
                }
            }
            if (operation.equals("-")) {
                if (s1 && s2) {
                    System.out.println(value1 - value2);
                } else if (k1 && k2) {
                    System.out.println(arab2.itoArabic(value1 - value2));
                }
            }
            if (operation.equals("*")) {
                if (s1 && s2) {
                    System.out.println(value1 * value2);
                } else if (k1 && k2) {
                    System.out.println(arab2.itoArabic(value1 * value2));
                }
            }
            if (operation.equals("/")) {
                if (s1 && s2) {
                    System.out.println(value1 / value2);
                } else if (k1 && k2) {
                    System.out.println(arab2.itoArabic(value1 / value2));
                }
            }
        }catch(Exception ex) {
                System.out.println(ex.getMessage());
    }
            }

    }
