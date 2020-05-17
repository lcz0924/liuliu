package cn.itcast.day09.properties;

import java.util.Properties;
import java.util.Set;

/*
   Properties:集合

     特点:
       1.存储的是键值对
       2.没有泛型,键值对的类型规定好了,全是String
       3.是唯一一个能和io结合使用的集合

     方法:
        public Object setProperty(String key, String value) ： 保存一对属性。  put
        public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。get
        public Set<String> stringPropertyNames() ：所有键的名称的集合  keySet

 */
public class Demo01_Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("宝瑞","中浪");
        properties.setProperty("涛哥","晓婷");
        properties.setProperty("宝华","孝艳");

        System.out.println(properties);

        String value = properties.getProperty("宝瑞");
        System.out.println(value);
        System.out.println("----------");

        Set<String> key = properties.stringPropertyNames();

        for (String s : key) {
            System.out.println(properties.getProperty(s));
        }

    }
}
