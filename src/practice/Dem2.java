/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Dog;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cwerning
 */
public class Dem2 {
    public static void main(String[] args) {
        Map<Dog,String> map = new TreeMap<>();
        
        Dog dog1 = new Dog("Spot", 2, "666");
        Dog dog2 = new Dog("Jimbo", 3, "666");
        Dog dog3 = new Dog("Jose", 4, "333");
        
        map.put(dog1,"Spot");
        map.put(dog2,"Jimbo");
        map.put(dog3,"Jose");
        
        Set<Dog> keys = map.keySet();
        
        for(Dog s : keys){
            System.out.println(s);
        }
        
        Set<Dog> set = new TreeSet<>();
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);
        
        for(Dog s : set){
            System.out.println(s);
        }
        
        
    }
    
}
