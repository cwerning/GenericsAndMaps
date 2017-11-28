/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import practice.Course;

/**
 *
 * @author cwerning
 */
public class ChallengeStartup {
    public static void main(String[] args) {
        /*1. Setup the Dog class in the
        GenericsAndMaps sample project
        to have a primary sort by 
        rabiesId. Then create 4 dog
        objects in a Startup class and
        put those in a TreeSet. Make sure
        you have one duplicate dog object.
        Then loop over the set and output
        the toString method to the console,
        showing all dog properties. Verify
        that the dogs are sorted by rabiesId
        and that there are no duplicates.*/
        
        Dog d1 = new Dog("Spot", 7, "7");
        Dog d2 = new Dog("Frank", 5, "115");
        Dog d3 = new Dog("Gunner", 7, "82");
        Dog d4 = new Dog("Frank", 5, "115");
        
        List<Dog> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);
        
     
        Set<Dog> set = new TreeSet<>(dogs);
        dogs = new ArrayList<>(set);
        
        for(Dog d : dogs){
            System.out.println(d);
        }

        /*
        2. Using the same Dog class from #1 above
           create an alternate sort to sort by
           dog name. Create the same 4 dog objects
           but this time store them in a List or
           take your set and pass that to a list 
           constructor. Now use the Collections
           class to sort your dog objects by name.
        */
        
//        Dog d1 = new Dog("Spot", 7, "7");
//        Dog d2 = new Dog("Frank", 5, "115");
//        Dog d3 = new Dog("Gunner", 7, "82");
//        Dog d4 = new Dog("Frank", 5, "115");
//        
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(d1);
//        dogs.add(d2);
//        dogs.add(d3);
//        dogs.add(d4);
//        
//        Collections.sort(dogs, new DogByName());
//        
//        for(Dog d : dogs) {
//            System.out.println(d);
//        }
        
        /*
        3. Put your Dog objects in a TreeMap as values.
        Then retrieve the values as a Collection from
        the map. Then convert the collection into
        a list and use the Collections.sort method to
        sort the list.
        */
        
//        Dog d1 = new Dog("Spot", 7, "117");
//        Dog d2 = new Dog("Frank", 5, "115");
//        Dog d3 = new Dog("Gunner", 7, "182");
//        Dog d4 = new Dog("Frank", 5, "115");
//        
//        Map<String,Dog> dogs = new TreeMap<>();
//        dogs.put("ChadsDog", d1);
//        dogs.put("JuliesDog", d2);
//        dogs.put("DadsDog", d3);
//        dogs.put("MomsDog", d4);
//        
//        Collection<Dog> col = dogs.values();
//        List<Dog> list = new ArrayList<>(col);
//        Collections.sort(list);
//        
//        for(Dog d : list) {
//            System.out.println(d);
//        }
//        
        
        /*
        Put your Dog objects in an array. Then sort
           the array using the Arrays.sort method.
        */
        
//        Dog d1 = new Dog("Spot", 7, "117");
//        Dog d2 = new Dog("Frank", 5, "115");
//        Dog d3 = new Dog("Gunner", 7, "182");
//        Dog d4 = new Dog("Frank", 5, "115");
//        
//        
//        Dog[] dogArray = {d1, d2, d3, d4};
//        Arrays.sort(dogArray);
//        
//        for(Dog d : dogArray){
//            System.out.println(d);
//        }
        
        
        
    }
}
