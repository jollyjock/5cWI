package AlgoDat.Addieren;

public class Adder {
    public static void main(String[] args) {
        int num1 = 12444;
        int num2 = 12499;

        char[] num1Array = String.valueOf(num1).toCharArray();
        char[] num2Array = String.valueOf(num2).toCharArray();
        int[] resultArray = new int[num1Array.length];

        String res = "";
        int remember = 0;
        for (int i = num1Array.length -1; i >= 0 ; i--) {
            int sum = Character.getNumericValue(num1Array[i]) + Character.getNumericValue(num2Array[i]) + remember;
            remember = sum / 10;
            sum = sum % 10;
            System.out.println(sum);
            res = sum + res;
            
        }

        System.out.println("test : " + res);
    }
}
