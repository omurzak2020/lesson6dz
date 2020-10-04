package com.company;

public class Main {

    public static void main(String[] args) {
        Dogs<Number> dogs= new Dogs<>();
        dogs.speak(1);

        Dogs<Number> dogs1 =new Dogs<>();
        dogs1.speak(5);

        Dogs<Number> dogs2 =new Dogs<>();
        dogs2.speak(6);

    }
}
/*Создать обобщенный класс и обобщенный интерфейс и реализовать
  этот интерфейс классом. Ограничить параметры типов классом Number.
  В главном классе создать несколько экземпляров обобщенного класса.*/