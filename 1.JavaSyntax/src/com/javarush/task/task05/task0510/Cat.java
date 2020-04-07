package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;
    
    public void initialize (String name) {
        this.name = name;
        
        this.age = 5;
        this.address = null;
        this.weight = 10;
        this.color = "some color";
    }
    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
       
        this.address = null;
         this.color = "some color";
    }
    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        
        this.weight = 10;
        this.address = null;
        this.color = "some color";
    }

  public void initialize (int weight, String color) {
       this.weight = weight;
       this.color = color;
       
          this.name = null;
        this.address = null;
        this.age = 5;
    }
  public void initialize (int weight, String color, String address) {
       this.weight = weight;
       this.color = color;
       this.address = address;
       
       this.age = 5;
       this.name = null;
    }

    public static void main(String[] args) {

    }
}
