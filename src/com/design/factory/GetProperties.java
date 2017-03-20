package com.design.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by yunfei on 2017/3/20.
 */
public class GetProperties {
    public Map<String, String> getProperties(){
        Properties properties = new Properties();
        Map<String,String> map = new HashMap<>();
        try {
            InputStream in = getClass().getResourceAsStream("type.properties");
            properties.load(in);
            Enumeration enumeration = properties.propertyNames();
            while (enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String property = properties.getProperty(key);
                map.put(key,property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
