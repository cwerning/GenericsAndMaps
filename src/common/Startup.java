/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cwerning
 */
public class Startup {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Goodfellas", "Martin Scorseces");
        Movie movie2 = new Movie("Goodfellas", "Steven Spielberg");
        Movie movie3 = new Movie("Psycho", "Alfred Hitchcock");
        Movie movie4 = new Movie("Pandora", "James Cameron");
        
        Map<String, Object> map = new TreeMap<>();
        
        map.put("Goodfellas", movie1);
        map.put("Goodfellas", movie2);
        map.put("Psycho", movie3);
        map.put("Pandora", movie4);
        
//        System.out.println(map.get("Goodfellas"));
        
        Set<String> key = map.keySet();
        
        for(String s : key){
            Object value = map.get(s);
            System.out.println(value);
        }
        
//        Set<Movie> set2 = new TreeSet<>();
//        set2.add(movie1);
//        set2.add(movie2);
//        set2.add(movie3);
//        set2.add(movie4);
//        
//        for(Movie s : set2){
//            System.out.println(s);
//        }
        
        
    }
    
}
