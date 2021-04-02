package com.san.spring_basics_annotations_rest_api;

public class Test {
    public static void main(String[] args) {
        String name="Sandesh Kumar Lamsal Acharya";
        String[] ns=name.split(" ");
        for (int i=0;i<ns.length;i++){
            if(i==ns.length-1){
                System.out.print(ns[i].charAt(0));
                return;
            }
                System.out.print(ns[i].charAt(0)+".");
        }
    }
}