import java.util.Scanner;

public class ForCheckHw {
   static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
     //   printThreeNumb();
      //  sumNumb();
       // multiTable();
       // simpleNumbCheck();
        printTen();
    }
    public static void printThreeNumb(){

        for (int numb =1; numb<=100; numb++){
            if (numb % 3==0){
                System.out.println(numb);
            }

        }
    }
    public  static void sumNumb(){
        System.out.println("введите число и нажмите Enter");
        int sum = 0;
        int n = scanner.nextInt();
        for(int numb = 0; numb <= n; numb++){
            sum += numb;
        }
        System.out.println("Cумма всех чисел "  + sum);
    }
   public static void multiTable(){
       System.out.println("введите число и нажмите Enter");
        int numb = scanner.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(numb + " * "+i + " = "+numb*i);
        }
   }
   public static void simpleNumbCheck(){
        int numb = scanner.nextInt();
        boolean isPrime = true;
        String result = "Число простое";
        if(numb == 0 || numb ==1){
            System.out.println("Число не простое");
            isPrime = false;
        }else if (numb % 2 == 0){
            System.out.println("Число не простое");
            isPrime = false;
        }
        else {
            for (int checkStep=3; checkStep<=numb; checkStep++){
                if( checkStep<numb && numb%checkStep==0){
                    result = "не простое";
                    isPrime = false;
                    break;
                }else {
                    result = " простое";
                }
            }
            System.out.println("Ваше число " + result +" "+isPrime);
        }
   }
   public static void printTen(){
        for (int numb = 1; numb <=10; numb++){
            System.out.println(numb);
        }
   }
}
