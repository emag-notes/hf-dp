package org.emamotor.hfdp.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class IteratorEnumerationTestDrive {

    public static void main(String... args) {

        List<String> list = new ArrayList<>(Arrays.asList(args));
        Enumeration<String> enumeration = new IteratorEnumeration<>(list.iterator());

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
