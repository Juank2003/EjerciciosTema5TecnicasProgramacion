package org.example;

import java.util.ArrayList;

public class HashTable {

    private static final int tamaño_tabla = 128;

    private ArrayList<Employee>[] hashTable;

    public HashTable() {
        hashTable = new ArrayList[tamaño_tabla];
        for (int i = 0; i < tamaño_tabla; i++) {
            hashTable[i] = new ArrayList<Employee>();
        }
    }

    private int hash(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }
        hashVal %= tamaño_tabla;
        if (hashVal < 0) {
            hashVal += tamaño_tabla;
        }
        return hashVal;
    }

    public void insert(Employee employee) {
        String key1 = employee.getName();
        String key2 = Integer.toString(employee.getEmployeeNumber());
        String key3 = employee.getSsn();
        int hashVal = hash(key1);
        hashTable[hashVal].add(employee);
        hashVal = hash(key2);
        hashTable[hashVal].add(employee);
        hashVal = hash(key3);
        hashTable[hashVal].add(employee);
    }

    public Employee findByName(String name) {
        int hashVal = hash(name);
        for (Employee employee : hashTable[hashVal]) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public Employee findByEmployeeNumber(int employeeNumber) {
        String key = Integer.toString(employeeNumber);
        int hashVal = hash(key);
        for (Employee employee : hashTable[hashVal]) {
            if (employee.getEmployeeNumber() == employeeNumber) {
                return employee;
            }
        }
        return null;
    }

    public Employee findBySsn(String ssn) {
        int hashVal = hash(ssn);
        for (Employee employee : hashTable[hashVal]) {
            if (employee.getSsn().equals(ssn)) {
                return employee;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable();
        Employee e1 = new Employee("John Smith", 12345, "123-45-6789");
        Employee e2 = new Employee("Jane Doe", 54321, "987-65-4321");
        table.insert(e1);
        table.insert(e2);
        Employee result1 = table.findByName("John Smith");
        System.out.println(result1);
        Employee result2 = table.findByEmployeeNumber(54321);
        System.out.println(result2);
        Employee result3 = table.findBySsn("123-45-6789");
        System.out.println(result3);
    }

}

class Employee {
    private String name;
    private int employeeNumber;
    private String ssn;

    public Employee(String name, int employeeNumber, String ssn) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public String toString() {
        return "Name: " + name + ", Employee Number: " + employeeNumber + ", SSN: " + ssn;
    }
}

