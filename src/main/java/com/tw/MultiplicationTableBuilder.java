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


        return multiplicationTable;
    }

    public boolean validateStartEnd(int startInt, int endInt) {
        return (startInt > 1 && startInt <= 1000) && (endInt > 1 && endInt <= 1000);
    }
}
