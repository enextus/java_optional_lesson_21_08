package de.telran;

public class Auto {
    String name;
    String idNumber;

    public Auto(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String concat(String a, String b) {

        return a + b;
    }

    public Integer concatTwo(String a, String b) {
        Integer d = Integer.parseInt((a + b));

        return d * d;
    }

}
