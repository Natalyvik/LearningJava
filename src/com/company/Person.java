package com.company;

public class Person {
    public String name;
    public int age;

    //    метод
    void sayHi() {
        System.out.print("Hi!");
    }

    void introduceYourself() {
        System.out.println("My name is " + name);
    }

    public Person(String personName) {
        name = personName;
    }
    public Person(){};
    public Person(String personName, int personAge){
        name = personName;
        age = personAge;
    }


    private String test = "TEST1";
    //геттер  дает значение скрытой переменной
    public String getTest(){return test; }

    public void setTest(String test) {
        //сеттер изменяет значение скрытой переменной
        this.test = test;
    }
    public  void  move(){
        System.out.println(this.name +" moves");
    }
    public void talk (){
        System.out.println(this.name + " talks");
    }

}

