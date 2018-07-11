package RomanNumberChangers;

public class ArabicToRomanNumbersChanger {
    private StringBuilder RomanString;


    private void changeThousandthPartOfRomanNumber(int NumberOfNumberThousands) {
        RomanString = new StringBuilder();
        for (int i = 0; i < NumberOfNumberThousands; i++) {
            RomanString.append(RomanLetters.romanThousand);
        }
    }

    private void changeHundredthPartOfRomanNumber(int NumberOfHundreds) {

        switch (NumberOfHundreds) {
            case 4: {
                RomanString.append("CD");
                break;
            }
            case 5: {
                RomanString.append("D");
                break;
            }
            case 6: {
                RomanString.append("DC");
                break;
            }
            case 7: {
                RomanString.append("DCC");
                break;
            }
            case 8: {
                RomanString.append("DCCC");
                break;
            }
            case 9: {
                RomanString.append("CM");
                break;
            }
            default: {
                for (int i = 0; i < NumberOfHundreds; i++) {
                    RomanString.append(RomanLetters.romanHundred);
                }
            }
        }
    }

    private void changeDecimalPartOfRomanNumber(int NumberOfTens) {
        switch (NumberOfTens) {
            case 4: {
                RomanString.append("XL");
                break;
            }
            case 5: {
                RomanString.append("L");
                break;
            }
            case 6: {
                RomanString.append("LX");
                break;
            }
            case 7: {
                RomanString.append("LXX");
                break;
            }
            case 8: {
                RomanString.append("LXXX");
                break;
            }
            case 9: {
                RomanString.append("XC");
                break;
            }
            default: {
                for (int i = 0; i < NumberOfTens; i++) {
                    RomanString.append(RomanLetters.romanTen);
                }
            }
        }

    }

    private void changeUnityPartOfRomanNumber(int NumberOfUnits) {
        switch (NumberOfUnits) {
            case 4: {
                RomanString.append("IV");
                break;
            }
            case 5: {
                RomanString.append("V");
                break;
            }
            case 6: {
                RomanString.append("VI");
                break;
            }
            case 7: {
                RomanString.append("VII");
                break;
            }
            case 8: {
                RomanString.append("VIII");
                break;
            }
            case 9: {
                RomanString.append("IX");
                break;
            }
            default: {
                for (int i = 0; i < NumberOfUnits; i++) {
                    RomanString.append(RomanLetters.romanOne);
                }
            }
        }
    }

    public StringBuilder changeRomanToArabicNumber(int ArabicNumber) {
        RomanString = new StringBuilder();
        int NumberOfNumberThousands = ArabicNumber / 1000;
        int NumberOfHundreds = ArabicNumber / 100 % 10;
        int NumberOfTens = ArabicNumber / 10 % 10;
        int NumberOfUnits = ArabicNumber % 10;


        changeThousandthPartOfRomanNumber(NumberOfNumberThousands);
        changeHundredthPartOfRomanNumber(NumberOfHundreds);
        changeDecimalPartOfRomanNumber(NumberOfTens);
        changeUnityPartOfRomanNumber(NumberOfUnits);

        return RomanString;
    }
}
