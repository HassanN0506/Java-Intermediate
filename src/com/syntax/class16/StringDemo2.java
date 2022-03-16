package com.syntax.class16;

public class StringDemo2 {


    public static void main(String[] args) {

        String str = "1234567890 asdfghjkl ASDFGHJKL";

        System.out.println(str.replaceAll("[0-9]", "#"));
        //telling Java to replace all number from 0 to 9 with #

        //THAT'S WHAT SQUARE BRACKETS ARE FOR (within the REPLACE-ALL method)
        //to replace a RANGE
        //DON'T FORGET THE DOUBLE QUOTES WITH THE SQUARE BRACKETS
        //java uses ASCII table get ranges, and abc's and numbers are all within 1 range, each, in that ascii table

        //i want to replace all the letters lowercase a-z:
        System.out.println(str.replaceAll("[a-z]", "0"));

        //i want to replace Uppercase A-Z:
        System.out.println(str.replaceAll("[A-Z]", "%"));

        //to do ALL LETTERS capital and lowercase:
        System.out.println(str.replaceAll("[A-z]", ":"));
        //works, but the range "[a-Z]" will NOT work, because of the acsii table orientation!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //System.out.println(str.replaceAll("[A-Z]", "$"));
        //for some reason, it doesn't want to replace it with a '$'

        //ONLY WORKS IN THE FIRST PLACE, MEANING WE CAN ONLY USE A RANGE TO SPECIFY WHAT WE WANT TO REPLACE
        //WE CANNOT REPLACE A RANGE WITH ANOTHER RANGE, BECAUSE JAVA WILL NOT KNOW WHAT TO PLUG WHERE!!!!!!!!!!!
        //so we can only replace a range of characters with a specific other character


        //i can also do MULTIPLE ranges:
        System.out.println(str.replaceAll("[a-zA-Z0-9]", "0"));

        //careful not to accidentally replace spaces by putting a space in your range, like such:
        System.out.println(str.replaceAll("[a-zA-Z 0-9]", "0"));
        //there is a space between the Z and the 0


        //i can use the NOT operator in REPLACE method, which is '^' !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(str.replaceAll("[^ 0-9]", "0"));
        //we're saying replace all that are NOT in the range of 0-9!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //there is also a space there between the '^' and the 0, so we're REALLY saying replace everything that is NOT a space or a number

        //careful not to accidentally replace spaces by NOT putting a space between your range and '^', like such:
        System.out.println(str.replaceAll("[^0-9]", "0"));
        //there is a NO SPACE between the '^' and the 0, so even the spaces get replaced!!!!!!!!!!!!!!!!!!!!!


    }


}
