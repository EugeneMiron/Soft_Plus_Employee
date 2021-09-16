package com.company;

public class Employee {
    private long id;
    private Vacancy vacancy;

    public Employee(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    String getVacancy() {
        return vacancy.getVacancy();
    }

    public long getId() {
        return id;
    }
}
