package com.Chokealot.Labb2.jUnit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //OM du vill testa dina egna värden så har du en fungerande "miniräknare/textprocessor"!
    //Längst ner finns metoderna med variabler som du kan köra istället för detta

        Scanner sc = new Scanner(System.in);
        TextProcessor tp = new TextProcessor();
        Calculator calculator = new Calculator();

        System.out.println("\n********************\n\tWelcome!\n********************");
        System.out.println("Menu\n\t1. Calculator");
        System.out.println("\t2. TextProcessor");
        System.out.println("\t9. Exit");
        int choice = sc.nextInt();
        do {
            if (choice == 1)    {
                System.out.println("Calculator:");
                System.out.println("1. Add\n2. Subtract\n3. Divide\n4. Multiple\n9. Exit");
                int choice2 = sc.nextInt();
                switch (choice2)    {
                    case 1 : {
                        System.out.println("Adding : A + B");
                        System.out.println("A = ");
                        int a = sc.nextInt();
                        System.out.println("B = ");
                        int b = sc.nextInt();
                        System.out.println(calculator.add(a,b));
                        break;
                    }
                    case 2 : {
                        System.out.println("Subtracting : A - B");
                        System.out.println("A = ");
                        int a = sc.nextInt();
                        System.out.println("B = ");
                        int b = sc.nextInt();
                        System.out.println(calculator.subtract(a,b));
                        break;
                    }
                    case 3 : {
                        System.out.println("Dividing : A / B");
                        System.out.println("A = ");
                        int a = sc.nextInt();
                        System.out.println("B = ");
                        int b = sc.nextInt();
                        System.out.println(calculator.divide(a,b));
                        break;
                    }
                    case 4 : {
                        System.out.println("Multiple : A * B");
                        System.out.println("A = ");
                        int a = sc.nextInt();
                        System.out.println("B = ");
                        int b = sc.nextInt();
                        System.out.println(calculator.multiple(a,b));
                        break;
                    }
                    case 9 : {

                        return;
                    }
                }
            }
            if (choice == 2)    {
                System.out.println("TextProcessor:");
                sc.nextLine();
                System.out.println("Enter string for subject to change:");
                String change = sc.nextLine();
                if(change.equals("9"))  {
                    return;
                }
                System.out.println("1. All to upperCase\n2. All to lowerCase\n3. Reverse String\n9. Exit");
                int choice3 = sc.nextInt();
                switch (choice3)    {
                    case 1 : {
                        System.out.println(tp.upperCase(change));
                        break;
                    }
                    case 2 : {
                        System.out.println(tp.lowerCase(change));
                        break;
                    }
                    case 3 : {
                        System.out.println(tp.reverseString(change));
                        break;
                    }
                    case 9 : {
                        return;
                    }
                }
            }
        }while (choice != 9);


//Metoder för Calculator
        int a = 72;
        int b = 9;

        calculator.add(a,b);
        calculator.subtract(a,b);
        calculator.divide(a,b);
        calculator.multiple(a,b);

//Metoder för TextProcessor
        String testUpperToLower = "HEJSAN";
        String testLowerToUpper = "hejsan";
        String testReversed = "Hejsan";

        System.out.println(tp.lowerCase(testUpperToLower));
        System.out.println(tp.upperCase(testLowerToUpper));
        System.out.println(tp.reverseString(testReversed));

    }
}
