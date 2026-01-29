package com.bilalbrohilab1;

public class Binary {

    private String value;

    public Binary(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Binary add(Binary a, Binary b) {
        String x = a.value;
        String y = b.value;

        StringBuilder result = new StringBuilder();
        int i = x.length() - 1;
        int j = y.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += x.charAt(i--) - '0';
            if (j >= 0) sum += y.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return new Binary(result.reverse().toString());
    }

    public static Binary or(Binary a, Binary b) {
        int maxLen = Math.max(a.value.length(), b.value.length());

        String x = String.format("%" + maxLen + "s", a.value).replace(' ', '0');
        String y = String.format("%" + maxLen + "s", b.value).replace(' ', '0');

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            result.append(
                (x.charAt(i) == '1' || y.charAt(i) == '1') ? '1' : '0'
            );
        }

        return new Binary(result.toString());
    }

    public static Binary and(Binary a, Binary b) {
        int maxLen = Math.max(a.value.length(), b.value.length());

        String x = String.format("%" + maxLen + "s", a.value).replace(' ', '0');
        String y = String.format("%" + maxLen + "s", b.value).replace(' ', '0');

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            result.append(
                (x.charAt(i) == '1' && y.charAt(i) == '1') ? '1' : '0'
            );
        }

        return new Binary(result.toString());
    }


    public static Binary multiply(Binary a, Binary b) {
        Binary result = new Binary("0");
        Binary temp = a;

        for (int i = b.value.length() - 1; i >= 0; i--) {
            if (b.value.charAt(i) == '1') {
                result = add(result, temp);
            }
            temp = new Binary(temp.value + "0");
        }

        return result;
    }
}
