package com.huangxin.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Customer {
    public static void main(String[] args) {
        method1();

    }

    private static void method1() {
        //region Description
        System.out.println("helloworld");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("");
        //endregion
    }

    public void method() throws FileNotFoundException {
       FileInputStream input = new FileInputStream("");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//单行
}
