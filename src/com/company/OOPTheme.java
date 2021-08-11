package com.company;

public class OOPTheme {
    public static void main(String[] args){
        /*
        AccessModifier class ClassName {
        fields,constructors,methods
        }
        class -
        Access_modifier class:



        Field (поля)-переменные определенные внутри класса - variable inside the class (instance variable)
        [access_modifier] [static] [final] type name [= initial value]
        private String nameOfStaff;

        Access_modifier field:
         - public - переменные достпные в любом классе программы;
         - private - переменные доступны только внутри класса;
         - protected - переменные доступны внутри класса, внутри наследников и внутри кода из тогоже package ;
         - package-private(by default) - такие поля доступны только классам внутри того же package, в котором класс с таким полем определен;
         Static:

         Final:
         keyword  - зарезервированное слово, которое описывает поля значение которых не изменяется, инициализация сразу

         Method (метод) - блок кода, осуществляющий некоторую задачу
         [access_modifier] [static] returned_type name (parameter list) {body_method}

         Getter and setter methods
         способ взаимодействия с разными приватными полями

         Constructor (блок кода/метод который используется при создании объекта, носит имя класса и используется для инициализации полей класса)
         - вызывается первым делом при создании экземпляра/сущности класса
         - не возвращает никаких значений (void не используется)

         */
        // создание экземпляра класса с помощью конструктора
        StaffManagement staff = new StaffManagement("Jhon");
        staff.setHoursWorked(8);
        System.out.println("Hours worked " + staff.getHoursWorked());
        System.out.println("Your payment " + staff.calculatePay());
        Person person = new Person("Anna");
        System.out.println("This get " + person.getTest());
        person.setTest("ReTEST");
        System.out.println("This set "+ person.getTest());
        Student anna = new Student("Anna");
        System.out.println(anna.getTest());
        Person woman = new Person("Maria", 23);
        Person men = new Person();
        woman.move();
        men.talk();
        System.out.println(men.age);
    }
}
