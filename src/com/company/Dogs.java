package com.company;

public class Dogs <A extends Number> implements Voice<A>{

    @Override
    public void speak(Number number) {
        System.out.println("Собака кричала "+ number +" раз" );
    }
}
