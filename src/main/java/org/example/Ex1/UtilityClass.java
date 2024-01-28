package org.example.Ex1;/* 1. Напишите утилитный класс, в котором реализованы методы получения среднего значения AVG, максимального MAX иминимального значения MIN из следующих наборов данных:пары целых чиселпары дробных чиселодного целого и одного дробного числамассива целых чиселмассива дробных чиселИспользуйте механизм перегрузки. */public class UtilityClass {    public int avg(int num1, int num2) {        return (num1 + num2) / 2;    }    public double avg(double num1, double num2) {        return (num1 + num2) / 2;    }    public int avg(int num1, double num2) {        return (int) ((num1 + num2) / 2);    }    public int avg(int[] intArray) {        if (intArray.length == 0) {            return 0;        }        int sum = 0;        for (int num : intArray) {            sum += num;        }        return sum / intArray.length;    }    public double avg(double[] doubleArray) {        if (doubleArray.length == 0) {            return 0;        }        int sum = 0;        for (double num : doubleArray) {            sum += num;        }        return (double) sum / doubleArray.length;    }    public int max(int num1, int num2) {        return Math.max(num1, num2);    }    public double max(double num1, double num2) {        return Math.max(num1, num2);    }    public int max(int num1, double num2) {        return (int) Math.max(num1, num2);    }    public int max(int[] intArray) {        if (intArray.length == 0) {            return 0;        }        int max = intArray[0];        for (int num : intArray) {            max = Math.max(max, num);        }        return max;    }    public double max(double[] doubleArray) {        if (doubleArray.length == 0) {            return 0;        }        double max = doubleArray[0];        for (double num : doubleArray) {            max = Math.max(max, num);        }        return max;    }    public int min(int num1, int num2) {        return Math.min(num1, num2);    }    public double min(double num1, double num2) {        return Math.min(num1, num2);    }    public int min(int num1, double num2) {        return (int) Math.min(num1, num2);    }    public int min(int[] intArray) {        if (intArray.length == 0) {            return 0;        }        int min = intArray[0];        for (int num : intArray) {            min = Math.min(min, num);        }        return min;    }    public double min(double[] doubleArray) {        if (doubleArray.length == 0) {            return 0;        }        double min = doubleArray[0];        for (double num : doubleArray) {            min = Math.max(min, num);        }        return min;    }}