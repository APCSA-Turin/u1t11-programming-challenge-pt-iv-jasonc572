package com.example.project;
public class StringProblemsRunner{
    
    public static void main(String[] args) {
        //Call StringProblems class here for manual testing
        StringProblems test = new StringProblems();
        String a = test.conCat("abc", "cat");
        System.out.println(a);
        a = test.conCat("dog", "cat");
        System.out.println(a);
        a = test.conCat("abc", "");
        System.out.println(a);
    }
    

}