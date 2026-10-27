import java.util.Scanner;

public class IfElseCheckHw {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //numberChar();
        // numberMax();
        //printMark();
        //checkNumber();
        // System.out.println("Ваша скидка: "+checkDiscount() + "%");
        checkPoints();
    }


    public static void numberChar(){
        System.out.println("Введите значение: ");
        int number = scanner.nextInt();
        if (number >= 0){
            System.out.println(number + " положительное");
        }
        else{
            System.out.println(number + " отрицательное");
        }
    }

    public static void numberMax(){
        System.out.println("Введите первое значение: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе значение: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber>secondNumber){
            System.out.println(firstNumber + " первое число больше второго числа " + secondNumber);
        } else if (firstNumber<secondNumber) {
            System.out.println(secondNumber + " второе число больше первого числа " + firstNumber);

        } else {
            System.out.println(firstNumber + " первое число равно второму числу " + secondNumber);
        }

        }
    public static void printMark(){
        System.out.println("Введите оценку от 1 до 5 и нажмите Enter");
        int mark = scanner.nextInt();

        switch (mark){
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Неверная оценка");
                break;
        }
    }
    public static void checkNumber(){
        System.out.println("Введите число и нажмите Enter");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number+" число чётное");
        }
        else {
            System.out.println(number+" число нечётное");
        }
    }
    public static int checkDiscount() {
        System.out.println("Введите возраст и нажмите Enter");
        int discount = 0;
        int age = scanner.nextInt();
        if (age >= 0 && age <= 18) {
            discount = 25;
        } if(age >= 65) {
            discount = 30;
        }

        return discount;
    }
    public static void checkPoints(){
        System.out.println("Введите полученные баллы от 0 до 100");
        int point = scanner.nextInt();
        if(point >= 90&& point<=100){
            System.out.println("Отлично");
        }else if (point>=75 && point <=89){
            System.out.println("Хорошо");
        }else if (point>=60 && point <=74){
            System.out.println("Удовлетворительно");
        }else if (point<60 && point>=0){
            System.out.println("Неудовлетворительно");
        }else {
            System.out.println("Введите баллы ещё раз от 0 до 100");
        }

    }
}