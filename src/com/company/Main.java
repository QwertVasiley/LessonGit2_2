package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Пользователь вводит 2 числа. Проверить кратное ли первое второму
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Int first : ");
        int first = scanner.nextInt();
        System.out.print("Int second : ");
        int second = scanner.nextInt();


        if (second == 0) {
            System.out.println("Ай-ай-ай, мы не делим на НОЛЬ");
        }
        else {int result = first/second;
            if (result * second == first) {
                System.out.println("числа кратны");
            }
            else if (result * second != first) {
                System.out.println("числа не кратны");
            } }
    }
}
