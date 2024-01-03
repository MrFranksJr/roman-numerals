import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RomanNumeralsTestTest {
    @Test
    void convertsNumberOne() { assertEquals("I", convertNumeral(1)); }

    @Test
    void canConvertTwo() { assertEquals("II", convertNumeral(2)); }

    @Test
    void canConvertThree() {
        assertEquals("III", convertNumeral(3));
    }

    @Test
    void canConvertFive() {
        assertEquals("V", convertNumeral(5));
    }

    @Test
    void canConvertFour() {
        assertEquals("IV", convertNumeral(4));
    }

    @Test
    void canConvertSix() { assertEquals("VI", convertNumeral(6)); }

    @Test
    void canConvertSeven() {
        assertEquals("VII", convertNumeral(7));
    }

    @Test
    void canConvertEight() {
        assertEquals("VIII", convertNumeral(8));
    }

    @Test
    void canConvertTen() {
        assertEquals("X", convertNumeral(10));
    }

    @Test
    void canConvertNine() {
        assertEquals("IX", convertNumeral(9));
    }

    @Test
    void canConvertEleven() {
        assertEquals("XI", convertNumeral(11));
    }

    @Test
    void canConvertFourteen() { assertEquals("XIV", convertNumeral(14)); }

    @Test
    void canConvertFifteen() {
        assertEquals("XV", convertNumeral(15));
    }

    @Test
    void canConvertSeventeen() {
        assertEquals("XVII", convertNumeral(17));
    }

    @Test
    void canConvertThirtySeven() {
        assertEquals("XXXVII", convertNumeral(37));
    }

    @Test
    void canConvertFourty() {
        assertEquals("XL", convertNumeral(40));
    }

    @Test
    void canConvertFourtyFour() { assertEquals("XLIV", convertNumeral(44)); }

    @Test
    void canConvertFifty() { assertEquals("L", convertNumeral(50)); }

    @Test
    void canConvertThirtyNine() {
        assertEquals("XXXIX", convertNumeral(39));
    }

    @Test
    void canConvert55() {
        assertEquals("LV", convertNumeral(55));
    }

    @Test
    void canConvert64() {
        assertEquals("LXIV", convertNumeral(64));
    }


    private String convertNumeral(int i) {
        if (i > 50) {
            return "L" + convertNumeral(i - 50);
        }
        else if (i == 50) {
            return "L";
        }
        else if (i > 39 && i < 50) {
            return "XL" + convertNumeral(i - 40);
        }
        else if (i > 10 && i < 40) {
            return "X" + convertNumeral(i - 10);
        }
        else if (i == 10) {
            return "X";
        }
        else if (i == 9) {
            return "IX";
        }
        else if (i > 5) {
            return "V" + convertNumeral(i - 5);
        }
        else if (i == 5) {
            return "V";
        }
        else if (i == 4) {
            return "IV";
        }
        return doIs(i);
    }

    private static String doIs(int i) {
        String returnValue = "";
        for (int j = 0; j < i; j++) {
            returnValue += "I";
        }
        return returnValue;
    }
}