package com.company;

public class Main {

    public static void main(String[] args) {
        Employee test = new Employee(7,new Vacancy("developer"));
        System.out.println(test.getId());
        System.out.println(test.getVacancy());

    }
}
