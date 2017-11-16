/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cwerning
 */
public class Dem1 {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();
        
        map.put("firstName", "John");
        map.put("lastName", "Smith");
        map.put("birthDay", new Date());
        map.put("age", 20);
        
//        Integer oldValue = (Integer)map.put("age", 55);
//        
//        int age = (Integer)map.get("age");
//        System.out.println("The old value is: " + oldValue);
//        System.out.println("The new value is: " + age);

        Set<String> key = map.keySet();
        
        for(String s : key){
            Object value = map.get(s);
            System.out.println(value);
        }

//        Collection<Object> values = map.values();
//        for(Object o : values){
//            System.out.println(o);
//        }
        
        
    }
    
}
