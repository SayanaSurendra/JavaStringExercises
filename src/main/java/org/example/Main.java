package org.example;

public class Main {
    public static void main(String[] args) {
        String name="Java";
        String sentence1="Even longer example sentence";
        String sentence="Long example sentence";
        String str="Ok this is not as long!";
        String str1="CAPS EQUALS SCREAMING";
        String sentence2="Java is the worst programming language!";
        String str2="\tJ\ta\tv\ta\t";
        int num=20;
        String sentence3="Oil and Water";
        String sentence4="Carl,Susie,Fredrick,Bob,Erik";
        String sentence5= "ThisShouldBeConverted";
        char character[]={'J','a','v','a'};

        printStringLength(name);
        printCharAtPosition(sentence);
        printIndexPosition(sentence1);
        printSubstring(str);
        printUpperCaseToLOwerCase(str1);
        printStringReplace(sentence2);
        printStringAfterTrim(str2);
        printString(num);
        printStringArray(sentence3);
        printNameArray(sentence4);
        printCharacter(sentence5);
        printCharacterToString(character);
    }


    private static void printStringLength(String name) {
        System.out.println("String length : "+ name.length());
        System.out.println("=======================");

    }

    private static void printCharAtPosition(String sentence){
        System.out.println("char at Position 6: "+ sentence.charAt(6));
        System.out.println("=======================");

    }

    private static void printIndexPosition(String sentence){
        System.out.println("Index Position of o : "+ sentence.indexOf('o'));
        System.out.println("=======================");

    }

    private static void printSubstring(String sentence){
        System.out.println("Substring:: "+ sentence.substring(11,22));
        System.out.println("=======================");

    }

    private static void printUpperCaseToLOwerCase(String str){
        System.out.println(str.toLowerCase());
        System.out.println((str.toLowerCase()).toUpperCase());
        System.out.println("=======================");

    }

    private static void printStringReplace(String str){
        System.out.println(str.replace("worst","best"));
        System.out.println("=======================");

    }

    private static void printStringAfterTrim(String str){
        System.out.println(str.trim());
        System.out.println("=======================");

    }

    private static void printString(int n){
        String s=String.valueOf(n);
        System.out.println(s+20);
        System.out.println("=======================");

    }

    private static void printStringArray(String s){
        String arr[]=s.split("and");
       for(String words:arr){
           System.out.println(words.trim());
       }
        System.out.println("=======================");

    }

    private static void printNameArray(String sentence4) {
        String nameAray[]=sentence4.split(",");
        for(String words:nameAray){
            System.out.println(words);
        }
        System.out.println("=======================");
    }

    private static void printCharacter(String sentence5){
        char characterArray[]= sentence5.toCharArray();
        for(char c:characterArray){
            System.out.println(c);
        }

        System.out.println("=======================");
    }

    private static void printCharacterToString( char c[]){
        System.out.println(String.valueOf(c));
    }


}