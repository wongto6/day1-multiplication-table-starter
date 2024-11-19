package com.tw;

public class MultiplicationTableBuilder {

    final int MIN_VALUE = 1;
    final int MAX_VALUE = 1000;

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.generateMultiplicationTable(start, end);

        System.out.println(multiplicationTable);
    }

    public String generateMultiplicationTable(int startInt, int endInt) {

        StringBuilder multiplicationTable = new StringBuilder();

        // can directly return validate result
        boolean isInputValid = validateInput(startInt, endInt);
        if (!isInputValid) {
            return null;
        }

        for (int row = startInt; row <= endInt; row++) {
            String multiplicationRow = generateMultiplicationRow(row, startInt);
            multiplicationTable.append(multiplicationRow).append(System.lineSeparator());
        }

        return multiplicationTable.toString();
    }

    public String generateMultiplicationRow(int row, int startInt) {
        StringBuilder multiplicationRow = new StringBuilder();
        for (int column = startInt; column <= row; column++) {
            // use StringBuilder to replace + operator
            multiplicationRow.append(generateMultiplicationColumn(row, column));
        }
        return multiplicationRow.substring(1);
    }

    public String generateMultiplicationColumn(int row, int column) {
        return String.format(" %s*%s=%s", column, row, row * column);
    }

    public boolean validateInput(int startInt, int endInt) {
        boolean isValidStartEnd = validateStartEnd(startInt, endInt);
        boolean isInputScaleValid = validateInputScale(startInt, endInt);
        return (isValidStartEnd && isInputScaleValid);
    }

    public boolean validateInputScale(int startInt, int endInt) {
        return (endInt >= startInt);
    }

    public boolean validateStartEnd(int startInt, int endInt) {
        return (startInt > MIN_VALUE && startInt <= MAX_VALUE) && (endInt > MIN_VALUE && endInt <= MAX_VALUE);
    }
}
