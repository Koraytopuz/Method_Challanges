public class Main {
    public static void main(String[] args) {
        System.out.println("5 ft , 8 in "+ convertToCentimeters(5,8)+" cm ") ;
        System.out.println("68 in "+ convertToCentimeters(68)+" cm ");
    }
    public static double convertToCentimeters(int inches){
         return  inches*2.54 ;
    }
    public static double convertToCentimeters(int feet,int inches){
        //return ((feet*12)+inches)*2.54;
        int feetToInches=feet*12;
        int totalInches=feetToInches+inches;
        double result=convertToCentimeters(totalInches);
        return result;
    }
}