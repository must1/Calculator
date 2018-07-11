public class ArabicToRomanNumbersChanger {
    private StringBuilder RomanString = new StringBuilder();
    private String romanThousand = "M";
    private String romanHundred = "C";
    private String romanTen = "X";
    private String romanOne = "I";

    private void changeThousandthPartOfRomanNumber(int thousand) {
        for (int i = 0; i < thousand; i++) {
            RomanString.append(romanThousand);
        }
    }

    private void changeHundredthPartOfRomanNumber(int hundred) {
        switch (hundred) {
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
                for (int i = 0; i < hundred; i++) {
                    RomanString.append(romanHundred);
                }
            }
        }
    }

    private void changeDecimalPartOfRomanNumber(int tens) {
        switch (tens) {
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
                for (int i = 0; i < tens; i++) {
                    RomanString.append(romanTen);
                }
            }
        }

    }

    private void changeUnityPartOfRomanNumber(int units) {
        switch (units) {
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
                for (int i = 0; i < units; i++) {
                    RomanString.append(romanOne);
                }
            }
        }
    }

    public StringBuilder changeRomanToArabicNumber(int ArabicNumber) {
        int thousand = ArabicNumber / 1000;
        int hundred = ArabicNumber / 100 % 10;
        int tens = ArabicNumber / 10 % 10;
        int units = ArabicNumber % 10;


        changeThousandthPartOfRomanNumber(thousand);
        changeHundredthPartOfRomanNumber(hundred);
        changeDecimalPartOfRomanNumber(tens);
        changeUnityPartOfRomanNumber(units);

        return RomanString;
    }
}
