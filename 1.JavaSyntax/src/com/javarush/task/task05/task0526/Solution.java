package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("name1", 22, "addr1");
        Man man2 = new Man("name2", 33, "addr2");
        Woman woman1 = new Woman("wname1", 66, "waddr1");
        Woman woman2 = new Woman("wname2", 77, "waddr2");
        System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());
        System.out.println(man2.getName() + " " + man2.getAge() + " " + man2.getAddress());
        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
        System.out.println(woman2.getName() + " " + woman2.getAge() + " " + woman2.getAddress());
    }

    public static class Man {
        String name;
        int age;
        String address;
        
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
        public String getName () {
            return name;
        }
        public int getAge () {
            return age;
        }
        public String getAddress () {
            return address;
        }
    }
    
    public static class Woman {
        String name;
        int age;
        String address;
        
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
        public String getName () {
            return name;
        }
        public int getAge () {
            return age;
        }
        public String getAddress () {
            return address;
        }
    }
}
