package com.company;

public class Son extends Person{
    String str = "B"; // 重新定义str属性（甚至可以改变数据类型和访问级别）
    static String staticStr = "staticB";

    void method() {
        System.out.println(str); // str其实前面有一个隐式的this，既this.str
    }
    static void staticMethod() {
        System.out.println(staticStr);
    }

}
