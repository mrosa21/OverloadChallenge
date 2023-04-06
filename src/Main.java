public class Main {
    public static void main(String[] args) {
    System.out.println(convertToCentimeters(10));
    System.out.println(convertToCentimeters(5, 6));
    }

    public static double convertToCentimeters(int num){
        double cent = num * 2.54;
        return cent;
    }

    public static double convertToCentimeters(int feet, int inches){
        int feetToInch = feet * 12;
        int totalInch = feetToInch + inches;

        return convertToCentimeters(totalInch);
    }
}
