package jcf.list.arrayList;


import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        al.add("Java");
        al.add("SQL");
        al.add(100.56);
        al.add(true);
        al.add('K');
        System.out.println(al);
    }
}
