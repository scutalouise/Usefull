package com.scutalouise.annotation;
 /**
 * 枚举，模拟注解中添加枚举属性
 * 
 * @author jiqinlin
 *
 */
 public enum Gender {
    MAN{
        public String getName(){return "男";}
    },
    WOMEN{
        public String getName(){return "女";}
    }; //记得有“;”
     public abstract String getName();
}