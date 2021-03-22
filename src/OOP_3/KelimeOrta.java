package OOP_3;

public class KelimeOrta {
    public static void main(String[] args) {
        orta("mehmet");
    }
    public static void orta (String a){
        if((a.length()) % 2 == 0){
            int b=(a.length()+1)/2;
            char result1=a.charAt(b-1);
            char result2=a.charAt(b);
            System.out.print(result1);
            System.out.println(result2);

        }else {
            char result=a.charAt(a.length()/2);
            System.out.println(result);
        }
        System.out.println("=====================");

        int sum=sumOfDigits(123);
        System.out.println(sum);
    }
    private static int sumOfDigits(int number){

        String str=String.valueOf(number);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum+=Integer.valueOf(String.valueOf(str.charAt(i)));

        }
        return sum;




    }
}
