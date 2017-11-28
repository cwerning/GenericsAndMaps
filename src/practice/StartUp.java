/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cwerning
 */
public class StartUp {

    public static void main(String[] args) {
        
        Course c1 = new Course(22, "Advanced Java", 4);
        Course c2 = new Course(11, "Intro Java", 4);
        Course c3 = new Course(44, "Distrubuted Java", 4);
        
//        List<Course> courses = new ArrayList<>();
//        courses.add(c1);
//        courses.add(c2);
//        courses.add(c3);
//        
//        Collections.sort(courses, new CourseByName());
//        
//        for(Course c : courses) {
//            System.out.println(c);
//        }
        
//        Course[] cArray = {c1, c2, c3};
//        Arrays.sort(cArray);
//        
//        for(Course c : cArray){
//            System.out.println(c);
//        }
//        
//        Map<String,Course> courses = new HashMap<>();
//        courses.put("Fav", c1);
//        courses.put("Simple", c2);
//        courses.put("wev", c3);
//        
//        Collection<Course> col = courses.values();
//        List<Course> list = new ArrayList<>(col);
//        Collections.sort(list);
//        
//        for(Course c : list) {
//            System.out.println(c);
//        }
        
        //
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        
        System.out.println("Unsorted list...");
        for(Course c : courses){
            System.out.println(c);
        }
        
        System.out.println("Sorted List...");
        Set<Course> set = new TreeSet<>(courses);
        courses = new ArrayList<>(set);
        
        for(Course c : courses){
            System.out.println(c);
        }
        
      
    }
}
