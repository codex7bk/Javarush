package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int sum = 0;

        if (this.age >  anotherCat.age) sum += 1;
        else if (this.age < anotherCat.age) sum -= 1;

        if (this.weight >  anotherCat.weight) sum += 1;
        else if (this.weight < anotherCat.weight) sum -= 1;

        if (this.strength >  anotherCat.strength) sum += 1;
        else if (this.strength < anotherCat.strength) sum -= 1;

        return sum > 0;

    }

    public static void main(String[] args) {

    Cat cat1 = new Cat(5,5,5);
    Cat cat2 = new Cat(5,3,3);

    System.out.println(cat1.fight(cat2));
    }
}
