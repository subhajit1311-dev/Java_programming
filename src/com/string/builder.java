package com.string;

public class builder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("hello");
//        str.append("world");
//        str.setCharAt(0,'m');
//        System.out.println(str);
//        str.insert(2,'y');
//        System.out.println(str);
//        str.deleteCharAt(0);
//        System.out.println(str);
        StringBuilder str = new StringBuilder("physics");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(2,4);//2 to 3
        System.out.println(str);
        
    }
}
