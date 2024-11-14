package com.example.SpringBootDemo1;

public class CalcModel {
    public static int calc(int a, int b, String operation) throws Exception {
        switch (operation){
            case "plus": return  a+b;
            case "minus": return a-b;
            case "multiply": return a*b;
            case "divide": return a/b;
            default: throw new Exception("неизвестная операция");
        }

    }

}
