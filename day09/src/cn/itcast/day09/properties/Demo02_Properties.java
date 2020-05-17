package cn.itcast.day09.properties;

import java.io.FileReader;
import java.util.Properties;

/*
    将用流对象读取的内容放到Properties集合中
    void load(InputStream inStream)
    void load(Reader reader)
 */
public class Demo02_Properties {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();

        //创建流对象
        FileReader fr = new FileReader("day09\\config.properties");

        properties.load(fr);
        System.out.println(properties);
    }
}
