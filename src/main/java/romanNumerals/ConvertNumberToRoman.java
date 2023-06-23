package romanNumerals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.codehaus.plexus.util.StringUtils.repeat;

public class ConvertNumberToRoman {

    public Map<Integer, String> numberRomanHashMap = new HashMap<Integer, String>();


    public String convert(Integer arabicNumber) {
        numberRomanHashMap.put(1000, "M");
        numberRomanHashMap.put(900, "CM");
        numberRomanHashMap.put(500, "D");
        numberRomanHashMap.put(400, "CD");
        numberRomanHashMap.put(100, "C");
        numberRomanHashMap.put(90, "XC");
        numberRomanHashMap.put(50, "L");
        numberRomanHashMap.put(40, "XL");
        numberRomanHashMap.put(10, "X");
        numberRomanHashMap.put(9, "IX");
        numberRomanHashMap.put(5, "V");
        numberRomanHashMap.put(4, "IV");
        numberRomanHashMap.put(1, "I");
        TreeMap<Integer, String> sorted = new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(numberRomanHashMap);
        String romanNumber = "";
        for(Map.Entry<Integer, String> entry : sorted.entrySet()) {
            int matches = arabicNumber / entry.getKey();
            if (matches > 0) {
                romanNumber = romanNumber + repeat(entry.getValue(), matches);
                arabicNumber = arabicNumber % entry.getKey();
            }
        }
        return romanNumber.toString();
    }
}
