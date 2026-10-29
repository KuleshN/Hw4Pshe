import java.util.Scanner;

public class SwitchCaseHw {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        // daysWeek();
        //ticketPrice();
        //marks();
        //commands();
        calcus();


    }

    public static void daysWeek(){
        System.out.println("Введи от 1 до 7");
        int days = scanner.nextInt();
        switch (days) {
            case 1:
               System.out.println("Понедельник");
               break;
            case 2:
                System.out.println("Вторник");
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Необходимо ввести от 1 до 7");
        }
    }

    public static void ticketPrice(){
        System.out.println("ведите цифрой день недели от 1 до 5 если понедельник - пятница или 6-7 если суббота и воскресенье");
        int days = scanner.nextInt();
        int price = 300;
        switch (days){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                price = 300;
                break;
            case 6:
            case 7:
                price = 450;
                break;
            default:
                System.out.println("надо ввести день от 1 до 7");
        }
        System.out.println("Ваш билет стоит " + price+" рублей");

        }
    public static void marks(){
        int points = scanner.nextInt();
        int tens = points/10;
        switch (tens){
            case 10:
            case 9:
                System.out.println("Ваша оценка: A ");
                break;
            case 8:
                System.out.println("Ваша оценка: B ");
                break;
            case 7:
                System.out.println("Ваша оценка: C ");
                break;
            case 6:
                System.out.println("Ваша оценка: D ");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Ваша оценка: F ");
            default:
                System.out.println("Введеите быллы от 0 до 100");
                break;
        }
    }
    public static void commands(){
        String command = scanner.nextLine();
        switch (command){
            case "start"-> System.out.println("Система запущена");
            case "stop"-> System.out.println("Система остановлена");
            case "restart"-> System.out.println("Система перезапущена");
            case "status"-> System.out.println("Система исправна");
            default -> System.out.println("Неверная команда");
        }

    }
    public static void calcus (){
        System.out.println("введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("введите операцию +, - , * , /");
        String operationChar = scanner.next();
        System.out.println("введите второе число");
        int secondNumber = scanner.nextInt();


        int result =0;
        switch (operationChar){
            case "+":
               result = firstNumber + secondNumber;
               break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Неверная операция");
                break;
        }
        System.out.println("Результат операции: "+ result);

    }
    }


