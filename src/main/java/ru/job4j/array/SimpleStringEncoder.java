package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                count++;
            } else if (count > 1) {
                result = result + symbol + count;
                symbol = input.charAt(i);
                count = 1;
            } else {
                result += symbol;
                symbol = input.charAt(i);
            }
        }

        return count > 1 ? result + symbol + count : result + symbol;
    }
}
