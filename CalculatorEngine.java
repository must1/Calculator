import RomanNumberChangers.ArabicToRomanNumbersChanger;
import RomanNumberChangers.RomanException;
import RomanNumberChangers.RomanToArabicNumbersChanger;

import java.util.Scanner;

public class CalculatorEngine {
    private int firstArabicNumber;
    private int secondArabicNumber;
    private Scanner input = new Scanner(System.in);
    private Calculations calculations = new Calculations();
    private RomanToArabicNumbersChanger romanToArabicNumbersChanger = new RomanToArabicNumbersChanger();
    private ArabicToRomanNumbersChanger arabicToRomanNumbersChanger = new ArabicToRomanNumbersChanger();

    public void displayMainMenu() throws RomanException {
        int option;
        System.out.println("What do you want to do?\n1. Make calculations on arabic numbers\n2. Make calculations on roman numbers.\n");
        switch (input.nextInt()) {
            case 1: {
                displayCalculationsMenu();
                option = input.nextInt();
                getArabicNumbersToCalculate();
                System.out.println(getResultOfCalculations(option));
                break;
            }
            case 2: {
                displayCalculationsMenu();
                option = input.nextInt();
                getRomanNumbersToCalculate();
                StringBuilder result = arabicToRomanNumbersChanger.changeRomanToArabicNumber(getResultOfCalculations(option));
                System.out.println(result);
                break;
            }
        }
    }

    private void displayCalculationsMenu() {
        System.out.println("What  do you want to do?");
        System.out.println("1. Add\n2. Substract\n3. Multiply\n4. Divide");
    }

    private void getArabicNumbersToCalculate() {
        System.out.println("Input numbers");
        firstArabicNumber = input.nextInt();
        secondArabicNumber = input.nextInt();
    }

    private void getRomanNumbersToCalculate() throws RomanException {
        System.out.println("Input numbers");
        String firstRomanNumber = input.next();
        String secondRomanNumber = input.next();
        input.close();
        firstArabicNumber = romanToArabicNumbersChanger.getChangedFirstRomanToArabic(firstRomanNumber);
        secondArabicNumber = romanToArabicNumbersChanger.getChangedSecondRomanNumberToArabic(secondRomanNumber);
    }

    private int getResultOfCalculations(int option) {
        int result = 0;
        switch (option) {
            case 1: {
                result = calculations.add(firstArabicNumber, secondArabicNumber);
                break;
            }
            case 2: {
                result = calculations.substract(firstArabicNumber, secondArabicNumber);
                break;
            }
            case 3: {
                result = calculations.multiply(firstArabicNumber, secondArabicNumber);
                break;
            }
            case 4: {
                result = calculations.divide(firstArabicNumber, secondArabicNumber);
                break;
            }

        }
        return result;
    }

}

