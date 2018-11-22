package com;

import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args)
    {
       method(s ->s.length()>5);
    }
    public static void method(Predicate<String>predicate)
    {
        boolean ooOppppp = predicate.test("OOOppppp");
        System.out.println(ooOppppp);
    }
}
