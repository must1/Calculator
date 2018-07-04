public class ArabicToRomanNumbersChanger {

    public StringBuilder changeRomanToArabicNumber(int ArabicNumber) {
        int thousand = ArabicNumber / 1000;
        System.out.println(thousand);
        int hundred = ArabicNumber / 100 % 10;
        System.out.println(hundred);
        int tens = ArabicNumber / 10 % 10;
        System.out.println(tens);
        int units = ArabicNumber % 10;
        System.out.println(units);

        StringBuilder RomanString = new StringBuilder();

        String romanThousand = "M";
        String romanHundred = "C";
        String romanTen = "X";
        String romanOne = "I";

        for (int i = 0; i < thousand; i++) {
            RomanString.append(romanThousand);
        }


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
        return RomanString;
    }
}
