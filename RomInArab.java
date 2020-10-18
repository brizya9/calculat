public class RomInArab {


    public static String itoRome(int value) {
        if(value==1){
            return "I";
        }
        else if(value==2){
            return "II";
        }
        else if(value==3){
            return "III";
        }
        else if(value==4){
            return "IV";
        }
        else if(value==5){
            return "V";
        }
        else if(value==6){
            return "VI";
        }
        else if(value==7){
            return "VII";
        }
        else if(value==8){
            return "VIII";
        }
        else if(value==9){
            return "IX";
        }
        else if(value==10){
            return "X";
        }
        else if(value==0){
            return " ";
        }
        else if(value==20){
            return "XX";
        }
        else if(value==30){
            return "XXX";
        }
        else if(value==40){
            return "XL";
        }
        else if(value==50){
            return "L";
        }
        else if(value==60){
            return "LX";
        }
        else if(value==70){
            return "LXX";
        }
        else if(value==80){
            return "LXXX";
        }
        else if(value==90){
            return "XC";
        }
        else {
            return "";
        }
    }
    public static String itoArabic(int value) {
        if(value==100){
            return "C";
        }
        else if(value>10&&value<100){
            int value1=value%10;
            int value2=value-value1;
            String val1=itoRome(value1);
            String val2=itoRome(value2);
            return val2 +val1;
        }
        else if(value==0) {
            return "0";

        }
        else if(value<=10&&value>0) {
            String val=itoRome(value);
            return val;
        } else{
            return " ";
        }
    }

}
