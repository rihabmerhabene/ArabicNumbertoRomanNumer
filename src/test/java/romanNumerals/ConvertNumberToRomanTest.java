package romanNumerals;

import org.junit.Assert;
import org.junit.Test;

public class ConvertNumberToRomanTest {

    @Test
    public void convertArabicNumberOneToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("I", convertNumberToRoman.convert(1));
    }

    @Test
    public void convertArabicNumberTwoToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("II", convertNumberToRoman.convert(2));
    }

    @Test
    public void convertArabicNumberThreeToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("III", convertNumberToRoman.convert(3));
    }

    @Test
    public void convertArabicNumberFourToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("IV", convertNumberToRoman.convert(4));
    }

    @Test
    public void convertArabicNumberFiveToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("V", convertNumberToRoman.convert(5));
    }

    @Test
    public void convertArabicNumberSixToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("VI", convertNumberToRoman.convert(6));
    }

    @Test
    public void convertArabicNumberFToRoman() {
        ConvertNumberToRoman convertNumberToRoman = new ConvertNumberToRoman();
        Assert.assertEquals("MC", convertNumberToRoman.convert(1100));
    }
}