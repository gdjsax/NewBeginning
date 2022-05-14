package com.wpc.java;

import com.Customer.Customer;
import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2022-04-27 12:13
 */
public class Hello {

    private static final Customer cust = new Customer();



    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        System.out.println("args = " + args);
        System.out.println("args = " + args);
        int num =1;
        System.out.println("num = " + num);
        System.out.println(num);

        for (String arg : args) {


        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        ArrayList list = new ArrayList();
        list.add(123);

        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {

        }
        if (list != null) {

        }

    }
}
