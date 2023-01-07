package org.example;

public class Main {
    public static void main(String[] args) {

        DatabaseConnector dbc = new DatabaseConnector();
        dbc.connect();
        Person ziom = new Person("Don", "dd@dd.pl","kkka0",true, 4);
        //dbc.executeInsert("insert into person values " + "('Marti','mati@wp.pl','fff',true,2)");
        ziom.save(dbc);

    }
}