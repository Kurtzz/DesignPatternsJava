package com.kurtz.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();

        //ORIGINAL
        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");

        caretaker.save(employee);
        System.out.println(employee);

        //CHANGES
        employee.setPhone("444-555-6666");

        caretaker.save(employee);
        System.out.println(employee);

        //Change 2
        employee.setPhone("333-999-6666");

        caretaker.revert(employee);
        System.out.println(employee);

        caretaker.revert(employee);
        System.out.println(employee);

    }
}
