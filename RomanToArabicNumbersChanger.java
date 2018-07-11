public class RomanToArabicNumbersChanger {

    private int changeRomanToArabicNumber(String romanNumber) throws RomanException {
        int current = 0;
        int previous = 0;
        int sum = 0;
        romanNumber = romanNumber.toUpperCase();

        if (romanNumber.matches("[0-9]") || !romanNumber.matches("[^MDCLXVI]") || !romanNumber.matches("[MDCLXVI]{0,3}")) {
            throw new RomanException();
        } //nie dziala to jeszcze:(

        char romanArray[] = romanNumber.toCharArray();

        for (int i = 0; i < romanNumber.length(); i++) {
            char letter = romanArray[i];

            switch (letter) {
                case 'I': {
                    current = 1;
                    break;
                }
                case 'V': {
                    current = 5;
                    break;
                }
                case 'X': {
                    current = 10;
                    break;
                }
                case 'L': {
                    current = 50;
                    break;
                }
                case 'C': {
                    current = 100;
                    break;
                }
                case 'D': {
                    current = 500;
                    break;
                }
                case 'M': {
                    current = 1000;
                    break;
                }
            }

            if (current > previous) {
                sum += current - 2 * previous;
            } else {
                sum += current;
            }
            previous = current;
        }
        return sum;
    }


    public int getChangedFirstRomanToArabic(String firstRomanNumber) throws RomanException {
        return changeRomanToArabicNumber(firstRomanNumber);
    }

    public int getChangedSecondRomanNumberToArabic(String secondRomanNumber) throws RomanException {
        return changeRomanToArabicNumber(secondRomanNumber);
    }
}


