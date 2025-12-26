package jcf.list.arrayList;


import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        System.out.println(al.size()); // 0
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        al.add("Java");
        al.add("SQL");
        al.add(100.56);
        al.add(true);
        al.add('K');
        
        System.out.println(al.size()); // 10
        System.out.println(al.contains(50)); // true
        System.out.println(al.contains(100)); // false
        System.out.println(al.get(0)); // 10
        System.out.println(al.get(3)); // 40
        // System.out.println(al.get(11)); // error
        
        System.out.println(al.getFirst()); // return the first element from the array list
        System.out.println(al.getLast()); // K
        
        System.out.println(al.indexOf(20)); // 1
        
        System.out.println(al.isEmpty()); // false
        
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        
        al.add(20);
        System.out.println(al);
        
        System.out.println(al.lastIndexOf(20));
        
        System.out.println(al);
        al.removeFirst();
        System.out.println(al);
        
        al.removeLast();
        System.out.println(al);
        
        al.set(3, "HTML");
        System.out.println(al);
        
        al.add(2, 99);
        System.out.println(al);
        
        ArrayList al2 = new ArrayList();
        al2.add(100);
        al2.add(300);
        al2.add(200);
        System.out.println(al2);
        
        al.addAll(al2);
        System.out.println(al);
    }
}
