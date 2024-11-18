package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.generateMultiplicationTable(start, end);

        System.out.println(multiplicationTable);
    }

    public String generateMultiplicationTable(int startInt, int endInt) {

        String multiplicationTable = "";

        boolean isInputValid = validateInput(startInt, endInt);

        if (isInputValid) {
            for (int row = startInt; row <= endInt; row++) {
                String multiplicationRow = generateMultiplicationRow(row, startInt);
                multiplicationTable = multiplicationTable + multiplicationRow + System.lineSeparator();
            }
            multiplicationTable = String.format(multiplicationTable);
        } else {
            return null;
        }

        return multiplicationTable;
    }

    public String generateMultiplicationRow(int row, int startInt) {
        String multiplicationRow = "";
        for (int column = startInt; column <= row; column++) {
            multiplicationRow = multiplicationRow + generateMultiplicationColumn(row, column);
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
        return (startInt > 1 && startInt <= 1000) && (endInt > 1 && endInt <= 1000);
    }
}
