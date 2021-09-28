package com.company;


import testCom.StringService;

public class Main {

    public static void main(String[] args) {
        StringService stringService = new StringService();
        String line = "privet";
        String substring = "ive";
        System.out.println(stringService.checkForContainingSubstring(line, substring));

    }
}
