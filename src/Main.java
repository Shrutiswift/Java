package src;

import java.util.Scanner;

class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        byte first = input.nextByte();
        byte second = input.nextByte();
        System.out.println("Enter the operator: ");
        char operator = input.next().charAt(0);
        byte result;
        switch(operator) {
            case '+':
                result = (byte) (first + second);
                break;
            case '-':
                result = (byte) (first - second);
                break;
            default:
                System.out.println("Sorry! ");

                return;
        }
            System.out.println(result);

        }
}






































































