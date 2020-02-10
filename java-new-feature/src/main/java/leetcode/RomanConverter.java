package leetcode;

import java.util.Scanner;

/**
 * @auther guan.c.wang
 * @date 2/9/2020.
 * @see
 */
public class RomanConverter {
     // i 1
    //  V  X  5 , 10
    // L C  50 , 100
    // D M 500 , 1000

    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int inputNum = scanner.nextInt();
            String romanNum = romanConvert(inputNum);
            System.out.println(romanNum);
        }
    }

    private static String romanConvert(int inputNum) throws Exception {
        int qian = inputNum / 1000;
        int bai  = (inputNum % 1000) / 100;
        int shi = (inputNum % 100 )/ 10;
        int ge = (inputNum % 10 );
        String s = qian + " - " + bai +" - "+ shi + " - " +ge;
        if(qian >= 4){
            throw new Exception("larger than 3999");
        }
        String qianRoman = getRomanWord(qian, Position.QIAN);
        String baiRoman = getRomanWord(bai, Position.BAI);
        String shiRoman = getRomanWord(shi, Position.SHI);
        String geRoman = getRomanWord(ge, Position.GE);


        return  qianRoman+baiRoman+shiRoman+geRoman ;
}

    private static String getRomanWord(int num, Position position) throws Exception {
            switch ( position) {
                case QIAN:
                    return reproduce("M" , num);
                case BAI:
                    if(num <= 3 ){
                     return    reproduce("C" ,num);
                    }else if( num == 4 ){
                        return "CD";
                    }else if(num == 5){
                       return  "D";
                    }else if( num <= 6 && num <= 8){
                        return "D" + reproduce("C" , num  -5 );
                    }else{
                        return "CM";
                    }
                case SHI:
                    if(num <= 3 ){
                        return    reproduce("X" ,num);
                    }else if( num == 4 ){
                        return "XL";
                    }else if(num == 5){
                        return  "L";
                    }else if(num >= 6 && num <= 8){
                        return "L" + reproduce("X" , num  -5 );
                    }else{
                        return "XC";
                    }
                case GE:
                    if(num <= 3 ){
                        return    reproduce("I" ,num);
                    }else if( num == 4 ){
                        return "IV";
                    }else if(num == 5){
                        return  "V";
                    }else if( num >=6 && num <= 8){
                        return "V" + reproduce("I" , num  -5 );
                    }else{
                        return "IX";
                    }
                default:
                    throw  new Exception("No Such Position");
        }
    }

    private static String reproduce(String s, int num) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    enum  Position{
        QIAN , BAI , SHI, GE
}



}
