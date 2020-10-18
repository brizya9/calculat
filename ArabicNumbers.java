public class ArabicNumbers {

    public static int toArabic(String value){
        if(value.equals("I")||value.equals("1")) {
            return 1;
        }
        else if(value.equals("II")||value.equals("2")) {
            return 2;
        }
        else if(value.equals("III")||value.equals("3")) {
            return 3;
        }
        else if(value.equals("IV")||value.equals("4")) {
            return 4;
        }
        else if(value.equals("V")||value.equals("5")) {
            return 5;

        }
        else if(value.equals("VI")||value.equals("6")){
            return 6;
        }
        else if(value.equals("VII")||value.equals("7")){
            return 7;
        }
        else if(value.equals("VIII")||value.equals("8")) {
            return 8;
        }
        else if(value.equals("IX")||value.equals("9")){
            return 9;
        }
        else if(value.equals("X")||value.equals("10")) {
            return 10;
        }
        else {
            return 0;
        }
    }
}
