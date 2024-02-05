package com.bootcoding.dsa.string.Practice;

public  class Assign {
    public static class Person{
        private String Name;
        private int age;

        public Person(String Name,int age){
            this.Name=Name;
            this.age=age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{ Name='" + Name + ", age=" + age + '}';
        }


    }

    public static void main(String[] args) {
        Person p= new Person("jhon",18);
        System.out.println(p);
    }
}
