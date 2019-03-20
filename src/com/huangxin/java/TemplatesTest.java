package com.huangxin.java;

import java.util.ArrayList;

/**
 * @author huangxin
 * @date 2019/3/20-14:14
 */
public class TemplatesTest {
    //prsf
    private static final Customer CUSTOMER = new Customer();
    //psf
    public static final Integer NUM = 1;
    //psfi     int
    public static final int NUM1 = 1;
    
    //psfs     String
    public void testUpdate(){

    }
    /**
     * asd
     */
    private Integer abc;
    
    /**
     * 弟弟
     */
    private Integer didi = 0;

    //模板一:psvm
    public static void main(String[] args) {
        //输出语句：sout
        System.out.println();
        //变形 soutp/soutm/soutv/xxx.sout
        //模板三
        String [] arr = {"1","3","12"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        //模板四 ：list.for
        ArrayList list = new ArrayList();
        for (Object o : list) {
            
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void  method1(){
        ArrayList list = new ArrayList();
        //模板五：ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {

        }
        //xxx.nn/xxx.null
        if (list != null) {

        }

    }
}
